package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BirthdayCakeCandles {

  public static void main(String[] args) {
    List<Integer> candles = new ArrayList<>(Arrays.asList(3, 2, 1, 3));
    System.out.println(birthdayCakeCandles(candles));
  }

  public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int highestCandles = 0;
    int max = Collections.max(candles);
    for (int i = 0; i < candles.size(); i++) {
      if (candles.get(i) == max) {
        highestCandles += 1;
      }
    }
    return highestCandles;
  }

}
