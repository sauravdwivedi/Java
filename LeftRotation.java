/** A left rotation operation on an array shifts each of the array's
 *  elements 1 unit to the left. For example, if 2 left rotations are
 *  performed on array [1,2,3,4,5], then the array would become
 *  [3,4,5,1,2]. Note that the lowest index item moves to the highest
 *  index in a rotation. This is called a circular array.
 *
 *  Given an array a of n integers and a number, d, perform d left
 *  rotations on the array. Return the updated array to be printed
 *  as a single line of space-separated integers.
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Problem {
  public static List<Integer> oneLeftRot(List<Integer> a) {
    List<Integer> x = new ArrayList<Integer>();
    for (int j=0; j < a.size(); j++) {
      if (j < a.size()-1) {
        x.add(a.get(j+1));
      }
      else {
        x.add(a.get(0));
      }
    }
  return x;
  }
}

public class LeftRotation {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Length of array: ");
    int n = scan.nextInt();
    System.out.println("Enter array of integers (space separated): ");
    List<Integer> a = Stream.of(br.readLine().split(" ")).map(Integer::parseInt).collect(toList());
    System.out.println("Enter no. of rotations: ");
    int d = scan.nextInt();
    int c = 0;
    while (c < d) {
      List<Integer> z = Problem.oneLeftRot(a);
      c = c + 1;
      a = z;
    }
    System.out.println("Array after "+d+" left rotations: "+a);
  }
}
