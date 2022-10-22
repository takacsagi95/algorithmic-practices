package codeWars;

import java.util.Arrays;

public class FindUniqueNumber {

  public static void main(String[] args) throws Exception {

    double[] testNums1= {0, 1, 0};
    double[] testNums2 = new double[]{1, 1, 1, 2, 1, 1};
    double[] testNums3 = new double[] {7, 7, 7, 7, 7, 7, 8};
    System.out.println(findUniq(testNums1));
    System.out.println(findUniq(testNums2));
    System.out.println(findUniq(testNums3));
  }
  public static double findUniq(double[] arr) {
    /*
    There is an array with some numbers. All numbers are equal except for one. Try to find it!
     */
    double uniNum = arr[0];
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1] && arr[i - 1] == arr[i + 1]){
        uniNum = arr[i];
      }
      if (arr[arr.length - 1] != arr[arr.length - 2] && arr[arr.length - 2] == arr[arr.length - 3]) {
        uniNum = arr[arr.length - 1];
      }
    }
    return uniNum;
  }

}
