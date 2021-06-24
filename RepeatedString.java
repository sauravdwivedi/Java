/** There is a string, s, of lowercase English letters that is repeated
 *  infinitely many times. Given an integer, n, find and print the number of
 *  letter a's in the first n letters of the infinite string.
 *
 *  Example:
 *
 *  s = 'abcac'
 *  n = 10
 *
 *  The substring we consider is abcacabcac, the first 10 characters of the
 *  infinite string. There are 4 occurrences of a in the substring.
 */

import java.io.*;
import java.util.*;

class Problem {
  public static long repeatedString(String s, long n) {
    /** Method to count occurences of 'a' in first n characters */
    long remainder = (long) n % s.length();
    long ratio = (long) n / s.length();
    long result = (long) (s.substring(0,(int) remainder).chars().filter(ch -> ch == 'a').count() +
      ratio * s.chars().filter(ch -> ch == 'a').count());
    return result;
  }
}

public class RepeatedString {
  public static void main(String[] args) {
    System.out.println("Enter string: ");
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    System.out.println("Enter integer: ");
    long n = scanner.nextLong();
    long result = Problem.repeatedString(s, n);
    System.out.println("The number of occurences of 'a' in first $n characters: ");
    System.out.println(result);
  }
}
