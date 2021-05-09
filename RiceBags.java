/** Package Rice Bags: Provided that you have a given number of small rice bags (1 kilo
 *  each) and big rice bags (5 kilos each), write a method that returns true if it is possible to
 *  make a package with goal kilos of rice.
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class RiceBags {
  public static void riceBags(int m, int n, int p) {
    int i = 0;
    int j = 0;
    boolean x=false;
    for (i = 1; i < p; i ++){
      for (j = 1; i < p; j++){
        if (p == i*m + j*n) {
          x = true;
        };
      };
    }
    if (x) System.out.print("\t It is possible to make target goal from small bags!");
    else System.out.print("\t It is NOT possible to make target goal from small bags!");
  }
    
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("\t Enter first bag size (in Kilo): ");
    int m=s.nextInt();
    System.out.print("\t Enter second bag size (in Kilo): ");
    int n=s.nextInt();
    System.out.print("\t Enter target bag size (in Kilo): ");
    int p=s.nextInt();
    riceBags(m,n,p);
  }
}
