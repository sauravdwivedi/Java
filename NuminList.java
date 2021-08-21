/** Java program to check if a number exists in a given list!
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class NuminList {
  public static void numinList(List<Integer> x, int k) {
    int count = 0;
    for (int j : x) {
      if (j == k) {
        count += 1;
      }
    }
    if (count != 0) {
      System.out.println("\t Number is in list!\n");
    }
    else {
      System.out.println("\t Number is NOT in list\n");
    }
    return;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner scan = new Scanner(System.in);
    System.out.println("\t Length of list: ");
    int n = scan.nextInt();
    System.out.println("\t Enter list(space separated): ");
    List<Integer> x = Stream.of(br.readLine().split(" ")).map(Integer::parseInt).collect(toList());
    System.out.println("\n\t Enter number to check if it is in list: ");
    int k = scan.nextInt();
    numinList(x, k);
  }
}

