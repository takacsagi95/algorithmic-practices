package Practice;

import java.util.Arrays;

public class MatrixWithIncreasingNums {

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(fillUp(4)));
  }

  public static int[][] fillUp(Integer n) {
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = i + j;
      }
    }
    return matrix;
  }
}
