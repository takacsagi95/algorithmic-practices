package codeWars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PascalsTriangle {
  /*
  Write a function that, given a depth n, returns n top rows of Pascal's Triangle flattened into
  a one-dimensional list/array.
  Examples:
  n = 1: [1]
  n = 2: [1,  1, 1]
  n = 4: [1,  1, 1,  1, 2, 1,  1, 3, 3, 1]
   */
  public static void main(String[] args) {
    generate(4);
    System.out.println(generate(4));
  }
  public static List<Long> generate(int level) {
    /* long[]
    Algorithm:
      Take a number of rows to be printed, assume it to be n
      Make outer iteration i from 0 to n times to print the rows.
      Make inner iteration for j from 0 to (N – 1).
      Print single blank space ” “
      Close inner loop (j loop) //it’s needed for left spacing
      Make inner iteration for j from 0 to i.
      Print nCr of i and j.
      Close inner loop.
      Print newline character (\n) after each inner iteration.
     */
    long[] resultList = new long[] {}; // list to collect the rows which are needed to return

    List<List<Long>> triangle = new ArrayList<>();
    /*
        if (level == 0){
      return ;
    }
     */

    List<Long> firstRow = new ArrayList<>();
    firstRow.add((long) 1);
    triangle.add(firstRow);

    for (int i = 1; i < level; i++) {
      List<Long> prevRow = triangle.get(i-1);
      List<Long> row = new ArrayList<>();
      row.add((long) 1);
      for (int j = 1; j < i; j++) {
        row.add(prevRow.get(j-1) + prevRow.get(j));
      }
      row.add((long) 1);
      triangle.add(row);
    }

    List<Long> triangleList = triangle.stream().flatMap(List::stream).collect(Collectors.toList());
    return triangleList;
  }

}
