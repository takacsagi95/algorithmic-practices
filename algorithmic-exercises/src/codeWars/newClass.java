package codeWars;

public class newClass {

  public static void main(String[] args) {
    printPascal(4);
  }
  // Pascal function
  public static void printPascal(int n) {
    for (int line = 1; line <= n; line++) {
      for (int j = 0; j <= n - line; j++) {

        // for left spacing
        System.out.print(" ");
      }

      // used to represent C(line, i)
      int C = 1;
      for (int i = 1; i <= line; i++) {

        // The first value in a line is always 1
        System.out.print(C + " ");
        C = C * (line - i) / i;
      }
      System.out.println();
    }
  }

}
