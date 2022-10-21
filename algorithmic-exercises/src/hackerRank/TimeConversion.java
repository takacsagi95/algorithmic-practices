package hackerRank;

import java.util.HashMap;

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
    String amOrPm = sArr[2].substring(2);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < sArr.length; i++) {
      if (amOrPm.equals("AM")) {
        String converted = timesHM.get(sArr[0]);
        sb.append(converted);
        sb.append(":");
        sb.append(sArr[1]);
        sb.append(":");
        sb.append(sArr[2].substring(0,2));
        break;
      } else if (amOrPm.equals("PM")) {
        sb.append(sArr[0]);
        sb.append(":");
        sb.append(sArr[1]);
        sb.append(":");
        sb.append(sArr[2].substring(0,2));
        break;
      }
    }
    String newTime = sb.toString();
    System.out.println(newTime);
  }

  // Method with other logic - IN PROGRESS !!! NOT DONE !!!!
  public static void timeConversionSecond(String s) {
    String[] sArr = s.split(":");
    String amOrPm = sArr[2].substring(2);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < sArr.length; i++) {
      if (sArr[2].substring(2).equals("AM")) {
        int hour = Integer.parseInt(String.valueOf(sArr[0]));
        hour += 12;
        String hourStr = Integer.toString(hour);
        sb.append(hourStr);
        sb.append(":");
        sb.append(sArr[1]);
      } else if (sArr[2].substring(2).equals("PM")) {

      }
    }
  }
}
