package javaInteviewPreparationKit.warmUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpingOnClouds {

  public static void main(String[] args) {
    // 0 0 1 0 0 1 0
    // 0 0 0 1 0 0
    List<Integer> c = new ArrayList<>(Arrays.asList(0, 0, 1, 0, 0, 1, 0));
    System.out.println(jumpingOnClouds(c));

  }

  public static int jumpingOnClouds(List<Integer> c) {
    int requiredJumps = 0;
    int currentCloud = 0; // currentCloud shows the index of a cloud in the row.
    List<Integer> path = new ArrayList<>();
    // if the length of the cloud collection is shorter than 2, there won't be a cloud to jump on:
    if (c.size() < 2) {
      return 0;
    }
    while (currentCloud < c.size() - 1){
      // If the second next cloud is a cloud with one then jump just 1.
      // Or we get to the end of cloud row, we will just jump 1.
      if (currentCloud+2 == c.size() || c.get(currentCloud+2) == 1){
        currentCloud++;
        requiredJumps++;
        path.add(currentCloud);
      }
      // In every other case, we are able to jump 2
      else {
        currentCloud += 2;
        requiredJumps++;
        path.add(currentCloud);
      }
    }
    System.out.println(c);
    System.out.println(path);
    return requiredJumps;
  }
}
