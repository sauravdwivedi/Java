/** You are given a string containing characters A and B only. Your
 *  task is to change it into a string such that there are no
 *  matching adjacent characters. To do this, you are allowed to
 *  delete zero or more characters in the string.
 *
 *  Your task is to find the minimum number of required deletions.
 *
 *  Example:
 *  s = AABAAB
 *
 *  Remove an A at positions 0 and 3 to make s = ABAB in 2
 *  deletions.
 */
 
import java.io.*;
import java.util.*;

class AlternatingCharacters {
  public static int altChar(String s) {
    /** Method to find min no. of deletions */
    String x = Character.toString(s.charAt(0));
    for (int i = 0; i < s.length()-1; i++) {
      if (s.charAt(i+1) != s.charAt(i)) {
        x = x + Character.toString(s.charAt(i+1));
      }
    }
    int deletions = s.length() - x.length();
    return deletions;
  }

  public static void main(String[] args) {
    System.out.print("Enter string: ");
    Scanner w = new Scanner(System.in);
    String s = w.nextLine();
    System.out.print(altChar(s));
  }
}
