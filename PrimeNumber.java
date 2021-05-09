/** Prime Number: A prime number is a natural number greater than 1 that has no positive
 *  divisors other than 1 and itself. Write a method that checks if a number is a prime number.
 */

import java.io.*;
import java.util.Scanner;

public class PrimeNumber {
  public static void primeFun(int n) {
    int i;
    boolean x = true;
    for (i=2; i<n; i++) {
      if (n % i == 0) x = false;
    }
    if (x) System.out.println("Number is Prime!");
    else System.out.println("Number is NOT prime!");
    if (n % 2 == 0) System.out.println("Number is Even!");
    else System.out.println("Number is Odd!");
    return;
  }
    
  public static void main (String[] args){
    int m;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number: ");
    m=s.nextInt();
    primeFun(m);
  }    
}
