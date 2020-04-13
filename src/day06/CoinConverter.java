package day06;

public class CoinConverter {

    public static void main(String[] args) {

        // you have 200 cents
        // how many quarter you can get 25c
        // how many dime you can get 10c
        // how many Nickel you can get 5c
        // how many penny you can get
        int cent = 200;

        // you have purchase candle for 0.74 cent, what would be your remainder

        cent -= 74; // 126 cent after spending 74 cent for candle

        int quarter = cent / 25 ; // 126/25 --> 5, 1 is reminder
        int penny = cent % 25;
        System.out.println(quarter);
        System.out.println(penny);

        // now I want to try to calculate dime for same money I got after purchase

        int dime = cent / 10; // --> 126 / 10 = 12 and remainder is 6
        // how much penny I have after getting dime 126 % 10 ---> 6
        // create new penny2 for not mixing with previous one
        int penny2 = cent % 10;
        System.out.println(dime);
        System.out.println(penny2);


    }

}
