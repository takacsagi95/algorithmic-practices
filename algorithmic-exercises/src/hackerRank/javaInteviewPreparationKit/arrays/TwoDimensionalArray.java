package hackerRank.javaInteviewPreparationKit.arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArray {

  /*
  1 1 1 0 0 0
  0 1 0 0 0 0
  1 1 1 0 0 0
  0 0 2 4 4 0
  0 0 0 2 0 0
  0 0 1 2 4 0
   */

  public static void main(String[] args) {

  }

  public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    int sumHourGlasses = 0;
    List<Integer> sumList = new ArrayList<>();
    int maximum = Integer.MIN_VALUE;
    // outer loop for ROW
    for (int i = 0; i < arr.size()-2; i++) {
      // inner loop for COLUMN
      for (int j = 0; j < arr.size()-2; j++) {
        List<Integer> topCenter = arr.get(i + 1);
        sumHourGlasses =
            (arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)) // top row
                + arr.get(i + 1).get(j + 1) // center row
                + (arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2)); // bottom row
        maximum = Math.max(maximum, sumHourGlasses);
      }
    }
    return maximum;
  }

}

