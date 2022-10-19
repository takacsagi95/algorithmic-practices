package hackerRank;

public class TwoStrings {
// Submitted, but fail for test case 4 and 5 --> Optimization needed for it.
  public static void main(String[] args) {
    String s1 = "and";
    String s2 = "art";
    String s3 = "tre";
    System.out.println(twoStrings(s1, s2));
    System.out.println(twoStrings(s1, s3));
  }

  public static String twoStrings(String s1, String s2) {
    // Write your code here
    char[] s1cA = s1.toCharArray();
    char[] s2cA = s2.toCharArray();
    for (int i = 0; i < s1.length(); i++) {
      for (char s2c : s2cA) {
        if (s1cA[i] == s2c) {
          return "Yes";
        }
      }
    }
    return "No";
  }
}
