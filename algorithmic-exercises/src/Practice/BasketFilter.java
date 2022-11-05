package Practice;

import java.util.Arrays;

public class BasketFilter {

  public static void main(String[] args) {
    Integer[] arr = new Integer[]{4, 2, 7, 4, 2, 3};
    System.out.println(Arrays.toString(basketFilter(arr, 15)));
  }
  // 4, 2, 7, 4, 2, 3 output 4, 2, 7, 2

  public static Integer[] basketFilter(Integer[] arr, Integer maxLimit) {
    int sum = 0;
    int cycles = 0;
    Integer[] newArr = new Integer[arr.length];
    for (Integer num : arr) {
      sum += num;
      if (sum <= 15) {
        newArr[cycles] = num;
      } else {
        sum -= num;
      }
      cycles += 1;
    }
    return newArr;
  }

  // Same for workong with arraylists:

  public static Integer[] basketFilterWithArrayList(Integer[] arr, Integer maxLimit){
    int sum = 0;
    int cycles = 0;
    Integer[] newArr = new Integer[arr.length];
    for (Integer num : arr) {
      sum += num;
      if (sum <= 15) {
        newArr[cycles] = num;
      } else {
        sum -= num;
      }
      cycles += 1;
    }
    return newArr;
  }
}
