package hackerRank;

import java.util.HashMap;
import javax.print.DocFlavor.STRING;

public class TimeConversion {

  public static void main(String[] args) {
    String time = "07:05:45PM";
    String timeAM = "07:05:45AM";
    timeConversion(timeAM);
  }

  public static void timeConversion(String s) {
    String[] sArr = s.split(":");
    HashMap<String, String> timesHM = new HashMap<>() {{
      put("12", "00");
      put("11", "23");
      put("10", "22");
      put("09", "21");
      put("08", "20");
      put("07", "19");
      put("06", "18");
      put("05", "17");
      put("04", "16");
      put("03", "15");
      put("02", "14");
      put("01", "13");
      put("00", "12");
    }};
    for (String str : sArr) {
      System.out.println(str);
    }
    String amOrPm = sArr[2].substring(2);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < sArr.length; i++) {
      if (amOrPm.equals("AM")) {
        String converted = timesHM.get(sArr[0]);
        sb = sb.append(converted);
        sb = sb.append(":");
        sb = sb.append(sArr[1]);
        String newTime = sb.toString();
        System.out.println(newTime);

      } else if (amOrPm.equals("PM")) {
        sb = sb.append(sArr[0]);
        sb = sb.append(":");
        sb = sb.append(sArr[1]);

      }
    }
    String newTime = sb.toString();
    System.out.println(newTime);
  }

}
