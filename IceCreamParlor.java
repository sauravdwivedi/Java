/** Each time Sunny and Johnny take a trip to the Ice Cream Parlor,
 *  they pool their money to buy ice cream. On any given day, the parlor
 *  offers a line of flavors. Each flavor has a cost associated with it.
 *  Given the value of money and the cost of each flavor for t trips to
 *  the Ice Cream Parlor, help Sunny and Johnny choose two distinct
 *  flavors such that they spend their entire pool of money during each
 *  visit. ID numbers are the 1-based index number associated with a
 *  cost. For each trip to the parlor, print the ID numbers for the two
 *  types of ice cream that Sunny and Johnny purchase as two
 *  space-separated integers on a new line. You must print the smaller
 *  ID first and the larger ID second.
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Problem {
  public static String iceCream(List<Integer> cost, int money) {
    ArrayList<String> z = new ArrayList<String>();
    for (int i=1; i<cost.size(); i++) {
      for (int j=i+1; j<cost.size(); j++) {
        if (cost.get(i-1) + cost.get(j-1) == money) {
          z.add(i+" "+j);
        }
      }
    }
    Collections.sort(z);
    return z.toString();
  }
}

public class IceCreamParlor {
  public static void main(String[] args) throws IOException {
    try {
      FileInputStream inputFile =
        new FileInputStream("IceCreamParlor_input.txt");
      Scanner sc = new Scanner(inputFile);
      ArrayList<String> lines = new ArrayList<String>();
      while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
      }
      List<List<Integer>> x = new ArrayList<List<Integer>>();
      for (String line : lines) {
        x.add(Stream.of(line.split(" ")).map(String::trim).
          map(Integer::parseInt).collect(Collectors.toList()));
      }
      int t = x.get(0).get(0);
      int j = 0;
      for (int i=0; i<t; i++) {
        int money = x.get(1+j).get(0);
        int n = x.get(2+j).get(0);
        List<Integer> cost = x.get(3+j);
        j = j + 3;
        System.out.println("ID numbers of costs: "+
          Problem.iceCream(cost, money));
      }
      sc.close();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
