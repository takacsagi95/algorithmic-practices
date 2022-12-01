package codeWars;

import java.util.HashMap;

public class SimpleCardGame {

  public static void main(String[] args) {
    Character[] steveDeck = new Character[] {'A','7','8'};
    Character[] joshDeck = new Character[] {'K','5','9'};
    Character[] joshSmall = new Character[]{'J'};
    Character[] steveSmall = new Character[]{'J'};
    Character[] steveDeck2 = new Character[] {'5','7','8'};
    Character[] joshDeck2 = new Character[] {'A','J','K'};
    System.out.println(winner(steveDeck, joshDeck));
    System.out.println(winner(steveSmall, joshSmall));
    System.out.println(winner(steveDeck2, joshDeck2));

  }

  public static String winner(Character[] deckSteve, Character[] deckJosh) {
    char[] cardRank = new char[] {'2','3','4','5','6','7','8','9','T','J','Q','K','A'};
    HashMap<Character, Integer> cardsAndValue = new HashMap<>() {{
     put('2', 1);
     put('3', 2);
     put('4', 3);
     put('5', 4);
     put('6', 5);
     put('7', 6);
     put('8', 7);
     put('9', 8);
     put('T', 9);
     put('J', 10);
     put('K', 11);
     put('A', 12);
    }};

    int stevePoints = 0;
    int joshPoints = 0;
    for (int i = 0; i < deckSteve.length; i++) {
      int steveTempPoints = 0;
      int joshTempPoints = 0;
      // Steve temp points:
      if (cardsAndValue.containsKey(deckSteve[i])){
        steveTempPoints = cardsAndValue.get(deckSteve[i]);
      }
      if (cardsAndValue.containsKey(deckJosh[i])){
        joshTempPoints = cardsAndValue.get(deckJosh[i]);
      }
      if (steveTempPoints > joshTempPoints) {
        stevePoints++;
      }
      if (steveTempPoints < joshTempPoints) {
        joshPoints++;
      }
    }
    if (joshPoints > stevePoints) {
      return "Josh wins " + joshPoints + " to " + stevePoints;
    }
    if (joshPoints < stevePoints) {
      return "Josh wins " + stevePoints + " to " + joshPoints;
    }
    return "Tie";
  }

}
