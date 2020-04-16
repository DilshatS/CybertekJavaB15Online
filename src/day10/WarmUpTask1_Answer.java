package day10;

public class WarmUpTask1_Answer {

    public static void main(String[] args) {

        String myAnswer = "";
        int myNumber = 46;

        //myAnswer = "Something here";

        if ( myNumber % 5 == 0 ){
            myAnswer = "Fizz Number";
        }else {
            myAnswer = "Not a fizz number";
        }
        System.out.println("print my number is " + myNumber + ", It is " + myAnswer);
    }

}
