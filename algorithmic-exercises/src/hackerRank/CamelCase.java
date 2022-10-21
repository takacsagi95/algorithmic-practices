package hackerRank;

public class CamelCase {

  public static void main(String[] args) {
    String s = "saveChangesInTheEditor";
    System.out.println(camelcase(s));
  }

  public static int camelcase(String s) {
    // Write your code here
    char[] sArr = s.toCharArray();
    int count = 1;
    for (int i = 0; i < sArr.length; i++) {
      if ('A' <= sArr[i] && sArr[i] <= 'Z'){
        count += 1;
      }
    }
    return count;
  }

}
