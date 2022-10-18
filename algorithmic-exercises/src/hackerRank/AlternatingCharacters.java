package hackerRank;

public class AlternatingCharacters {

  public static void main(String[] args) {
    System.out.println(alternatingCharacters("AAAA"));
  }

  public static int alternatingCharacters(String s) {
    // Write your code here
    /*
    You are given a string containing characters A and B only.
    our task is to change it into a string such that there are no matching adjacent characters.
    To do this, you are allowed to delete zero or more characters in the string.
    Your task is to find the minimum number of required deletions.
     */
    char[] chars = s.toCharArray();
    int count = 0;
    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == chars[i - 1]){
        count += 1;
      } else {

      }
    }
    return count;
  }
}
