package day12;

public class FizzBuzzNumberCheck {

    public static void main(String[] args) {

        /**
         * Task 3
         * Create a class called FizzBuzzNumberCheck with a main method
         * Give a number, create a variable int num
         *
         * if this number ca be divided by 5 without remainder lets print It Fizz Number
         *  For Example: 5,10,15,25,100
         * if this number can be divided by 3 without remainder lets print It Buzz Number
         *  For Example: 3,6,9,12,15,27
         * if this number can be divided by both 3 and 5 lets print It FizzBuzz Number
         *  For Example: 15,30,45,90
         * if no Match, Just Say NOT MY NUMBER!!!
         */

        int num = 17;

        if (num % 5 == 0 && num % 3 == 0){
            System.out.println("It FizzBuzz Number");
        }else if (num % 5 == 0){
            System.out.println("It Fizz Number");
        }else if (num % 3 == 0){
            System.out.println("It Buzz Number");
        }else {
            System.out.println("NOT MY NUMBER!!!");
        }

    }

}
