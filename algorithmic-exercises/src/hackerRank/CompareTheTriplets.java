package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CompareTheTriplets {

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>(Arrays.asList(5, 6, 7));
    List<Integer> b = new ArrayList<>(Arrays.asList(3, 6, 10));

    List<Integer> c = new ArrayList<>(Arrays.asList(5, 6, 7));
    List<Integer> d = new ArrayList<>(Arrays.asList(3, 10, 10));

    List<Integer> e = new ArrayList<>(Arrays.asList(17, 28, 30));
    List<Integer> f = new ArrayList<>(Arrays.asList(99, 16, 8));

    //System.out.println(compareTriplets(a, b));
    //System.out.println(compareTriplets(c, d));
    System.out.println(compareTriplets(e, f));
  }

  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> points = new ArrayList<>();
    int aP = 0;
    int bP = 0;
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        aP += 1;
      } else if (a.get(i) < b.get(i)) {
        bP += 1;
      }
    }
    points.add(aP);
    points.add(bP);
    return points;
  }


}
