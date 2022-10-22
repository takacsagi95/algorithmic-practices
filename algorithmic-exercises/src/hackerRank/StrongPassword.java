package hackerRank;

public class StrongPassword {

  public static void main(String[] args) {
    String password = "#HackerRank2";
    String PW = "S-ssss1";
    System.out.println(minimumNumber(password.length(), password));
    System.out.println(minimumNumber(PW.length(), PW));
    //System.out.println(minimumNumberSecondSol(password.length(), password));
  }

  public static int minimumNumber(int n, String password) {
    int missingChars = 0;
    String spec = "[!@#$%^&*()-+ ]";
    if (!password.chars().anyMatch(Character::isUpperCase)) {
      missingChars++;
    }
    if (!password.chars().anyMatch(Character::isLowerCase)) {
      missingChars++;
    }
    if (!password.chars().anyMatch(Character::isDigit)) {
      missingChars++;
    }
    if (!password.chars().anyMatch(c -> spec.indexOf((char) c) >= 0)) {
      missingChars++;
    }
    if (n < 6) {
      missingChars = 6 - missingChars;
    }
    return missingChars;
  }


  public static int minimumNumberSecondSol(int n, String password) {
    // Return the minimum number of characters to make the password strong
    // anyMatch Character::isDigit
    if (6 <= n) {
      if (!password.contains("A-Z")) {
        return 1;
      } else if (!password.contains("^a-zA-Z")) {
        return 1;
      } else if (password.contains("0-9")) {
        return 1;
      } else if (!password.contains("A-Z") && !password.contains("^a-zA-Z")) {
        return 2;
      } else if (!password.contains("^a-zA-Z") && !password.contains("48-57")) {
        return 2;
      } else if (!password.contains("A-Z") && !password.contains("48-57")) {
        return 2;
      } else if (!password.contains("A-Z") && !password.contains("^a-zA-Z") && !password.contains(
          "48-57")) {
        return 3;
      } else {
        return 0;
      }
    } else {
      return 6 - n;
    }
  }
}
