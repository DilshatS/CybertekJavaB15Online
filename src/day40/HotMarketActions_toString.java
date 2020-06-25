package day40;

import java.util.ArrayList;
import java.util.List;

public class HotMarketActions_toString {

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

        List<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);

        System.out.println("myOffers = " + myOffers);

    }

}
