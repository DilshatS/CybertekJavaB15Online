package day11;

public class LogicalOperators {

    public static void main(String[] args) {

        // combining multiple condition together

        // in java there is no range check directly like math
        // for example int x = 70;
        // in math : 60 < x < 100 --> true < 100
        // in java : x > 60 && x < 100

        // && 2 ampersand & 1 ampersand --> Logical And Operator
        // This is used to check both conditions are true at the same time
        // only when your username is right and your password is right at the same time
        // then you will be able to login
        /*
        int x = 70; x > 60 && x < 100; true

                     false      true
        int x = 10; x > 60 && x < 100; false

                      true      false
        int x = 110; x > 60 && x < 100; false

                     true      true
        int x = 99; x > 60 && x < 100; true
         */

//        System.out.println("TRUTH TABLE &&");

//        System.out.println(true && true);
//        System.out.println(false && true);
//        System.out.println(true && false);
//        System.out.println(false && false);

        System.out.println("TRUTH TABLE &&");

        System.out.println("RESULT OF true && true is : " + (true && true));
        System.out.println("RESULT OF false && true is : " + (false && true));
        System.out.println("RESULT OF true && false is : " + (true && false));
        System.out.println("RESULT OF false && false is : " + (false && false));

        System.out.println("=====================================================");

         /*
        int x = 70; x > 100 || x < 60; false

                     false      true
        int x = 10; x > 60 || x < 100; true

                      true      false
        int x = 110; x > 60 || x < 100; true

                     true      true
        int x = 99; x > 60 || x < 100; true
         */

        System.out.println("TRUTH TABLE ||");

        System.out.println("RESULT OF true || true is : " + (true || true));
        System.out.println("RESULT OF false || true is : " + (false || true));
        System.out.println("RESULT OF true || false is : " + (true || false));
        System.out.println("RESULT OF false || false is : " + (false || false));

        // Create a variable called num with type int
        // find out whether this number is more than 100 or less than 10

        // find out the number is within the range of 10-60
        // and print out the result

        int x = 55;
        System.out.println( x > 100 || x < 10 );
        // System.out.println(10 < x < 60);// error! Can not be applied to boolean, int
        System.out.println( x > 10 && x < 60 );

        // more than 2 conditions at the same time, 3 conditions

        //                        true || false ---> true
        System.out.println( true || false || false);
        //                        true && false ---> false
        System.out.println( true && true && false );

    }

}
