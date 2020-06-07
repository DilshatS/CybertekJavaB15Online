package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

        // this is passing the array object directly into the method
        printArrayItems(new int[]  {1,7,5,3,12,3} );

        // this is assigning the array object into a variable
        // and then pass it into the method
        int[] scores = {2,5,8,23,4,5,7};
        printArrayItems(scores);

        printMaxOfArray(new int[]{1,2,3,4,5,6,7});
        printMaxOfArray2(new int[]{123,3,4,32,1,4532,123,43});
        printMaxOfArray(scores);
        printMaxOfArray2(scores);

        printMinOfIntArray(new int[]{2,7,23,4,0,8,34});

        printSumOfIntArray(scores);

    }

    // array printer
    // create a method that has one int array as a parameter
    // print each item in this format
    // arrays has items : --> all the items here

    public static void printArrayItems(int[] nums){

        System.out.println("arrays has items : " + Arrays.toString(nums));

    }

    // printMaxOfArray
    // this method has one int array as parameter
    // ant it will print the max number inside the array

    public static void printMaxOfArray(int[] num){

        int max = num[0];

        for (int eachNum : num) {

            if (eachNum > max){
                max = eachNum;
            }

        }

        System.out.println("max : " + max);

        }

    public static void printMaxOfArray2(int[] num){

        int max2 = num[0];

        for (int i = 0; i < num.length; i++) {
            if (max2 < num[i]){
                max2 = num[i];
            }
        }

        System.out.println("max2 : " + max2);

    }

    // printMinOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all the numbers

    public static void printMinOfIntArray(int[] num){

        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (min > num[i]){
                min = num[i];
            }
        }

        System.out.println("min : " + min);

    }

    // printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all numbers

    public static void printSumOfIntArray(int[] num){

        int sum = 0;
        for (int each : num) {
            sum = sum + each ; // sum += each
        }
        System.out.println("sum : " + sum);
    }

    // OPTIONALLY
    // checkScoresAllMoreThan60
    // this method has one int array as parameter
    // and it will check whether each and every numbers are more than 60
    // if so print everyone passed
    // if not print someone has failed

}
