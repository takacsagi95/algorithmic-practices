package Practice;

import java.util.Arrays;

public class ThreeSmallest {

  public static void main(String[] args) {
    int[] arr = new int[]{3, 4, 6, 7, 2, 1};
    //System.out.println(Arrays.toString(getIndicesOfThreeSmallest(arr))); // 0, 4, 5
    System.out.println(Arrays.toString(getTheThreeSmallest(arr)));
    ThreeSmallest classObject = new ThreeSmallest();
    System.out.println(Arrays.toString(classObject.getIndicesOfThreeSmallest(arr)));
  }

  public int[] getIndicesOfThreeSmallest(int[] arr) {
    int[] originalArr = Arrays.copyOf(arr, arr.length);
    int[] smallestIndices = new int[3];
    int[] smallestNums = new int[3];
    Arrays.sort(arr);
    System.arraycopy(arr, 0, smallestNums, 0, 3);
    /* arraycopy is equal with this for loop:
    for (int i = 0; i < 3; i++) {
      smallestNums[i] = arr[i];
    }
     */
    for (int i = 0; i < originalArr.length; i++) {
      for (int j = 0; j < smallestNums.length; j++) {
        if (originalArr[i] == smallestNums[j]) {
          smallestIndices[j] = i;
        }
      }
    }
    return smallestIndices;
  }

  public static int[] getTheThreeSmallest(int[] arr) {
    int[] smallests = new int[3];
    Arrays.sort(arr);
    for (int i = 0; i < 3; i++) {
      smallests[i] = arr[i];
    }
    return smallests;
  }
}
