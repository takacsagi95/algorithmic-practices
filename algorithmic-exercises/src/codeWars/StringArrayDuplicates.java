package codeWars;

public class StringArrayDuplicates {

  public static void main(String[] args) {
    String[] duplicates = new String[]{"abracadabra", "allottee", "assessee"};
    System.out.println(dup(duplicates));
  }

  public static String[] dup(String[] arr) {
    /*
    In this Kata, you will be given an array of strings and your task is to remove all consecutive
    duplicate letters from each string in the array.
    For example:
    dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].
    dup(["kelless","keenness"]) = ["keles","kenes"]
     */
    if (arr.length <= 1) {
      return arr;
    }
    String[] rightStringList = new String[arr.length];
    int counter = 0;
    for (String word : arr) {

      String build = "";
      build += word.charAt(0);
      for (int i = 1; i < word.length(); i++) {
        if (word.charAt(i) != word.charAt(i - 1)) {
          build += word.charAt(i);
        }
        if (i + 1 > word.length()) {
          break;
        }
      }
      rightStringList[counter] = build;
      counter++;
    }

    return rightStringList;
  }

}
