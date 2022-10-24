package Practice;

public class SortingAlgorithms {

  public static void main(String[] args) {

  }

  // A bublesort algorithm
  public static void bubbleSort(int[] array){
    int len = array.length;
    int k;
    int temp;
    // Iterate through the list from the end to the starting point
    for (int i = len; i >= 0; i--) {
      for (int j = 0; j < len - 1; j++) {
        k = j + 1;
        if (array[j] > array[k]){
          swapNumbers(j, k, array);
        }
      }
    }
    for (int num : array) {
      System.out.println(num);
    }
  }

  public static int[] swapNumbers(int i, int j, int[] arr){
    int temp;
    // save the ith element into a variable
    temp = arr[i];
    // then write over the saved ith element
    arr[i] = arr[j];
    // take the ith element back into the array to a backward position
    arr[j] = temp;
    return arr;
  }

}
