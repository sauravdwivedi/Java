/** The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely
 *  communicate with his generals. Each letter is replaced by another letter N positions down
 *  the english alphabet. For example, for a rotation of 5, the letter 'c' would be replaced by
 *  an 'h'. In case of a 'z', the alphabet rotates and it is transformed into a 'd'. Implement a
 *  decoder for the Ceasar cipher where N = 5.
 */

import java.io.*;
import java.util.*;

public class CeasarCipher {
  public static void ceasarCiph(int n) {
    String x = "abcdefghijklmnopqrstuvwxyz";
    System.out.print("Enter decoded message: ");
    Scanner s = new Scanner(System.in);
    String y = s.nextLine();
    int i = 0;
    int j = 0;
    String z = "";
    for (i = 0; i < x.length(); i ++) {
      for (i = 0; i < y.length(); i ++) {
        if (y.substring(j) == x.substring(i)) {
          if (i < n) {
            z = z + x.substring(x.length() + i - n);
          }
          else {z = z + x.substring(i-n);
          };
        };
      };
    }
    System.out.print("Decoded message: ");
    System.out.print(z);
  }
    
  public static void main(String[] args) {
    System.out.print("Enter rotation number: ");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    ceasarCiph(n);
  }
}

