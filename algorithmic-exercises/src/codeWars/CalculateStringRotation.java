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
  "moose", "Moose" => -1 // ez nem jó
  "isn't", "'tisn" => 2
  "Esham", "Esham" => 0 // ez jó
  "dog", "god" => -1
   */
  public static void main(String[] args) {
    // coffee -> eecoff } 2; eecoff -> coffee 4
    String first = "coffee";
    String second = "eecoff";
    // dog -> god : -1 } if i == length (adott szó) -> return -1;
    String first2 = "dog";
    String second2 = "god";
    System.out.println(shiftedDiff(first, second) + "   2");
    System.out.println(shiftedDiff(second, first) + "   4");
    System.out.println(shiftedDiff(first2, second2) + "   -1");
    // moose -> Moose } -1
    System.out.println(shiftedDiff("moose", "Moose") + "   -1"); // In this case needed some fixing
    // isn't -> tisn } 2
    System.out.println(shiftedDiff("isn't", "'tisn") + "   2");
    // Esham -> Esham } 0
    System.out.println(shiftedDiff("Esham", "Esham") + "   0");
    System.out.println(shiftedDiff("hoop", "pooh") + "   -1");
  }

  static int shiftedDiff(String first, String second) {
    int shift = 0;
    char[] firstChars = first.toCharArray();
    char[] secondChars = second.toCharArray();
    for (int i = 0; i <= firstChars.length -1; i++) {
      for (int j = 0; j <= secondChars.length -1; j++) {
        if (firstChars[0] == secondChars[j]){
          if (j == secondChars.length-1){
            return -1;
          }
          if ( 141 <= (int) firstChars[0] && (int) firstChars[0] <= 172 &&
              65 <= (int) secondChars[j] && (int) secondChars[j] <= 132){
            return -1;
          }
          if ( 65 <= (int) firstChars[0] && (int) firstChars[0] <= 132 &&
              141 <= (int) secondChars[j] && (int) secondChars[j] <= 172){
            return -1;
          }
          return j;
        }
      }
    }
    return 0;
  }
}
