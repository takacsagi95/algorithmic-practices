package codeWars;

public class CalculateStringRotation {

  /*
  Write a function that receives two strings and returns n, where n is equal to the number of
  characters we should shift the first string forward to match the second.
  The check should be case sensitive.
  For instance, take the strings "fatigue" and "tiguefa".
  In this case, the first string has been rotated 5 characters forward to produce the second string,
  so 5 would be returned.
  If the second string isn't a valid rotation of the first string, the method returns -1.

  "coffee", "eecoff" => 2
  "eecoff", "coffee" => 4
  "moose", "Moose" => -1
  "isn't", "'tisn" => 2
  "Esham", "Esham" => 0
  "dog", "god" => -1
   */
  public static void main(String[] args) {
    String first = "coffee";
    String second = "eecoff";
    String first2 = "dog";
    String second2 = "god";
    System.out.println(shiftedDiff(first, second));
    System.out.println(shiftedDiff(first2, second2));
    System.out.println(shiftedDiff("moose", "Moose"));
  }

  static int shiftedDiff(String first, String second) {
    int shift = 0;
    char[] firstChars = first.toCharArray();
    char[] secondChars = second.toCharArray();
    for (int i = 0; i < second.length(); i++) {
      if (firstChars[0] == secondChars[i]) {
        shift = i;
        return i;
      }
    }
    return shift;
  }

}
