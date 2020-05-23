package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {

    public static void main(String[] args) {

        /*
        Array : a variable that allows us to store multiple values

        Array's size is fixed

            declaration :
                Data-Type[] variableName = {data1, data2, ...};
                each elements data-type is same with Array's data type

            regular/primitives variables :
            we can store only one single value
                int a = 10;
            array variables :
                int[] arr = {1, 2, 3};
                index :      0  1  3

              retrieve data:
                arrayName[indexNumber] -> element of that index number
                EX: arr[2] -> 3

                Array MUST be converted to String in order to be printed

         */

        int num = 10;
        int[] arr = {10, 20, 30, 40, 50, 60};
        // length: returns the total number of elements from the array
        // last index num: arr.length-1;
        int num1 = arr[arr.length - 1];
        //                 6     -1   = index [5] // 60
        System.out.println(num1);
        System.out.println("===========================");

        // expected : 10 20 30 40 50 60

        for (int x = 0; x < arr.length; x++) {

            System.out.print(arr[x] + " ");

        }
        System.out.println("\n===========================");
        // Arrays.toString():
        String str = Arrays.toString(arr);
        System.out.println(str);

        // Tas01:
        // write a program that asks user to enter a number 5 times,
        // and store those number into array

        // print the largest number

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        Scanner scan = new Scanner(System.in);

        for (int x = 0; x < 5; x++) {

            System.out.println("Enter an in number!!!");
            //int input = scan.nextInt(); // returns int data type
            numbers[x] = scan.nextInt();

        }

        System.out.println(Arrays.toString(numbers));

        // Arrays.sort(variableName): sorts the array in ascending order

        Arrays.sort(numbers);

        int largestNumber = numbers[numbers.length-1];
        int minNumber = numbers[0];

        System.out.println("Largest number is : " + largestNumber);
        System.out.println("Minimum number is : " + minNumber);


    }

}
