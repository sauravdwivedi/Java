/** Comma Separated: Write a method that returns a comma-separated string
 * based on a given list of integers. Each element should be preceded by the letter
 * 'e' if the number is even, and preceded by the letter 'o' if the number is odd.
 * For example, if the input list is (3,44), the output should be 'o3,e44'.
 */

import java.io.*;
import java.util.*;

public class CommaSep {
  public static void comSep(int[] x) {
    int i = 0;
    String y = "";
    for (i = 0; i < x.length; i ++) {
      if (x[i] % 2 == 0) {
        y = y + "e" + x[i] + ",";
      } else {
        y = y + "o" + x[i] + ",";
        };
      }
    System.out.print(y);
  }
    
  public static void main(String[] args) {
    int i = 0;
    System.out.print("Enter length of List: ");
    Scanner s = new Scanner(System.in);
    int[] x = new int[s.nextInt()];
    for (i = 0; i < x.length; i ++) {
      System.out.print("Enter number: ");
      x[i] = s.nextInt();
    }
    comSep(x);
  }
}
