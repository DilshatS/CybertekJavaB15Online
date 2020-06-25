package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotMarketActions {

    public static void main(String[] args) {

        Offer o1 = new Offer();

        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;

        o1.displayInformation();
        System.out.println();

        Offer o2 = new Offer();

        o2.company = "Google";
        o2.location = "Sunnyvale";
        o2.isFullTime = true;
        o2.salary = 100000;

        o2.displayInformation();
        System.out.println();

        Offer o3 = new Offer();

        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;

        o3.displayInformation();
        System.out.println();

        Offer o4 = new Offer();
        // if we don't have assign values for instance field|variable
        // we get default value
        // for primitive numbers   : 0 or 0.0
        // boolean                 : false
        // char                    : ''
        // for any reference types : null
        o4.displayInformation();
        // creating ArrayList of Offer to store multiple offer objects
        //ArrayList<Offer> myOffers = new ArrayList<>();
        List<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);

        System.out.println();
        System.out.println("myOffers -----------------------");

        for (Offer each : myOffers) {
            each.displayInformation();
        }

        System.out.println();
        System.out.println("myOffers ---------- For Loop ---------");

        for (int x = 0; x < myOffers.size(); x++) {

            // store each item to a variable each
            Offer each = myOffers.get(x);
            each.displayInformation();

            // This is one shot version
            //myOffers.get(x).displayInformation();

        }

    }

}
