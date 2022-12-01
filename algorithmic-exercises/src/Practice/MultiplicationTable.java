package Practice;

import java.util.Arrays;

public class MultiplicationTable {

  /*
  Create a function called generateMultiplicationTable that takes an integer as an input and returns a matrix
  (array of arrays) representing the multiplication table with a size of the given integer.

  Example cases:

  generateMultiplicationTable(2);
  Should return:

  [
    [1, 2],
    [2, 4]
  ]
  generateMultiplicationTable(3);
  Should return:

  [
    [1, 2, 3],
    [2, 4, 6],
    [3, 6, 9]
  ]
   */
  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(multiplicationTable(3)));
    System.out.println(Arrays.deepToString(multiplicationTable(10)));
  }

  public static Integer[][] multiplicationTable(Integer n) {
    Integer[][] table = new Integer[n][n];
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < n + 1; j++) {
        table[i-1][j-1] = i * j;
      }
    }
    return table;
  }
}

