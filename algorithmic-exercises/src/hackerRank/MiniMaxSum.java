package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {

  public static void main(String[] args) {
    List<Integer> lista = new ArrayList<>(Arrays.asList(5, 3, 1, 2, 4)); // 10 & 14
    List<Integer> probe = new ArrayList<>(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625)); // 2063136757 2744467344
    miniMaxSum(lista);
    miniMaxSum(probe);
    //System.out.println(467905213 + 623958417 + 714532089 + 938071625);
  }

  public static void miniMaxSum(List<Integer> arr) {
    int arrIndices = arr.size() - 1;
    long min = 0;
    long max = 0;
    // sorting the arr list:
    arr.sort(Comparator.comparing(Integer::intValue));
    // Iterate through the list from 0 to list size - 1->0th index->4th index
    // two variable in the loop: i for the increasing values -> min, and
    // j is for the decreasing values --> max
    for (int i = 0, j = arr.size()-1; i < arr.size() - 1; i++, j--) {
      min += arr.get(i);
      max += arr.get(j);
    }
    System.out.println(min + " " + max);
  }

  public static void minMaxSumSol2(List<Integer> arr){

  }
}