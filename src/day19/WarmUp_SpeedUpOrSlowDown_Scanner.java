package day19;

import java.util.Scanner;

public class WarmUp_SpeedUpOrSlowDown_Scanner {

    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " ");
//        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter starting speed ");
        int start = scan.nextInt();

        System.out.println("Enter ending speed");
        int end = scan.nextInt();


        System.out.print("you have started at speed --> ");

        if (start < end) {
            System.out.println("INCREASING SPEED ");
            // I will decrease the speed till I reach ending speed
            for (int i = start; i <= end; i++) {
                System.out.print(i + ",");
            }

        } else if (start > end) {
            System.out.println("DECREASING SPEED ");
            // I will decrease the speed till I reach ending speed
            for (int x = start; x >= end; x--) {
                System.out.print(x + ",");
            }
        } else {
            System.out.println("NO ACTION NEEDED!!! SAME SPEED!!!");
        }

    }

}
