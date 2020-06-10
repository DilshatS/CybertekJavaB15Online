package day34;

public class PracticeMethodWithNumbers {

    public static void main(String[] args) {

        // DO NOT TREAT NUMBER AS A STRING
        // for example 376 -> digit 1 is 3, digit2 is 7, digit3 is 6


        System.out.println(build3DDigitNumber(4,2,4));
        System.out.println(build3DDigitNumber(0,2,1));
        System.out.println(build3DDigitNumber(65,6,9));

        int result1 = build3DDigitNumber(6,4,0);
        System.out.println("result1 = " + result1);

        int result2 = build3DDigitNumber(6,14,0);
        System.out.println("result2 = " + result2);

        System.out.println(build3DDigitNumber(16,14,90));

        // add the result of first 2 method call
        System.out.println("result2+result2 = " + result1 + result2);
        System.out.println( result1 + result2 + " is final result of result1 + result2" );

    }

    // 1. Write a method called build3DDigitNumber
    // it has 3 int parameters digit1 digit2 digit3
    // and it will return the 3 digit numbers you have build
    // if any of digit1 digit2 digit3 is not within range of 0-9 the change it to 0

    // for example :
    // build3DDigitNumber(4,2,4) -> 424
    // build3DDigitNumber(0,2,1) -> 21
    // build3DDigitNumber(65,6,9) -> 69

    public static int build3DDigitNumber(int digit1, int digit2, int digit3){

        // if(digit1)

        if (digit1<0 || digit1>9){
            digit1 = 0;
        }
        if (digit2<0 || digit2>9){
            digit2 = 0;
        }
        if (digit3<0 || digit3>9){
            digit3 = 0;
        }

        // if you come to this point, it should be already valid
        int number = digit1 * 100 + digit2 * 10 + digit3;
        return number;

    }

}
