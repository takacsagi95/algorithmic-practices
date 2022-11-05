package Practice;

public class NoneMissingInt {

  public static void main(String[] args) {
    Integer[] input = new Integer[]{1, 2, 3, 5, 6, 8};
    Integer[] trueInput = new Integer[]{1, 2, 3, 4, 5};
    System.out.println(noneMissingInt(input));
    System.out.println(noneMissingInt(trueInput));
  }
  public static boolean noneMissingInt(Integer[] input){
    boolean output = false;
    for (int i = 0; i < input.length - 1; i++) {
      if (input[i] + 1 == input[i + 1]){
        output = true;
      } else {
        output = false;
      }
    }
    return output;
  }
}
