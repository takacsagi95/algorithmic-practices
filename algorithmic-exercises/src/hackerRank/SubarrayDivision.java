package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {

  public static void main(String[] args) {
    List<Integer> s = new ArrayList<>(Arrays.asList(2, 2, 2, 1, 3, 2, 2, 3, 3, 1, 4, 1, 3, 2, 2, 1, 2, 2, 4, 2, 2, 3, 5, 3, 4, 3, 2, 1, 4, 5, 4));
    int m = 4;
    int d = 10; // 7
    //System.out.println(birthday(s, d, m) + "      output should be 7 ");
    List<Integer> s00 = new ArrayList<>(Arrays.asList(4, 5, 4, 5, 1, 2, 1, 4, 3, 2, 4, 4, 3, 5, 2, 2, 5, 4, 3, 2, 3, 5, 2, 1, 5, 2, 3, 1, 2, 3, 3, 1, 2, 5));
    int m00 = 6;
    int d00 = 18; // 7
    System.out.println(birthday(s00, d00, m00) + "      output should be 7 ");
    List<Integer> s2 = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 2));
    int d2 = 3;
    int m2 = 2;
    //System.out.println(birthday(s2, d2, m2) + "   2");
    List<Integer> s3 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1));
    int m3 = 3;
    int d3 = 2;
    //System.out.println(birthday(s3,  d3, m3) + "    0");
/*
1 2 1 3 2
d = 3
m = 2
=> hány olyan kettes szakasz van, aminek az össze 3
 */
  }

  public static int birthday(List<Integer> s, int d, int m) {
    // Corner case: if the list contains only one element:
    if (s.size() == 1) {
      if (s.get(0) == d) {
        return 1;
      } else {
        return 0;
      }
    }
    // "Normal" cases: 4, 5, 4, 5, 1, 2, 1, 4, 3, 2, 4, 4, 3, 5, 2, 2, 5, 4, 3, 2, 3, 5, 2, 1, 5, 2, 3, 1, 2, 3, 3, 1, 2, 5
    int count = 0;
    for (int i = 0; i <= s.size() - m; i++) {
      int sum = 0;
      for (int j = i; j < i+m; j++) {
        sum += s.get(j);
      }
      if (sum == d) {
        count += 1;
      }
    }
    return count;
  }

}
