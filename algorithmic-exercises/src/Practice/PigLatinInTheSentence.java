package Practice;

public class PigLatinInTheSentence {

  public static void main(String[] args) {
    // Io namgio una pizza bella --> Io mangiu onp aizza bella
    System.out.println("Io namgio una pizza bella --> " + pigLatinInTheSentence("Io mangio una pizza bella"));
    System.out.println("Io mangio la pizza e dopo gli spaghetti. --> " + pigLatinInTheSentence("Io mangio la pizza e dopo gli spaghetti."));
  }

  public static String pigLatinInTheSentence(String text) {
    String[] arr = text.split(" ");
    String build = arr[0];
    build += " ";
    for (int i = 0; i < arr.length - 2; i++) {
      if (0 < i && i < arr.length - 1) {
        String temp1 = arr[i];
        String temp2 = arr[i + 1];
        build += temp1.substring(0, temp1.length() - 1) + temp2.substring(0,1) +
            " " + temp1.substring(temp1.length()-1) + temp2.substring(1) + " ";
      }
      i++;
    }
    build += arr[arr.length - 1];
    return build.trim();
  }

}
