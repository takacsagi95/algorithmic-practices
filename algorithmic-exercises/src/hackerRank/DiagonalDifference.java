package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

  public static void main(String[] args) {
    List<List<Integer>> arr = new ArrayList<>(Arrays.asList(
        Arrays.asList(11, 2, 4),
        Arrays.asList(4, 5, 6),
        Arrays.asList(10, 8, -12)));
    // 15
    System.out.println(diagonalDifference(arr));

    List<List<Integer>> arr2 = new ArrayList<>(Arrays.asList(
        Arrays.asList(-1, 1, -7, -8),
        Arrays.asList(-10, -8, -5, -2),
        Arrays.asList(0, 9, 7, -1),
        Arrays.asList(4, 4, -2, 1)));
    // 1
    System.out.println(diagonalDifference(arr2));
  }

  public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int len = arr.size();
    int sumLeftRight = 0;
    int sumRightLeft = 0;

    for (int i = 0; i < arr.size(); i++) {
      for (int j = 0; j < arr.size(); j++) {
        if (i == j) {
          //System.out.println("i == j  " + i);
          //System.out.println("temporary i   " + arr.get(i).get(j));
          sumLeftRight += arr.get(i).get(j); // 0,0 1,1 2,2 3,3
        }
        if (i == len - j - 1) {
          // 0 = 4 - j - 1 ; 1 = 4 - j - 1 --> when az i=0 - j=3 or i=1 - j=3;  2 = 4 -2 -1;
          //System.out.println("len   " + len);
          //System.out.println("j   " + j);
          //System.out.println("i == len - j - 1  " + i);
          //System.out.println("temporary i   " + arr.get(i).get(j));
          sumRightLeft += arr.get(i).get(j);
        }
      }
    }
    //System.out.println("final result");
    return Math.abs( sumLeftRight - sumRightLeft);
  }

  public static int diagonalDifferenceForThree(List<List<Integer>> arr) {
    // Write your code here
    int n = arr.size();
    int sumLeftRight = 0;
    int sumRightLeft = 0;

    for (int i = 0; i < arr.size(); i++) {
      for (int j = 0; j < arr.size(); j++) {
        sumLeftRight = arr.get(0).get(1) + arr.get(1).get(1) + arr.get(2).get(2);
        System.out.println(sumLeftRight);
        sumRightLeft = arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0);
        System.out.println(sumRightLeft);
      }
    }
    return Math.abs(sumLeftRight) - Math.abs(sumRightLeft);
  }
}
