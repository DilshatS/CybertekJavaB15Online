package day12;

public class WarmUp_SeasonFinder {

    public static void main(String[] args) {

        /**
         * Wake up task 2
         * Create a class called WarmUp_SeasonFinder:
         *
         * Create a variable called Month with data type int
         * And write an if else if else statement to do folowing
         *
         * if the month is less than 1 or more than 12 --> INVALID MONTH
         * if the month is between 3-5 print it's Spring
         * if the month is between 6-8 print it's Summer
         * if the month is between 9-11 print it's Fall
         * if the month is 12,1,2 print it's Winter
         */

        int month = 10;

        if (month > 12 || month < 1){
            System.out.println("INVALID MONTH");
        }else if (month >= 3 && month <= 5){
            System.out.println("it's Spring");
        }else if (month >= 6 && month <= 8){
            System.out.println("it's Summer");
        }else if (month >= 9 && month <= 11){
            System.out.println("it's Fall");

//    if month 12    true     ||     false  ||    false
        }else if (month == 12 || month == 1 || month ==2){
            System.out.println("print it's Winter");
        }
        // Since first condition is already taking out
        // invalid situations, we do not need else in this code
        // else in general is optional

        // tell me a number more than 2 or less than 6
        // && -> AND
        // || -> OR

    }

}
