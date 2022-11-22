package codeWars;

public class SumOfDigits {

  public static void main(String[] args) {
    //System.out.println(sumOfDigits(16));
    //System.out.println(sumOfDigits(132189));
    //System.out.println(sumOfDigits(456));
    System.out.println(sumOfDigits(900487));
  }

  public static int sumOfDigits(int n) {
    int sum = 0;
    if (n >= 10) {
      System.out.println(n);
      sum = n % 10 + sumOfDigits(n/10);
      System.out.println(sum);
      if (sum < 10) {
        return sum;
      } else {
        return sumOfDigits(sum);
      }
    }
    return n;
  }
}
