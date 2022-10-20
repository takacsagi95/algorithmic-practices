package hackerRank.javaInteviewPreparationKit.Strings;

import java.util.HashMap;

public class TwoStringGame {

  /*
  Consider the following game for two players:

  There are two strings A and B. Initially, some strings A' and B' are written on the sheet of paper.
  A' is always a substring of A and B' is always a substring of B.
  A move consists of appending a letter to exactly one of these strings: either to A' or to B'.
  After the move the constraint of A' being a substring of A and B' is a substring of B should still
  be satisfied. Players take their moves alternately. We call a pair (A', B') a position.

  Two players are playing this game optimally. That means that if a player has a move that leads to
  his/her victory, he/she will definitely use this move. If a player is unable to make a move, he loses.

  Alice and Bob are playing this game. Alice makes the first move. As always, she wants to win and
  this time she does a clever trick. She wants the starting position to be the Kth lexicographically
  winning position for the first player (i.e. her). Consider two positions (A'1, B'1) and (A'2, B'2).
  We consider the first position lexicographically smaller than the second if A1 is lexicographically
  smaller than A2, or if A1 is equal to A2 and B1 is lexicographically smaller than B2.

  Please help her to find such a position, knowing the strings A, B and the integer K.

  Note: An empty string has higher precedence than character "a"

  Input Format
  The first line of input consists of three integers, separated by a single space: N, M and K denoting
  the length of A, the length of B and K respectively. The second line consists of N small latin
  letters, corresponding to the string A. The third line consists of M small latin letters,
  corresponding to the string B.

  Constraints
  1 <= N, M <= 3 * 105
  1 <= K <= 1018

  Output Format
  Output A' on the first line of input and B' on the second line of input. Please, pay attention that
  some of these strings can be empty. If there's no such pair, output "no solution" without quotes.

  Sample Input 0
  2 1 3
  ab
  c
  Sample Output 0
  a
  c
   */
  public static void main(String[] args) {
    long k = 2;
    String a = "hello";
    String b = "world";
    System.out.println(twoStringsTerrible(k, a, b));

  }

  public static String twoStringsTerrible(long k, String a, String b) {
    // Count the matching substrings
    // if it is equal to the input long --> yes, or: no
    long count = 0;
    char[] aArr = a.toCharArray();
    char[] bArr = b.toCharArray();
    HashMap<Character, Integer> table = new HashMap<>();
    // eltárolom az egyiket, mondjuk az A-t egy hashmapbe számmal, ahányszor előfordul
    // --> utána levonogatom az előfordulást
    for (int i = 0; i < b.length(); i++) {
      for (char ac : aArr) {
        if (ac == bArr[i]) {
          count += 1;

        }
      }
    }
    if (count == k) {
      return "Yes";
    }
    return "No";
  }

}
