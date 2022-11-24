package codeWars;

public class FindTheMissingLettter {

  public static void main(String[] args) {
    char[] arr1 = new char[]{'a', 'b', 'c', 'd', 'f'};
    char[] arr2 = new char[]{'O', 'Q', 'R', 'S'};
    System.out.println(findMissingChar(arr2));
  }

  public static char findMissingChar(char[] array) {
    if (array.length <= 1) {
      return array[0];
    } else {
      for (int i = 1; i < array.length; i++) {
        if ((int) array[i] - (int) array[i - 1] != 1) {
          int c = (int) array[i - 1] + 1;
          return (char) c;
        }
      }
    }
    return '0';
  }
}
