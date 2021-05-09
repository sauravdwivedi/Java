/** Fibonacci Number: Write a method that returns the nth element of the Fibonacci
 *  Sequence. The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21,
 *  34,... The next number is found by adding up the two numbers before it. Assume that
 *  indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ...
 */

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Fibonacci{
  public static long fibNum(long n, long p) {
    int i;
    int[] x = new int[n];
    x[0] = 0;
    x[1] = 1;
    for (i = 2; i < n; i++) {
      x[i] = x[i-1]+x[i-2];
    }
      System.out.println(Arrays.toString(x));
    return x;
  }
    
  public static void main (String[] args) {
    int m;
    Scanner s = new Scanner(System.in);
    System.out.println("\t Enter number: ");
    m = s.nextInt();
    fibNum(m);
  }
}
