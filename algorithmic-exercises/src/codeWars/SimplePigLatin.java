package codeWars;

import java.util.ArrayList;
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
    String sentenceThree = "This is my string";
    //System.out.println(pigLatin(sentence));
    System.out.println(pigLatin(sentence));
    System.out.println(pigLatin(sentenceSecond));
    System.out.println("igPay atinlay siay oolcay");
    System.out.println(pigLatin(sentenceThree));
    System.out.println("hisTay siay ymay tringsay");
  }

  public static String pigLatin(String str){
    String end = "";
    String[] words = str.split(" "); // split up at spaces
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() <= 1) {
        end += " " + words[i];
      }
      else if (0 < i && i < words.length){
        end += " " + words[i].substring(1) + words[i].substring(0, 1) + "ay";
      }
      else {
        end += words[i].substring(1) + words[i].substring(0, 1) + "ay";
      }
    }
    return end;
  }

  @Test
  public void testPiglatinForSentenceThree(){
    String sentenceThree = "This is my string";
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
