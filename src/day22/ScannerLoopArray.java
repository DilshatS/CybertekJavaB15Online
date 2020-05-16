package day22;

import java.util.Scanner;

public class ScannerLoopArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // create int array with capacity 10
        // and assigning it to numbers variable
        int[] numbers = new int[10];

        for (int x = 0; x < numbers.length; x++) {

            System.out.println("Enter your number " + (x+1));
            // filling up the array value with scanner
            numbers[x] = scan.nextInt();

        }
        // printing out what's inside the array
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x]);
        }

//        int[] newNumber = new int[5];
//
//        for (int x = 0; x < newNumber.length; x++) {
//
//            System.out.println("Enter number : " + (x+1));
//            newNumber[x] = scan.nextInt();
//        }
//
//        for (int x = 0; x < newNumber.length; x++) {
//            System.out.print(newNumber[x] + " ");
//        }

    }

}


