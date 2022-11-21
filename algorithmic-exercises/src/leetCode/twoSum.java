package leetCode;

import java.util.Arrays;

class twoSum {

  public static void main(String[] args) {
    int[] nums_first = {2,7,11,15};
    int target_first = 9;
    //System.out.println(Arrays.toString(twoSum(nums_first, target_first)));
    int[] nums = {3,2,3};
    int target = 6;
    System.out.println(Arrays.toString(twoSum(nums, target)));
  }

  public static int[] twoSum(int[] nums, int target) {
    int[] sol = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          sol[0] = i;
          sol[1] = j;
          return sol;
        }
      }
    }
    return sol;
  }
}