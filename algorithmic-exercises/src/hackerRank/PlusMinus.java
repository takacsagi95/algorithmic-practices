package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>(Arrays.asList(-4, 3, -9, 0, 4, 1));
    // 0.500000
    // 0.333333
    // 0.166667
    plusMinus(arr);
  }

  public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float len = arr.size();
    float p = 0;
    float n = 0;
    float z = 0;
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) < 0) {
        n += 1;
      } else if (arr.get(i) == 0) {
        z += 1;
      } else if (arr.get(i) > 0) {
        p += 1;
      }
    }
    System.out.print(p / len + " ");
    System.out.print(n / len+ " ");
    System.out.print(z / len+ " ");
  }

}
