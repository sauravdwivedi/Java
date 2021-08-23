/** Write a method that checks if there is at least one pair of
 *  numbers which sum equals target. arr=[1, 3, 4] and target=5
 *  result is true because the pair (1,4) sums to five.
 */
 
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class TwoSum {
  public static void twoSum(List<Integer> x, int n, int t) {
    int p = 0;
    for (int i=0; i<n-1; i++) {
      for (int j=i+1; j<n; j++) {
        List<Integer> y = new ArrayList<Integer>();
        y.add(x.get(i));
        y.add(x.get(j));
        if (y.stream().mapToInt(k -> k).sum() == t){
          p = p + 1;
        }
        else {
          p = p + 0;
        }
      }
    }
    if (p != 0) {
    System.out.println("At least one pair sums to "+t);
    }
    else System.out.println("No pair sums to "+t);
  }

  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Array length: ");
    int n = scan.nextInt();
    System.out.println("Enter array (space separated): ");
    List<Integer> x = Stream.of(br.readLine().split(" ")).map(Integer::parseInt).collect(toList());
    System.out.println("Enter target: ");
    int t = scan.nextInt();
    twoSum(x, n, t);
  }
}
