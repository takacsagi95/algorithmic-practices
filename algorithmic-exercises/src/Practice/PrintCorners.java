package Practice;

import java.util.Arrays;

public class PrintCorners {

  public static void main(String[] args) {
    Integer[][] input = new Integer[][]{
        {1, 2, 3},
        {1, 2, 3}
    };

    Integer[][] longInput = new Integer[][]{
        {1, 2, 3},
        {4, 5, 6},
        {1, 2, 3}
    };

    System.out.println(Arrays.deepToString(printCorners(input)));
    System.out.println(Arrays.deepToString(printCorners(longInput)));
  }

  public static Integer[][] printCorners(Integer[][] input) {

    Integer[][] cornerVals = new Integer[2][2];

    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input[i].length; j++) {

        if (i == 0 && j == 0) {
          cornerVals[0][0] = input[i][j];
        }
        if (i == 0 && j == input[i].length - 1) {
          cornerVals[0][1] = input[i][j];
        }
        if (i == input.length - 1 && j == 0) {
          cornerVals[1][0] = input[i][j];
        }
        if (i == input.length - 1 && j == input[i].length - 1) {
          cornerVals[1][1] = input[i][j];
        }
      }
    }
    return cornerVals;
  }
}
