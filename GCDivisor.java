/** Greatest Common Divisor: The Greatest Common Divisor of two positive integers is the
 *  largest integer that divides both without remainder. Write a method that returns the
 *  Greatest Common Divisor of p and q.
 */

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class GCDivisor {
  public static void gcDiv(int n, int m) {
    int i = 0;
    int j = 0;
    int z = 0;
    int[] x = new int[m+n];
    for (i = 1; i < (m+n); i ++) {
      if (n % i == 0 && m % i == 0) {
        x[j] = i;
        j = j+1;
      };
    };
    for (i = 1; i < (m+n); i ++) {
      if (x[i] > z) {
        z = x[i];
      };
    }
    System.out.print("\t Greatest common divisor: "+z+"\n");
  }
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("\t Enter first number: ");
    int n = s.nextInt();
    System.out.print("\t Enter second number: ");
    int m = s.nextInt();
    gcDiv(n,m);
  }
}

