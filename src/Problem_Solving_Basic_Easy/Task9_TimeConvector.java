package Problem_Solving_Basic_Easy;


import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//convert it to military (24-hour) time.
public class Task9_TimeConvector {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();

        String result = timeConversion(time);
        System.out.println(result);
    }

    //07:05:45PM

    private static String timeConversion(String time) {
        String returnString = "";

        String theFirstTwoDigit = time.substring(0, 2);

        String timeOne = time.substring(2, time.length() - 2);

        if (time.indexOf("A") >= 1) {
            if ("12".equals(theFirstTwoDigit)) {
                returnString = "00" + timeOne;
            } else {
                returnString = timeOne;
            }
        } else if (time.indexOf("P") >= 1) {
            if ("12".equals(theFirstTwoDigit)) {
                returnString = timeOne;
            } else {
                Integer theFirstTwoDigitInt
                        = Integer.parseInt(theFirstTwoDigit) + 12;
                returnString = theFirstTwoDigitInt
                        + timeOne;
            }
        }

        return returnString;

    }

}

