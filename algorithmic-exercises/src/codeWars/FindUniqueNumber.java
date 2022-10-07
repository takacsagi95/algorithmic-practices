package codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class FindUniqueNumber {

  public static void main(String[] args) throws Exception {

    double[] testNums1= {0, 1, 0};

    double[] testNums2 = new double[]{1, 1, 1, 2, 1, 1};
    System.out.println(findUniq(testNums1));
    System.out.println(findUniq(testNums2));
  }
  public static double findUniq(double[] arr) throws Exception {
    // NOT MINE
    return Arrays.stream(arr)
        .distinct()
        .filter(a -> Arrays.stream(arr)
            .filter(b -> a == b).count() == 1)
        .reduce((a, b) -> {
      throw new IllegalStateException();
    })
    .getAsDouble();

  }

}
