package Practice;

public class DivisibleSumPairs {

  public static void main(String[] args) {
    Integer[] input = new Integer[] {1, 2, 3, 4, 5};
    Integer[] empty = new Integer[]{};
    Integer div = 10;
    System.out.println(divisibleSumPairs(input, div));
    System.out.println(divisibleSumPairs(input, 4));
    System.out.println(divisibleSumPairs(empty, 2));
  }

  public static Integer divisibleSumPairs(Integer[] input, Integer div){
    Integer count = 0;
    for (int i = 0; i < input.length - 1; i++) {
      for (int j = i + 1; j < input.length; j++) {
        int sum = input[i] + input[j];
        if (div % sum == 0){
          count += 1;
        }
      }

    }
    return count;
  }

}
