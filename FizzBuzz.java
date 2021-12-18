/** Java script to print "Fizz" if a number is divisible by 3, print 
  * "Buzz" if a number is divisible by 5, and print "FizzBuzz" if a number 
  * is divisible by both 3 and 5 for numbers in a given range
  */
  
import java.io.*;
import java.util.*;

public class FizzBuzz {
  public static void fizzBuzz(int targetNum) {
    for (int x = 1; x < targetNum + 1; x++) {
      if ((x % 3 == 0) && (x % 5 == 0)) {
        System.out.println("FizzBuzz");
      }
      else if (x % 3 == 0) {
        System.out.println("Fizz");
      }
      else if (x % 5 == 0) {
        System.out.println("Buzz");
      }
      else {
        System.out.println(x);
      }
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter range of numbers: ");
    int targetNum = sc.nextInt();
    fizzBuzz(targetNum);
  }
}
