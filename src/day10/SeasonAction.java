package day10;

import java.util.Scanner;

public class SeasonAction {

    public static void main(String[] args) {

        /*
        What do tou in each season

        Spring ---> Hike, Easter , Nauriz, Blossom
        Summer ---> Swim, Vacation, BBQ, Holiday
        Fall ---> Black Friday, Hiking, Harvest, Halloween, Shopping
        Winter ---> Snowboarding, Ski, Christmas, New Year
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Hey what is the season?");

        String season = scan.next();
        // byte, short, int, char, String
        switch (season){
            case "Spring":
                System.out.println("Hike, Easter , Nauriz, Blossom");
                break;
            case "Summer":
                System.out.println("Swim, Vacation, BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("Black Friday, Hiking, Harvest, Halloween, Shopping");
                break;
            case "Winter":
                System.out.println("Snowboarding, Ski, Christmas, New Year");
            default:
                System.out.println("Unknown Season");
        }

    }

}
