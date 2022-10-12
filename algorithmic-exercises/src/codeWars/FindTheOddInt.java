package codeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheOddInt {
  /*
  Given an array of integers, find the one that appears an odd number of times.
  There will always be only one integer that appears an odd number of times.
   */
  public static void main(String[] args) {
    ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5));
    int[] numLista = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
    System.out.println(findIt(numLista));
  }

  public static int findIt(int[] a) {
    // Find the number what appears an odd number times in the list
    int odd = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 != 0){
        odd += 1;
      }
    }
    return odd;
  }

}
