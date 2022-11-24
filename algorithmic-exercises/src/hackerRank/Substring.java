package hackerRank;

public class Substring {

  public static void main(String[] args) {
    String word = "HelloWorld";
    System.out.println(findSubstring(word, 3, 7));
  }

  public static String findSubstring(String word, int x, int y) {
    String substr = "";
    for (int i = x; i < y; i++) {
      substr += word.charAt(i);
    }
    return substr;
  }
}
