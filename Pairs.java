/** Given an array of integers and a target value, determine the number of pairs
 *  of array elements that have a difference equal to the target value.
 *
 *  Example:
 *  k = 1
 *  arr = [1,2,3,4]
 *
 *  There are three values that differ by k=1: 2-1=1, 3-2=1, and 4-3=1. Return 3.
 */
 
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Problem {
  public static int pairs(int k, List<Integer> arr) {
    /**Method to find number of pairs that have diff equal to target*/
    Set<Integer> arrSet = new HashSet<>(arr);
    int count = 0;
    for (int x : arrSet) {
      if (arrSet.contains(x+k)) {
        count = count + 1;
      }
    }
    return count;
  }
}

public class Pairs {
    public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter target value k: ");
    int k = scan.nextInt();
    System.out.println("Enter array of integers: ");
    List<Integer> arr = Stream.of(br.readLine().split(" ")).map(Integer::parseInt).collect(toList());
    int result = Problem.pairs(k, arr);
    System.out.println("Number of pairs with difference k are:");
    System.out.println(result);
  }
}
