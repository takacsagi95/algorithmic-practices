package codeWars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 */
public class HighestScoringWord {

  public static void main(String[] args) {
    String s = "string";
    System.out.println(high(s));
  }

  public static String high(String s) {
    // Your code here...
    ArrayList<Character> alphabet = new ArrayList();
    HashMap<Character, Integer> charScores = new HashMap<>();
    for (char a='A'; a <= 'Z'; ++a){
      alphabet.add(a);
    }
    for (int i = 0; i < alphabet.size(); i++) {
      Character tempChar = alphabet.get(i);
      charScores.put(tempChar, i+1);
    }
    String[] sStringArray = s.split(" ");
    HashMap<String, Integer> highestScoredString = new HashMap<>();
    int score = 0;
    for (int i = 0; i < sStringArray.length; i++) {
      String tempWord = sStringArray[i];
      char[] tempWordChars = tempWord.toCharArray();
      // végig kell menni az adott szó karakterein és
      // kivenni a hashmap-ből az adott karakterhez tartozó számot,
      // a kivett számogat össze adogatni --> ez után össze hasonlítani az előző szó pontszámával
      // a nagyobb értéket tartom meg és a hozzá tartozó szót is
      for (int j = 0; j < tempWordChars.length; j++) {

      }
    }
    char[] sCharArray = s.toCharArray();

    System.out.println(charScores);

    return "";
  }
}
