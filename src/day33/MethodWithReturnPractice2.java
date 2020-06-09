package day33;

/**
 * Method with return type practice
 * @author Dilshat
 */

public class MethodWithReturnPractice2 {

    public static void main(String[] args) {

        // TODO 1, Call your method here to test
        System.out.println(getDaysOfTheWeekFromNumber(5));
        System.out.println(getDaysOfTheWeekFromNumber(15));
        // TODO 2, OPTIONALLY , Create an int Array that has 5 numbers, test your code with those
        int[] allCodes = {5,3,11,4,33};

        for (int x = 0; x < allCodes.length; x++) {

            String day = getDaysOfTheWeekFromNumber(allCodes[x]);
            System.out.println("day = " + day);

        }

        System.out.println("---------------");

        for (int eachCode : allCodes) {

            System.out.println("each day : " + getDaysOfTheWeekFromNumber(eachCode));

        }



        System.out.println(getDaysOfTheWeekFromNumberWithoutSwitch(5));

    }

    /**
     * getDaysOfTheWeekFromNumber
     * This method will take number from 1-7
     * and convert that to actual day in word
     * @param dayCode as int to represent day in number
     * @return the day in word in English as String if the number is valid
     *         if the number is not 1-7 return FUN DAY!!!
     */

    public static String getDaysOfTheWeekFromNumber(int dayCode){

        String dayName = "";
        switch (dayCode){
            case 1:
                return "Monday";
//                dayName = "Monday";
//                break;
            case 2:
                return "Tuesday";
//                dayName = "Tuesday";
//                break;
            case 3:
                return "Wednesday";
//                dayName = "Wednesday";
//                break;
            case 4:
                return "Thursday";
//                dayName = "Thursday";
//                break;
            case 5:
                return "Friday";
//                dayName = "Friday";
//                break;
            case 6:
                return "Saturday";
//                dayName = "Saturday";
//                break;
            case 7:
                return "Sunday";
//                dayName = "Sunday";
//                break;
            default:
                return "FUN DAY!!!";
//                dayName = "FUN DAY!!!";
        }

//        return dayName;

    }

    /**
     * Get Days Of The Week From Number Without Switch
     * @param dayCode
     * @return
     */
    public static String getDaysOfTheWeekFromNumberWithoutSwitch(int dayCode){

        String[] daysArray = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String day = "";
        if (dayCode > 0 && dayCode <= 7){
            day = daysArray[dayCode-1];
        }else {
            day = "FUN DAY!!!";
        }
        return day;
    }

}
