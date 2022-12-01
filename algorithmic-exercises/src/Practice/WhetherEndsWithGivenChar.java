package Practice;

import static java.lang.Character.isLetter;

public class WhetherEndsWithGivenChar {

  public static void main(String[] args) {
    String text = "La vita é bella";
    String input = "Un Ferrari benissimo.";
    System.out.println(endsWith(text, 'a'));
    System.out.println(endsWith(input, 'o'));
  }

  public static Integer endsWith(String text, char c) {
    String[] words = text.split(" ");
    int count = 0;
    for (int i = 0; i < words.length; i++) {
      if (isLetter(words[i].charAt(words[i].length() - 1))) {
        if (words[i].charAt(words[i].length() - 1) == c) {
          count++;
        }
      } else if (isLetter(words[i].charAt(words[i].length() - 2))) {
        if (words[i].charAt(words[i].length() - 2) == c) {
          count++;
        }
      }

    }
    return count;
  }

}
