package Practice;

import java.util.Arrays;

public class symmetricMatrix {

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(fillUpMatrix(5)));
  }

  public static Integer[][] fillUpMatrix(Integer n) {
    Integer[][] matrix = new Integer[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = Math.abs(i - j);
      }
    }

    return matrix;
  }
}
