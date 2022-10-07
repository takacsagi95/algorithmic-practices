package codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestScoringWordAnother {

  public static void main(String[] args) {
    String s = "tango slowfox jive rocky waltz";
    System.out.println(high(s));
  }
  public static String high(String s) {
    return Arrays.stream(s.split(" "))
        .max(Comparator.comparingInt(
            a -> a.chars().map(i -> i - 96).sum()
        )).get();
  }
}
