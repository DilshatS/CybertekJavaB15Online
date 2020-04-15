package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your current speed? : ");

        int speed = scan.nextInt();
        System.out.println("What is speed limit? : ");

        int speedLimit = scan.nextInt();

        if (speed >= speedLimit){
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        }
        // there is no else, program just move on
        System.out.println("THE END! Move on!");
    }

}
