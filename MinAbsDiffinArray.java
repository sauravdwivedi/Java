/** The absolute difference is the positive difference between two
 *  values a and b, is written |a-b| or |b-a| and they are equal. If
 *  a = 3 and b = 2, |3-2| = |2-3| = 1. Given an array of integers,
 *  find the minimum absolute difference between any two elements in
 *  the array."""
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Problem {
  public static int minAbsDiff(List<Integer> a) {
    /** Method to find minimum absolute difference */
    List<Integer> absDiff = new ArrayList<Integer>();
    for (int i=0; i < a.size() - 1; i++) {
      for (int j=i+1; j < a.size(); j++) {
        absDiff.add(Math.abs(a.get(i)-a.get(j)));
      }
    }
    return Collections.min(absDiff);
  }
}

public class MinAbsDiffinArray {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter array (space separated): ");
    List<Integer> a = Stream.of(br.readLine().split(" ")).map(Integer::parseInt).collect(toList());
    System.out.println("Minimum absolute difference btw two values: "+Problem.minAbsDiff(a));
  }
}
