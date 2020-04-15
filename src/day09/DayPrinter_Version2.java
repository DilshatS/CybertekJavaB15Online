package day09;

public class DayPrinter_Version2 {

    public static void main(String[] args) {

        /*
        if the dayCode is 1 -> Monday
        if the dayCode is 2 -> Tuesday
        if the dayCode is 3 -> Wednesday
        if the dayCode is 4 -> Thursday
        if the dayCode is 5 -> Friday
        if the dayCode is 6 -> Saturday
        if the dayCode is 7 -> Sunday
        if none of the above just print unknown day
         */

        int dayCode = 7;
        String dayName = ""; // assigning a empty String value
        //String dayName;

        if (dayCode == 1) {
            dayName = "Monday";
        } else if (dayCode == 2) {
            dayName = "Tuesday";
        } else if (dayCode == 3) {
            dayName = "Wednesday";
        } else if (dayCode == 4) {
            dayName = "Thursday";
        } else if (dayCode == 5) {
            dayName = "Friday";
        } else if (dayCode == 6) {
            dayName = "Saturday";
        } else if (dayCode == 7) {
            dayName = "Sunday";
        } else {
            dayName = "Unknown";
            //System.out.println("Day is : " + dayName);
        }
        System.out.println("Day is : " + dayName);
    }

}

