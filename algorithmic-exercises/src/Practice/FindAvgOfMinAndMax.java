package Practice;

import java.util.Arrays;

public class FindAvgOfMinAndMax {

  public static void main(String[] args) {
    System.out.println(findAverageOfMinAndMax(new Integer[]{1, 2, 3, 5}));
  }

  public static Integer findAverageOfMinAndMax(Integer[] input) {
    Integer min = 0;
    Integer max = 0;
    Arrays.sort(input);
    min = input[0];
    max = input[input.length - 1];
    Integer average = (max + min) / 2;
    return average;
  }
}
