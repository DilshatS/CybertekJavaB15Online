package day29;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumbers {

    public static void main(String[] args) {

        // create an array with size 100 and fill it up as below
        // fill up this array with even numbers starting from 0
        int[] numbers = new int[100];
//      this is what we would do without the loop
        numbers[0] = 0;   // 0 * 2
        numbers[1] = 2;   // 1 * 2
        numbers[2] = 4;   // 2 * 2
        numbers[3] = 6;   // 3 * 2
        numbers[4] = 8;   // 4 * 2
        numbers[5] = 10;  // 5 * 2
        numbers[6] = 12;  // 6 * 2
        numbers[7] = 14;  // 7 * 2
        numbers[8] = 16;  // 8 * 2
        numbers[9] = 18;  // 9 * 2
        numbers[10] = 20; // 10 * 2
//      ...
        numbers[99] = 198;

        // numbers[x] = x * 2

        //                                    \n will move it to next line
        System.out.println("Before filling up \n" + Arrays.toString(numbers));

        for (int x = 0; x < numbers.length; x++) {

            numbers[x] = x * 2;

        }
        System.out.println("After filling up \n" + Arrays.toString(numbers));

    }

}
