package hackerRank.javaInteviewPreparationKit.warmUp;

// https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup


public class RepeatedString {

  public static void main(String[] args) {
    // a 100000 // 100000
    // aab 882787
    // gfcaaaecbg 547602
    //
    System.out.println(repeatedString("aba", 10)); // 7

  }

  static long repeatedString(String s, long n) {
    // Aim:
    // There is a string, s, of lowercase English letters that is repeated infinitely many times.
    // Given an integer, n, find and print the number of letter a's in the first n letters of
    // the infinite string.
    long repeats = 0;
    // 1. The repeated string should be built through an n long loop
    char[] sArray = s.toCharArray();
    StringBuilder repeatedStringB = new StringBuilder();
    for (int j = 0; j <= n; j++) {
      for (int i = 0; i < s.length(); i++) {
        // build the new string with StringBuilder
        repeatedStringB.append(sArray[i]);
      }
    }

    System.out.println(repeatedStringB);
    // 2. Counting the "a"s in the repeated string
    String newString = repeatedStringB.toString();
    for (int i = 0; i < newString.length(); i++) {
      if (newString.charAt(i) == 'a'){
        repeats++;
      }
    }
    return repeats;
  }

  static long repeatedStringMath(String s, long n){
    long total_full_strings = n / s.length();
    long remainder = n % s.length();
    char[] c = s.toCharArray();
    long count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (c[i] == 'a'){
        count ++;
      }
      count *= total_full_strings;
    }
    for (int i = 0; i < remainder; i++) {
      if (c[i] == 'a'){
        count++;
      }
    }
    return count;
  }
}
