/** The program takes an integer, and provides its nth facotor.
 */

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

  class PthFactor {
    public static void pthFactor(int n, int p) {
    int count = 0;
    int i;
    for (i = 1; i < n; i ++) {
      if (n % i == 0) {
        count = count + 1;
      };
    }
    int[] x = new int[count];
    int j = 0;
    for (i = 1; i < n; i ++) {
      if (n % i == 0) {
        x[j] = i;
        j=j+1;
      };
    }
    System.out.print("\t The factors: ");
    System.out.print(Arrays.toString(x));
    if (count < p) {
      System.out.print("\n\t 0");
    }
    if (p <= count) {
    System.out.print("\n \t pth factor: ");
    int pth = x[p-1];
    System.out.print(pth);
    }
    return;
  }
      
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("\t Enter n: ");
  int n = s.nextInt();
  System.out.print("\t Enter p: ");
  int p = s.nextInt();
  pthFactor(n, p);
  }
}

