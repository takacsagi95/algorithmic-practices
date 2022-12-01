package Practice;

import java.util.HashMap;

public class PanGram {

  /*
  Pangram is a phrase or a sentence in which every letter of the alphabet occurs at least once.
  The letter can occur more than once, but the goal is for the sentence to be as short as possible

  Create a function that takes a string and return a boolean value wheteher a string is a pangram or not.
  Rules:
    - case-insensitive
    - space is not considered as a character
    - string should be at least 26 character long
   */
  public static void main(String[] args) {
    String inputFalse = "This is not a good example";
    String inputTrue = "The quick brown fox jumped over the lazy sleeping dog";
    String anotherTrue = "Bawds jog, flick quartz, vex nymphs";
    System.out.println(panGram(inputFalse));
    System.out.println(panGram(inputTrue));
    System.out.println(panGram(anotherTrue));
  }

  public static boolean panGram(String input) {
    if (input.length() < 26) {
      return false;
    }
    String lowercase = input.toLowerCase();
    //ArrayList<Character> alphabet = new ArrayList<>();
    HashMap<Character, Integer> alphabetMap = new HashMap<>();
    for (char a = 'a'; a <= 'z'; a++) {
      alphabetMap.put(a, 0);
    }
    for (int i = 0; i < lowercase.length(); i++) {
      if (alphabetMap.containsKey(lowercase.charAt(i))) {
        alphabetMap.replace(lowercase.charAt(i), alphabetMap.get(lowercase.charAt(i)) + 1);
      }
    }
    if (alphabetMap.containsValue(0)) {
      return false;
    } else {
      return true;
    }
  }
}
/*
    String lowercase = input.toLowerCase();
    int[] chars = new int[26];
    //ArrayList<Integer> intList = new ArrayList<Integer>();
    for (int i = 0; i < lowercase.length(); i++) {
      chars['a' - lowercase.charAt(i)]++;
    }
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 0) {
        return false;
      }
    }
    return true;



    String lowercase = input.toLowerCase();
    int[] chars = new int[26];
    ArrayList<Integer> intList = new ArrayList<Integer>();
    for (int i = 0; i < lowercase.length(); i++) {
      intList.add('a' - lowercase.charAt(i));
    }
    if (intList.size() < 26) {
      return false;
    } else {
      return true;
    }
 */
