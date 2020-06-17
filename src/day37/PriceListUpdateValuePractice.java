package day37;

import jdk.jshell.spi.SPIResolutionException;

import java.util.ArrayList;
import java.util.List;

public class PriceListUpdateValuePractice {

    public static void main(String[] args) {

        //ArrayList<String> teamMates = new ArrayList<>();
        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("teamMates = " + priceList);
        // change the third price to 10$
        priceList.set(2,10.0);
        System.out.println("third item new price = " + priceList.get(2));

        // Add 4 dollar to first price : your first price value should be original price + 4
        priceList.set(0, priceList.get(0) + 4 );
        System.out.println("first item new price = " + priceList.get(0));

        // change last price to sum of first and second price
        double sumOfFirst = priceList.get(0) + priceList.get(1);
        priceList.set(priceList.size()-1, sumOfFirst);
        System.out.println("priceList.size()-1 = " + priceList.get(priceList.size()-1));

        priceList.set(priceList.size()-1, ( priceList.get(0)+priceList.get(1) ));
        System.out.println("last item new price  = " + priceList.get(priceList.size() - 1));

        System.out.println("New priceList = " + priceList);

        // give 40% off to second price, so our new price should be 40% less than original price which is 60%
        priceList.set(1, priceList.get(1) * 0.6 );
        System.out.println("AFTER 40% OFF second item value is " + priceList.get(1));

        // DOUBLE THE VALUE OF EACH AND EVERY PRICE IN THE LIST
        // THIS IS HOW WE DO IT FOR ONE, NOW WE DO IT FOR ALL OF THEM BY REPLACING THE INDEX WITH VARIABLE

        // in order to update an item we need an index and new value
        // in order to update the first value index will be 0
        // in order to double the price from the original, first we need to get the original value
        // then multiply by 2 and use that value for 2nd parameter of set method

        double newValue = priceList.get(0) * 2;
        //priceList.set(0, priceList.get(0) * 2);

        System.out.println();

        for (int x = 0; x < priceList.size(); x++) {

            //double newVal = priceList.get(x) * 2;
            //priceList.set(x, newVal);

            priceList.set(x, (priceList.get(x)*2));
        }

        System.out.println("priceList after doubling = " + priceList);
//        String strPrice = priceList+"";
//        System.out.println("strPrice = " +
//                strPrice.replace("[","").replace("]", ""));
        System.out.println();

        // Cut the price into half if the price more than 20$
        for (int i = 0; i < priceList.size(); i++) {

            double eachPrice = priceList.get(i);
            if (eachPrice > 20){
                priceList.set(i, eachPrice / 2);
            }

        }
        System.out.println("priceList after cutting = " + priceList);

        // swap the first value with the last value
        Double temp = priceList.get(0);
        priceList.set(0, priceList.get(priceList.size()-1));
        priceList.set(priceList.size()-1 , temp);

        System.out.println("\npriceList after swapping first and last value = " + priceList);

    }

}
