package codeWars;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeparateTheWheatFromTheChaff {

  /*
  Given a sequence of n integers , separate the negative numbers (chaff) from positive ones (wheat).
  Notes:
  Sequence size is at least 3
  Return a new sequence, such that negative numbers (chaff) come first, then positive ones (wheat).
  In Java , you're not allowed to modify the input Array/list/Vector
  Have no fear , it is guaranteed that there will be no zeroes
  Repetition of numbers in the input sequence could occur , so duplications are included when separating.
  If a misplaced positive number is found in the front part of the sequence,
  replace it with the last misplaced negative number (the one found near the end of the input).
  The second misplaced positive number should be swapped with the second last misplaced negative number.
  Negative numbers found at the head (beginning) of the sequence, should be kept in place.

   wheatFromChaff ({7, -8, 1 ,-2}) ==> return ({-2, -8, 1, 7})

   wheatFromChaff ({-31, -5, 11 , -42, -22, -46, -4, -28 })
   ==> return ({-31, -5,- 28, -42, -22, -46 , -4, 11})
   */
  public static void main(String[] args) {
    long[] longList = new long[]{-7, -8, 1, -2};

    //bubbleSort(new long[]{4, 3, 5, 9, -3, -5});
    //16, 25, -48, -47, -37, 41, -2  ==>  -2, -37, -48, -47, 25, 41, 16
    wheatFromChaff(longList);
    //wheatFromChaff(new long[]{16, 25, -48, -47, -37, 41, -2});
  }

  public static long[] wheatFromChaff(long[] values) {
    int len = values.length; // length of the values list
    long temp;
    // from the starting point
    for (int i = 0; i < len; i++) {
      // from the end
      for (int j = len - 1; j <= 0; j++) {
        if (values[i] > 0) {
          if (0 > values[j]) {
            temp = values[i];
            values[i] = values[j];
            values[j] = temp;
          }
        }
      }
    }
    for (long num : values) {
      System.out.println(num);
    }
    return values;
  }

/*
    for (int i = 0; i < len; i++) {
      if (0 < values[i]) {
        if (values[len - 1] < 0){
          temp = values[i];
          values[i] = values[len - 1];
          values[len - 1] = temp;
        } else {
          for (int j = len - 1; j <= 0; j++) {
            if (values[i] < 0){
              temp = values[i];
              values[i] = values[len - 1];
              values[len - 1] = temp;
            }
          }
        }
      }
    }
------------------------------------------------
    for (int i = len - 1; i >= 0 ; i--) {
      // iterate through from the start
      for (int j = 0; j < len - 1; j++) {
        if (values[j] > 0) {
          if (values[i] < 0) {
            // i from the END
            // j from the START
            temp = values[i];
            values[i] = values[j];
            values[j] = temp;
          }
        }
      }
    }
 */

  public static long[] separate(long[] values) {
    values = Arrays.copyOf(values, values.length);
    int r = values.length - 1;
    for (int l = 0; l < r; l++) {
      while (values[l] > 0 && l < r) {
        if (values[r--] < 0) {
          long temp = values[l];
          values[l] += values[r + 1] - temp;
          values[r + 1] = temp;
        }
      }
    }
    return values;
  }

  @Test
  public void test_separating_is_successful() {
    Assertions.assertEquals(new long[]{-6, -4, 2, 6}, this.separate(new long[]{2, -4, 6, -6}));
  }
}
