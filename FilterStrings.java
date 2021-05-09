/** Filter Strings: Given a list of strings, write a method that returns a list of all strings that
 *  start with the letter 'a' (lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas
 *  and Streams API's.
 */

import java.io.*;
import java.util.*;

class FilterStrings {
  public static void filString(String[] x) {
    Scanner s = new Scanner(System.in);
    int i = 0;
    int j = 0;
    System.out.print("["+Arrays.toString(x)+"]");
    System.out.print("\t Length of String: ");
    int n = s.nextInt();
    String[] z = new String[n];
    for (i = 0; i < n; i ++){
      if (x[i].length()==3 && (x[i].substring(0,1)).charAt(0)=='a') {
        z[i] = x[i];
      }
      else z[i] = "";
    }
    String[] y = Arrays.stream(z).filter(p -> !p.isEmpty()).toArray(String[]::new);
    System.out.print(Arrays.toString(y));
  }
    
  public static void main(String[] args) {
    int i = 0;
    Scanner s  =new Scanner(System.in);
    System.out.print("\t Length of String: ");
    int m = s.nextInt();
    String[] x = new String[m];
    for (i = 0; i < m; i ++){
      System.out.print("\t Enter the string: ");
      x[i] = s.nextLine();
    }
    filString(x);
  }
}

