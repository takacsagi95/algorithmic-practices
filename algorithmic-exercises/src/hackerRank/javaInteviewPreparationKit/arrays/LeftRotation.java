package hackerRank.javaInteviewPreparationKit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {

  /*
  A left rotation operation on an array shifts each of the array's elements 1 unit to the left.
  For example, if 2 left rotations are performed on array [1,2,3,4,5],
  then the array would become [3,4,5,1,2].
  Note that the lowest index item moves to the highest index in a rotation.
  This is called a circular array.

  Given an array  of  integers and a number, d, perform  left rotations on the array.
  Return the updated array to be printed as a single line of space-separated integers.

  Function Description

  Complete the function rotLeft in the editor below.
  rotLeft has the following parameter(s):
  int a[n]: the array to rotate
  int d: the number of rotations
  Returns
  int a'[n]: the rotated array
  Input Format
  The first line contains two space-separated integers n and d, the size of  and the number of left
  rotations.
  The second line contains n space-separated integers, each an a[i].
  Sample Input
  5 4
  1 2 3 4 5
  Sample Output
  5 1 2 3 4
   */
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    int d = 3;
    System.out.println(rotLeft(a, d));

  }

  public static List<Integer> rotLeft(List<Integer> a, int d) {
    for (int i = 0; i < d; i++) {
      int zerothElement = a.get(0);
      a.remove(0);
      a.add(a.size(), zerothElement);
    }
    return a;
  }

  public static List<Integer> rotateLeftWithoutLoop(List<Integer> a, int d) {
    return null;
  }
}
