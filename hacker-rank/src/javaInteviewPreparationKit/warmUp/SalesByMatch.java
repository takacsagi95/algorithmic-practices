package javaInteviewPreparationKit.warmUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {

  public static void main(String[] args) {
    List<Integer> ar = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
    System.out.println(sockMerchant(9, ar));
    System.out.println(sockMerchantByList(9, ar));
  }

  public static int sockMerchant(int n, List<Integer> ar) {
    int sockPairs  = 0;
    Set<Integer> sockColors = new HashSet<>(); // Here will be stored the sock colours
    if (ar.size() == 0) {
      return sockPairs;
    }
    for (int i = 0; i < ar.size(); i++) {
      // if this sock colour is not presented in this list just add to it.
      if (!sockColors.contains(ar.get(i))){
        sockColors.add(ar.get(i));
      }
      else {
        // if the current sock colour is already presented in the sock colour list
        // --> just remove it and increase the pair counter with one - because they are pair
        sockColors.remove(ar.get(i));
        sockPairs++;
      }
    }
      return sockPairs;
  }

  public static int sockMerchantByList(int n, List<Integer> ar) {
    int sockPairs  = 0;
    List<Integer> sockColors = new ArrayList<>(); // Here will be stored the sock colours
    if (ar.size() == 0) {
      return sockPairs;
    }
    for (int i = 0; i < ar.size(); i++) {
      // if this sock colour is not presented in this list just add to it.
      if (!sockColors.contains(ar.get(i))){
        sockColors.add(ar.get(i));
      }
      else {
        // if the current sock colour is already presented in the sock colour list
        // --> just remove it and increase the pair counter with one - because they are pair
        sockColors.remove(ar.get(i));
        sockPairs++;
      }
    }
    return sockPairs;
  }
}
