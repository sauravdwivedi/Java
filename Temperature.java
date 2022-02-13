/** Given mean temperatures on days, find out longest sequence of days with
 *  min and max mean temperature difference within 5 degrees. Example:
 *
 *  Input:
 *
 *  temperatures = [7, 12, 5, 3, 11, 6, 10, 2, 9]
 *  days = [0, 1, 2, 3, 4, 5, 6, 7, 8]
 *
 *  Output:
 *
 *  The sequence of days 4 to 6 has difference between maximum and minimum mean 
 *  temperatures within 5 degrees with length of sequence 2, which is longest. 
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Temperature {
  private int maxInDay;
  private int maxFinDay;
  
  void Solution(int numDays, Map<Integer, Integer> temDay) {
    int maxLenSeq = 0;
    for (int i=0; i < numDays; i++) {
      int lenSeq = 0;
      int minTem = temDay.get(i);
      int maxTem = temDay.get(i);
      for (int j=i+1; j < numDays; j++) {
        if (temDay.get(j) > maxTem) {
          maxTem = temDay.get(j);
        }
        if (temDay.get(j) < minTem) {
          minTem = temDay.get(j); 
        }
        if (maxTem - minTem <= 5) {
          lenSeq = j - i;
          if (lenSeq > maxLenSeq) {
            maxLenSeq = lenSeq;
            this.maxInDay = i;
            this.maxFinDay = j;            
          }
        }
        else {
          break;
        }
      }
    }
  }
  
  int maxInDay() {
    return this.maxInDay;
  }
  
  int maxFinDay() {
    return this.maxFinDay;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter temperatures on days separated"
      + "by space (e.g. '7 12 5 3'): ");
    List<Integer> tempOnDay = Stream.of(br.readLine().split(" "))
      .map(Integer::parseInt).collect(toList());
    int numDays = tempOnDay.size();
    Map<Integer, Integer> temDay = new HashMap<Integer, Integer>();
    for (int i=0; i<numDays; i++) {
      temDay.put(i, tempOnDay.get(i));
    }
    Temperature obj = new Temperature();
    obj.Solution(numDays, temDay);
    System.out.println("Initial day: " + obj.maxInDay());
    System.out.println("Final day: " + obj.maxFinDay());
  }
}
