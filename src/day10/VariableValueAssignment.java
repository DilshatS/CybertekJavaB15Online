package day10;

public class VariableValueAssignment {

    public static void main(String[] args) {

        int offerCount = 3;
        //String message; // this line is just declaring a variable
        //String message = "something"; // this line is declaring and assigning the value
        // assigning the value for the first time, also called initializing\
        //message = "something else"; // changing the value | reassigning


        // not initializing and having empty String value are 2 DIFFERENT THINGS!!!
        String message = ""; // this line is just declaring a variable

        // Any variable that you declare inside { // block }
        if (offerCount > 2){
            //String message = "Great Job!"; // we can't what is in the bedroom from living room if it close door
            message = "Great Job!";
        }

        System.out.println(message);
    }

}
