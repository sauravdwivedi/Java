/** Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy
 *  some. There are a number of different toys lying in front of him, tagged with their prices. Mark has only
 *  a certain amount to spend, and he wants to maximize the number of toys he buys with this money.
 *  Given a list of toy prices and an amount to spend, determine the maximum number of gifts he can buy.
 *
 *  Note. Each toy can be purchased only once.
 *
 *  Example:
 *
 *  prices = [1,2,3,4]
 *  k = 7
 *
 *  The budget is 7 units of currency. He can buy items that cost [1, 2, 3] for 6, or [3, 4] for 7 units. The
 *  maximum is 3 items.
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Problem {
  public static int markandToys(List<Integer> prices, int k) {
    /**Method to return maximum number of gifts for a given budget */
    Collections.sort(prices);
    int n = prices.size();
    List<Integer> lenList = new ArrayList<Integer>();
    List<Integer> subList = new ArrayList<Integer>();
    subList.add(0);
    int i = 1;
    while (subList.parallelStream().reduce((a,b)->a+b).get() <= k) {
      lenList.add(subList.size());
      subList = prices.subList(0, i);
      i = i + 1;
    }
    return Collections.max(lenList);
  }
}
    
public class MarkandToys {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter prices: ");
    List<Integer> prices = Stream.of(br.readLine().split(" ")).map(Integer::parseInt).collect(toList());
    System.out.println("Enter amount to spend: ");
    int k = scan.nextInt();
    int result = Problem.markandToys(prices, k);
    System.out.println(result);
  }
}
