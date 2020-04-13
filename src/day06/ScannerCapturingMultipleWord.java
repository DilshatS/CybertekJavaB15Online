package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {

         /*
        Task 4
        use nextLine to ask your bio
        what is your city
        which city you live in, including state, Tyson, VA
        What is your street address
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? : ");
        // nextLine method of Scanner is used to capture

        String name = scan.nextLine();

        System.out.println("You have entered : " + name);

        System.out.println("Which city you live in, including state? : " );
        String cityAndState = scan.nextLine();
        System.out.println("You have entered City and State : " + cityAndState);

        System.out.println("What is your street address? : ");
        String streetAddress = scan.nextLine();
        System.out.println("Your street address : " + streetAddress);

    }

}
