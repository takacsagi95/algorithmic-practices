package Practice;

import java.util.ArrayList;

public class UnionAll {

  public static void main(String[] args) {
    Integer[][] input = new Integer[][]{
        {1, 2, 3},
        {2, 3, 4}
    };
    Integer[][] twoDArrDiffLengths = new Integer[][] {
        {1, 2},
        {7, 15, -145, 9},
        {18, 15, 99, 9, 20}
    };
    System.out.println(unionAll(input));
    System.out.println(unionAll(twoDArrDiffLengths));
  }
   public static ArrayList<Integer> unionAll(Integer[][] input){
    ArrayList<Integer> output = new ArrayList<>();
     for (int i = 0; i < input.length; i++) {
       for (int j = 0; j < input[i].length; j++) {
         if (!output.contains(input[i][j])) {
           output.add(input[i][j]);
         }
       }
     }
     return output;
   }
}
