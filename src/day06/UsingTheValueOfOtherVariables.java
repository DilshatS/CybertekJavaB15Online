package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {

        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My favorite number " + myFavoriteNumber);
        System.out.println("Your favorite number " + yourFavoriteNumber);

        yourFavoriteNumber = 100;
        System.out.println("My favorite number = " + myFavoriteNumber);
        System.out.println("Your favorite number = " + yourFavoriteNumber);

        // Create a variable called yourOrder, type String and assign a value
        // optionally assign this value using scanner
        // Create another variable called myOrder and assign the value
        // to same value as yourNumber by copying
        // and just print them out

    }

}
