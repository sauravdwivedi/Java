/** Consider the following version of Bubble Sort:
 *  for (int i = 0; i < n; i++) {
 *    for (int j = 0; j < n - 1; j++) {
 *      // Swap adjacent elements if they are in decreasing order
 *      if (a[j] > a[j + 1]) {
 *          swap(a[j], a[j + 1]);
 *      }
 *    }
 *  }
 *  Given an array of integers, sort the array in ascending order using
 *  the Bubble Sort algorithm above. Once sorted, print the following
 *  three lines:
 *
 *  Array is sorted in numSwaps swaps., where numSwaps is the number of
 *  swaps that took place.
 *
 *  First Element: firstElement, where firstElement is the first element
 *  in the sorted array.
 *
 *  Last Element: lastElement, where lastElement is the last element in
 *  the sorted array.
 *
 *  Hint: To complete this challenge, you must add a variable that keeps
 *  a running tally of all swaps that occur during execution.
 */
 
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
 
public class BubbleSort {
  public static void bubbleSort(ArrayList<Integer> arrayInt) {
  /** Method to count number of swaps to sort the array */
    int numSwaps = 0;
    for (int i=0; i < arrayInt.size(); i++) {
      for (int j=0; j < arrayInt.size()-1; j++) {
        if (arrayInt.get(j) > arrayInt.get(j+1)) {
          int left = arrayInt.get(j);
          arrayInt.set(j, arrayInt.get(j+1));
          arrayInt.set(j+1, left);
          numSwaps += 1;
        }
      }
    }
    System.out.println("Sorted array: " + arrayInt.toString());
    System.out.println("Array is sorted in " + numSwaps + " swaps.");
    System.out.println("First element: " + arrayInt.get(0));
    System.out.println("Last element: " + arrayInt.get(arrayInt.size()-1));
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter array of integers (space separated e.g. '1 2 3'): ");
    ArrayList<Integer> arrayInt = Stream.of(br.readLine().split(" "))
      .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
    System.out.println("Given array: " + arrayInt.toString());
    bubbleSort(arrayInt);
  }
}
