package codeWars;

import org.junit.jupiter.api.Test;

public class StreetFighter2 {

  /*
  fighters = [
  ["Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"],
  ["Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"]]
  initial_position = (0,0)
  moves = ['up', 'left', 'right', 'left', 'left']
  Solution: ['Ryu', 'Vega', 'Ryu', 'Vega', 'Balrog']
   */
  public static void main(String[] args) {
    String[][] fighters = new String[][]{
        new String[]{"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
        new String[]{"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"},
    };
    int[] initial_position = {0, 0};
    String[] moves = new String[]{"up", "left", "right", "left", "left"};
    // result: ['Ryu', 'Vega', 'Ryu', 'Vega', 'Balrog']
    System.out.println(streetFighterSelection(fighters, initial_position, moves));
    for (String string : streetFighterSelection(fighters, initial_position, moves)) {
      System.out.println(string);
    }

  }

  public static String[] streetFighterSelection(String[][] fighters, int[] position,
      String[] moves) {
    String tempFighter = "";
    int[] positAfterStep = {position[0], position[1]};
    String[] touchedFighters = new String[moves.length];
    String[] takenSteps = new String[moves.length];

    for (int i = 0; i < moves.length; i++) {
      if (moves[i] == "up") {
        if (positAfterStep[0] == 0) { // position[x,y] -> x = 0 --> we are in the upstream row
          positAfterStep = positAfterStep; // no change needed on coordinates
          tempFighter = fighters[positAfterStep[0]][positAfterStep[1]];
          touchedFighters[i] = tempFighter;
        } else {
          positAfterStep[0] = 0;
          tempFighter = fighters[positAfterStep[0]][positAfterStep[1]];
          touchedFighters[i] = tempFighter;
        }
      } else if (moves[i] == "down") {
        if (positAfterStep[0] == 1) { // position[x,y] -> x = 0 --> we are in the downstream row
          positAfterStep = positAfterStep; // no change needed on coordinates
          tempFighter = fighters[positAfterStep[0]][positAfterStep[1]];
          touchedFighters[i] = tempFighter;
        } else {
          positAfterStep[0] = 1;
          tempFighter = fighters[positAfterStep[0]][positAfterStep[1]];
          touchedFighters[i] = tempFighter;
        }
      } else if (moves[i] == "left") {
        // át kell ugrani a lista végére !! végére
        if (positAfterStep[1] == 0) {
          positAfterStep[1] = fighters[0].length - 1;
          tempFighter = fighters[positAfterStep[0]][positAfterStep[1]];
          touchedFighters[i] = tempFighter;
        } else {
          // lehet balra lépkedni
          positAfterStep[1] -= 1; // for step left the second coordinate should be increment by 1
          tempFighter = fighters[positAfterStep[0]][positAfterStep[1]];
          touchedFighters[i] = tempFighter;
        }
      } else if (moves[i] == "right") {
        // át kell ugrani a list ELEJÉRE
        if (positAfterStep[1] == fighters[0].length - 1) {
          positAfterStep[1] = 0;
          tempFighter = fighters[positAfterStep[0]][positAfterStep[1]];
          touchedFighters[i] = tempFighter;
        } else {
          // possible to step right
          positAfterStep[1] += 1; // for step right the secod coordinate should be increase by 1
          tempFighter = fighters[positAfterStep[0]][positAfterStep[1]];
          touchedFighters[i] = tempFighter;
        }
      }
    }
    return touchedFighters;
  }
}
