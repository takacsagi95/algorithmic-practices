package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RansomNote {

  public static void main(String[] args) {
    List<String> magazine = new ArrayList<>(
        Arrays.asList("give", "me", "one", "grand", "today", "night"));
    List<String> note = new ArrayList<>(Arrays.asList("give", "one", "grand", "today"));

    List<String> otherMagazine = new ArrayList<>(
        Arrays.asList("ive", "got", "a", "lovely", "bunch", "of", "coconuts"));
    List<String> otherNote = new ArrayList<>(Arrays.asList("ive", "got", "some", "coconuts"));

    List<String> thirdMagazine = new ArrayList<>(
        Arrays.asList("h", "ghq", "g", "xxy", "wdnr", "anjst", "xxy", "wdnr", "h", "h", "anjst",
            "wdnr"));
    List<String> thirdNote = new ArrayList<>(Arrays.asList("h", "ghq"));

    List<String> fourthMagazine = new ArrayList<>(
        Arrays.asList("two", "times", "three", "is", "not", "four"));
    List<String> fourthNote = new ArrayList<>(Arrays.asList("two", "times", "two", "is", "four"));

    checkMagazine(magazine, note);
    System.out.println("----------------");
    checkMagazine(otherMagazine, otherNote);
    System.out.println("----------------");
    checkMagazine(fourthMagazine, fourthNote);
  }

  public static void checkMagazine(List<String> magazine, List<String> note) {
    // The note list can not be null.
    if (note == null) {
      System.out.println("No");
      return;
    }
    // The note list can not be longer than the magazine list
    if (note.size() > magazine.size()) {
      System.out.println("No");
      return;
    }
    // Fill up the words hashmap with word counts:
    HashMap<String, Integer> words = new HashMap<>();
    for (int i = magazine.size() - 1; 0 <= i; i--) {
      if (words.containsKey(magazine.get(i))) {
        words.put(magazine.get(i), words.get(magazine.get(i)) + 1);
      } else {
        words.put(magazine.get(i), 1);
      }
    }

    // Searching for matches between note list and words hashmap
    // Rules:
    // - the count number should stay equal or higher than 0.
    //    - if the count goes under zero -->
    //            give back no, because every word should appear in the magazine with equal occurences
    //            if there are negative number: this number of occurences can not come from this magazine
    //            --> return No
    // - if there is a word in the note list that does not appear in the magazine -->
    //            it can not come from this magazine --> Return No
    // In the other cases: words are matching, return yes.

    for (int i = note.size() - 1; i >= 0; i--) {
      if (words.containsKey(note.get(i))) {
        words.put(note.get(i), words.get(note.get(i)) - 1);
        if (words.get(note.get(i)) < 0) {
          System.out.println("No");
          return;
        }
      } else {
        System.out.println("No");
        return;
      }
    }
//Anything else should give a Yes.
    System.out.println("Yes");
  }
  // Help: https://medium.com/@fahdmoh.1/hackerrank-ransom-note-problem-solution-in-java-4f7d094d8f9b
}
