package day12;

import java.util.Scanner;

public class SeasonChecker {

    public static void main(String[] args) {

        /**
         * Task 5
         * Create a String variable season
         * Assign value by asking user question: Enter your season Please!
         *
         * Check the season using if statement without caring about the case
         * Spring ---> Hiking, Easter , Nauriz, Blossom
         * Summer ---> Swim, Vacation, BBQ, Holiday
         * Fall ---> Black Friday, Hiking, Harvest, Halloween, Shopping
         * Winter ---> Code, Ski, Christmas, New Year, Snowman
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season Please!");

        String season = scan.next();

        if (season.equalsIgnoreCase("spring")){
            System.out.println("Hiking, Easter , Nauriz, Blossom");
        }else if (season.equalsIgnoreCase("summer")) {
            System.out.println("Swim, Vacation, BBQ, Holiday");
        }else if (season.equalsIgnoreCase("fall")) {
            System.out.println("Black Friday, Hiking, Harvest, Halloween, Shopping");
        }else if (season.equalsIgnoreCase("winter")) {
            System.out.println("Code, Ski, Christmas, New Year, Snowman");
        }else{
            System.out.println("NOT VALID!!!PLEASE TRY AGAIN!!!");
        }
    }

}
