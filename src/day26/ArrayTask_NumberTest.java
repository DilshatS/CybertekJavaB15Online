package day26;

import java.util.Arrays;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {

        /*
        1. given an int array
           write a program to test all the element in this int array are more that 100
         */

        int[] scores = {156, 101, 76, 187, 87, 110};

        // create a variable called finalResult to store
        // your result of checking if every number in this array is more than 100 or not

// if all numbers are more than 100 then make it yes , if not make it no

        String finalResult = "";
        // LOGIC 1 :
        // take each item check if it is less than 100, count.
        // in the end if count is more than 0, answer is NO,

        int cntLessThan100 = 0;
        for (int eachNum : scores) {

            if (eachNum <= 100) {
                System.out.println("eachNum = " + eachNum);
                cntLessThan100++;
            }

        }
        System.out.println("cntLessThan100 = " + cntLessThan100);
        if (cntLessThan100 > 0) {
            finalResult = "NO";
        } else {
            finalResult = "YES";
        }
        System.out.println("finalResult = " + finalResult);

        // LOGIC 2 :
        // Check each item and break when number is less than 100  after assigning final result to NO

        // LOGIC 3 :
        // minus 100 from all numbers in array and if any of the numbers are negative, it will be a NO

        // LOGIC 4 :
        // find min number if min number more than 100 yes


    }


}
