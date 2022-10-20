package hackerRank;

import java.util.HashMap;

public class MakingAnagrams {

  public static void main(String[] args) {
    String a = "abc";
    String b = "cde";
    System.out.println(makeAnagram(a, b));

  }

  public static int makeAnagram(String a, String b) {
    /*
    Delete the following characters from the strings make them anagrams:
      1. Remove d and e from cde to get c.
      2. Remove a and b from abc to get c.
     */
    // Search for the matching characters or substring
    // --> then with a StringBuilder build the two strings and
    // then remove the non-matching characters and count them
    int[] c = new int[26]; // an ABC length list
    // For uniformity remove the uppercase letters
    a = a.toLowerCase();
    b = b.toLowerCase();

    // Build the abc length list with the frequency of each chars:
    // To each position add plus 1 if there are a matching character (to ABC)
    for (int i = 0; i < a.length(); i++) {
      c[a.charAt(i) - 'a']++;
    }

    // Decrease the the value in positon of the character if it is occures in the b string:
    for (int i = 0; i < b.length(); i++) {
      c[b.charAt(i) - 'a']--;
    }

    // In the int list we can find zeros at the position of matching characters -->
    // we should summarize the absolute value of every non zero value  (because on these place there are mismatches)
    // --> this will give the number of needed reduces to get our anagram
    int total = 0;
    for (int i : c) {
      total += Math.abs(i);
    }
    return total;
  }
}