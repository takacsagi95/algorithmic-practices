public class CountValleys {

  public static void main(String[] args) {
    System.out.println(countingValleys(12, "DDUUUUDDDDUU"));

  }

    public static int countingValleys(int steps, String path) {
      int numOfValleys = 0;
      int altitude = 0;
      // Write your code here
      if (steps > 0 && path.length() > 0){
        for (int i = 0; i < steps; i++){
          if (path.charAt(i) == 'D'){
            altitude--;
            if (altitude == -1){
              numOfValleys++;
            }
          }
          else if (path.charAt(i) == 'U') {
            altitude++;
          }
        }
      }
      return numOfValleys;
    }
}
