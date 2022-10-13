package codeWars;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheOddInt {
  /*
  Given an array of integers, find the one that appears an odd number of times.
  There will always be only one integer that appears an odd number of times.
   */
  public static void main(String[] args) {
    int[] numList1 = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}; // 5
    int[] numList2 = new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}; // -1
    System.out.println(findIt(numList1));
  }

  public static int findIt(int[] a) {
    // Find the number what appears an odd number times in the list
    HashMap<Integer, Integer> occurrence = new HashMap<>();
    int odd = 0;
    for (int i = 0; i < a.length; i++) {
      if (!occurrence.containsKey(a[i])){
        occurrence.put(a[i], 1);
      } else {
        occurrence.replace(a[i], occurrence.get(a[i])+1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : occurrence.entrySet())
      if (entry.getValue() % 2 != 0){
        odd = entry.getKey();
      }
    return odd;
  }

  @Test
  public void test_find_odd_occurrence() {
    Assertions.assertEquals(5, findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    Assertions.assertEquals(-1, findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    Assertions.assertEquals(5, findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));

  }

}
