package day12;

public class HardCoreCorollaFan_CarShopping {

    public static void main(String[] args) {

        // Buy Corolla (DOES NOT MATTER WHAT IS YOUR BUDGET)
        // or Tesla(only if it's within the budget, THIS CONDITION ONLY APPLY FOR TESLA)

        // there is only one car covered with cloth
        // we don't know what car is it and what is the price
        // once we take out the cloth
        // we check whether its toyota, if it's we buy it without checking the price
        // if it's not we check if its a Tesla and also check whether it is within the budget

        String carBrand = "corolla";
        int carPrice = 90000;
        double budget = 80000;

//        if (carBrand.equals("Corolla") || (carBrand.equals("Tesla") && carPrice <= budget) ){
//            System.out.println("Car Acquired!!!");
//        }else {
//            System.out.println("NOT WHAT I AM LOOKING FOR");

        if ( carBrand.equals("corolla") ){
            System.out.println("Corolla Car Acquired!!!");
        }else if ( carBrand.equals("Tesla") && carPrice <= budget ){
            System.out.println("Tesla Car Acquired!!!");
        }else {
            System.out.println("NOT WHAT I AM LOOKING FOR");
        }

    }

}
