package day10;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        // At the McDonald Drive Threw
        System.out.println("Welcome to McDonald, what can I get for you");

        /*
        11. Burger
        5 . French Fry
        8 . Nuggets
        35. Ice Cream
        55.Coke
         */

        String order = "";
        int itemNumber = 1;

        if (itemNumber == 11){
            System.out.println("Your have selected 11");
            order = "Burger";
        }else if (itemNumber == 5){
            System.out.println("Your have selected 5");
            order = "French Fry";
        }else if (itemNumber == 8){
            System.out.println("Your have selected 8");
            order = "Nuggets";
        }else if (itemNumber == 35){
            System.out.println("Your have selected 35");
            System.out.println("Yay!!!Yum!!!");
            System.out.println("Enjoy!");
            order = "Ice Cream";
        }else if (itemNumber == 55){
            System.out.println("Your have selected 55");
            order = "Coke";
        }else{
            System.out.println("You have selected unknown item number!");
            order = "Unknown";
        }
        System.out.println("Thank you for your order, your order is : " + order);
    }

}
