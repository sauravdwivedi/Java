/** A staircase of size (say n = 5) is combination of white spaces and #:
 *
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 *
 *  where number of #'s at bottom is equal to n. Whrite a method to print
 *  a staircase for a given integer n as input.
 */

import java.io.*;
import java.util.*;

class StairCase {
  private String stairCase(int stairCaseSize) {
    String stairCase = "";
    for (int i = 1; i < stairCaseSize + 1; i++) {
      for (int j = 0; j < stairCaseSize - i; j++) {
        stairCase += " ";
      }
      for (int k = 0; k < i; k++) {
        stairCase += "#";
      }
      stairCase += "\n";
    }
    return stairCase;
  }
    
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    System.out.print("Size of staircase: ");
    int stairCaseSize = scan.nextInt();
    StairCase obj = new StairCase();
    String result = obj.stairCase(stairCaseSize);
    System.out.println("The staircase of size " + stairCaseSize + "!");
    System.out.print(result);
  }
}
