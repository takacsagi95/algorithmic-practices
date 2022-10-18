package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {

  public static void main(String[] args) {
    List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // 10 & 14
    miniMaxSum(lista);
  }

  public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int min = 0;
    int max = 0;
    int sum = 0;
    for (int i = 0; i < arr.size() - 1; i++) {
      for (int j = i+1; j < arr.size() - 1; j++) {
        sum += arr.get(i);
        if (sum < min) {
          min = sum;
        }
        else if (max < sum){
          max = sum;
        }
      }
    }
    System.out.print(max);
    System.out.print(" " + min);
  }

}
