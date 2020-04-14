package day07;

import java.util.Scanner;

public class ReplTask_20_TIme {

    public static void main(String[] args) {

        int hour, minute, second;
        String amOrPm;

        Scanner scan = new Scanner(System.in);
        hour = scan.nextInt();
        minute = scan.nextInt();
        second = scan.nextInt();
        amOrPm = scan.next();

        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);

    }

}
