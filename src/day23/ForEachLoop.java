package day23;

public class ForEachLoop {

    public static void main(String[] args) {

        double[] prices = {99.23, 11.99, 100.23, 99.99, 56.34};

        // for each loop syntax
        // for ( dataTypeOfYourArray and variableNameOfEachItem : yourArrayVariable ){

        // do something with your array items
        //}

//        for (int x = 0; x < prices.length; x++) {
//
//            double eachPrice = prices[x];
//            System.out.println("eachPrice = " + eachPrice);
//
//        }
        // for each loop can only be used for collection/array
        // there in no INFINITE loop ever in for each loop
        for ( double eachPrice : prices ){

            System.out.println("eachPrice = " + eachPrice);

        }

    }

}
