package Practice;

import java.util.Arrays;

public class ZipMerge {

  public static void main(String[] args) {
    String[] one = new String[] {"apple", "pear"};
    String[] two = new String[] {"dog", "cat"};
    String[] three = new String[] {"apple", "pear", "peach"};
    System.out.println(Arrays.toString(zipMerge(one, two)));
    System.out.println(Arrays.toString(zipMerge(three, two)));
    System.out.println(Arrays.toString(zipMerge(two, three)));
  }
  public static String[] zipMerge(String[] list1, String[] list2){
    String[] merged = new String[list1.length + list2.length];
    int len = list1.length + list2.length;
    int count = 0;

    for (int i = 0; i < len; i++) {
      if (i < list1.length) {
        merged[count] = list1[i];
        count++;
      }
      if (i < list2.length) {
        merged[count] = list2[i];
        count++;
      }
    }
    return merged;
  }
}
/*
    while (count <= list1.length + list2.length) {
      for (int i = 0; i < list1.length; i++) {
        for (int j = 0; j < list2.length; j++) {
          merged[count] = list1[i];
          count++;
          merged[count] = list2[j];
        }
      }
    }
 */
