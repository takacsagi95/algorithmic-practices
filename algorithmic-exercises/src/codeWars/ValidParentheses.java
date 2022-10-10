package codeWars;

public class ValidParentheses {

  public static void main(String[] args) {
    String parens1 = "()";
    String parens2 = ")(()))";
    String parens3 = "(";
    String parens4 = "(())((()())())";
    System.out.println(validParentheses(parens1));
    System.out.println(validParentheses(parens2));
    System.out.println(validParentheses(parens3));
    System.out.println(validParentheses(parens4));
  }
  public static boolean validParentheses(String parens) {
    // parens --> toCharArray --> filter and count "(", ")" --> num of "(" and num of ")" should be equal
    // but the order is also IMPORTANT !!
    // --> opening sign(s) should be followed by equal (to them) number of closing signs

    char[] parensArr = parens.toCharArray();
    int numOfOpening = 0;
    int numOfClosing = 0;
    for (int i = 0; i < parensArr.length; i++) {
      if (parensArr[i] == '('){
        numOfOpening += 1;
      } else if (parensArr[i] == ')') {
        numOfClosing += 1;
      }
    }
    if (numOfClosing == numOfOpening) {
      return true;
    } else if (!parens.contains("(") && !parens.contains(")")) {
      return true;
    } else {
      return false;
    }
  }
}
