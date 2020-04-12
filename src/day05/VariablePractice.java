package day05;

public class VariablePractice {

    public static void main(String[] args) {

        // 8 primitive
        /*
         line 1
         line 2
         line 3
         Block comment, everything in between will be seen as commect

        whole numbers : byte, short, int, double
        fractional numbers : float, double
        logical : boolean (true, false)
        character : char (single character in single quote)

        usually by default for whole numbers : just use int
        usually by default for fractional numbers : just use double

        IS String part of Primitive types ? : NOOOO!!!!
        String is sequence of character
         */

        // Task 1: Age calculator
        // given birth year, please calculate the age
        int birthYear = 2001;
        int currentYear = 2019;
        int age = currentYear - birthYear;

        // I was born in year 2001, and I am 18 years old;
        // System.out.println("I was born in year " +2001+ ", and I am " +(2019-2001)+ " years old");
        System.out.println("I was born in year " + birthYear + ", and I am " + age + " years old");

        // Task 2 : you are speeding today
        // speed limit is some number, and your current speed is this
        // generate this output of : You are driving 10 mph more than speed limit
        // speedLimit as int, currentSpeed as int, overTheLimit as int
        int speedLimit = 65;
        int currentSpeed = 95;

        int overTheLimit = currentSpeed - speedLimit;

        System.out.println("You are driving " + overTheLimit + " MPH more than speed limit");

        System.out.println("You are driving " + currentSpeed + " MPH and speed limit was " +
                 speedLimit + " MPH, that means I was driving " + overTheLimit + " over the limit");

    }

}
