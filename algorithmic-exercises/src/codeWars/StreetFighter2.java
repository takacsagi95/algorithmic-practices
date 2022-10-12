package codeWars;

import static java.lang.Math.abs;

import java.util.ArrayList;

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
        new String[] { "Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega" },
        new String[] { "Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison" },
    };
    System.out.println("_______________________________________");
    System.out.println(fighters[0][0]);
    System.out.println(fighters[1].length);
    System.out.println(fighters.length);
    System.out.println(fighters[1][0]);
    System.out.println("_______________________________________");
    int[] initial_position = {0,0};
    String[] moves = new String[] {"up", "left", "right", "left", "left"};
    System.out.println(streetFighterSelection(fighters, initial_position, moves));
    for (String string : streetFighterSelection(fighters, initial_position, moves)) {
      System.out.println(string);
    }

  }

  public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
    String tempFighter = "";
    int[] positonAfterStep = {position[0], position[1]};
    String[] touchedFighter = new String[moves.length];
    String[] takenSteps = new String[moves.length];
    int iters = 0;
    while (moves.length == takenSteps.length){
      for (int i = 0; i < fighters.length; i++) {
        for (int j = 0; j < fighters[0].length; j++) {
          // Kezdő pozícióból kell elindítani
          if (moves[iters] == "up"){
            if (positonAfterStep[i] - 1 < 0) {
              positonAfterStep[i] = 0;
              //tempFighter = positonAfterStep[][];
            }
          } else if (moves[iters].equals("down")) {
            if (positonAfterStep[i] + 1 > fighters.length) {
              positonAfterStep[i] = fighters.length;
            }

          } else if (moves[iters].equals("right")) {

          }  else if (moves[iters].equals("left")) {

          }
        }
      }
      takenSteps[iters] = moves[iters];
      iters++;
    }
    return touchedFighter;
  }
}
