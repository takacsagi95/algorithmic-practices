package Practice;

import java.util.Arrays;

public class ListOfPrimes {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(listPrimes(10)));
  }

  public static int[] listPrimes(Integer n) {
    int[] primes = new int[n];
    // Starting from two because 0 and 1 aren't primes

    for (int i = 2; i < Math.sqrt(n); i++) {
      if (i < primes.length) {
        if (isPrime(i)) {
          primes[i] = i;
        }
      } else {
        return primes;
      }
    }
    return primes;
  }

  // A function to check whether it is a prime:
  public static boolean isPrime(int n) {
    if (n == 0 || n == 1) {
      return false;
    }

    for (int i = 2; i*i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
