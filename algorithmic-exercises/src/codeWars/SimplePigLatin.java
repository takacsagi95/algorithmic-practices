package codeWars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimplePigLatin {
  /*
  Move the first letter of each word to the end of it, then add "ay" to the end of the word.
  Leave punctuation marks untouched.
   */
  public static void main(String[] args) {
    String sentence = "Hello world !";
    String sentenceSecond = "Pig latin is cool";
    String sentenceThree = "[]This is my string";
    //System.out.println(pigLatin(sentence));
    //System.out.println(pigLatin(sentence));
    //System.out.println(pigLatin(sentenceSecond));
    //System.out.println("igPay atinlay siay oolcay");
    System.out.println(pigLatin(sentenceThree));
    //System.out.println("hisTay siay ymay tringsay");
  }

  public static String pigLatin(String str){
    String end = "";
    String[] words = str.split(" "); // split up at spaces
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() <= 1) {
        end += " " + words[i];
        char letter = words[i].charAt(0);
        if ('a' <= letter && letter <= 'z' || 'A' <= letter && letter <= 'Z'){
          end += "ay";
        }
      }
      else if (0 < i && i < words.length){
        if (words[i].matches("[a-zA-Z]")) {
          end += " " + words[i].substring(1) + words[i].substring(0, 1) + "ay";
        } else {
          String[] splitted = words[i].split("[a-zA-Z]");
          for (String string : splitted
          ) {
            System.out.println(string);
          };
        }
      }
      else {
        //end += words[i].substring(1) + words[i].substring(0, 1) + "ay";
        if (words[i].matches("[a-zA-Z]")) {
          end += " " + words[i].substring(1) + words[i].substring(0, 1) + "ay";
        } else {
          String[] splitted = words[i].split("[a-zA-Z]");
          for (String string : splitted
          ) {
            System.out.println(string);
          };
        }
      }
    }
    return end;
  }

  @Test
  public void testPiglatinForSentenceThree(){
    String sentenceThree = "[]This is my string";
    Assertions.assertEquals("hisTay siay ymay tringsay", pigLatin(sentenceThree));
  }
  //assertEquals("", PigLatin.pigIt("Pig latin is cool"));

  @Test
  public void testPiglatinForSentenceOne(){
    String sentenceSecond = "Pig latin is cool";
    Assertions.assertEquals("igPay atinlay siay oolcay", pigLatin(sentenceSecond));
  }

  @Test
  public void testPiglatinForSentenceTwo(){
    String sentence = "Hello world !";
    Assertions.assertEquals("elloHay orldway !", pigLatin(sentence));
  }
}
/*
Some help notes:
Use a character set: [a-zA-Z] matches one letter from A–Z in lowercase and uppercase.
[a-zA-Z]+ matches one or more letters and ^[a-zA-Z]+$ matches only strings that consist of one or
more letters only (^ and $ mark the begin and end of a string respectively).
https://www.regular-expressions.info/unicode.html#prop
 */
