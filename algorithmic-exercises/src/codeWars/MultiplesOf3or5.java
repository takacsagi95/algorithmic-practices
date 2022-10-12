package codeWars;


public class MultiplesOf3or5 {

  /*
  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  The sum of these multiples is 23.
  Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number
  passed in. Additionally, if the number is negative, return 0 (for languages that do have them).
   */
  public void main(String[] args) {
    System.out.println(solution(10));
    System.out.println(solution(25));
  }

  public int solution(int number) {
    //TODO: Code stuff here
    int sumOfMultiples = 0;
    for (int i = 0; i < number; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sumOfMultiples += i;
      }
    }
    return sumOfMultiples;
  }
}
