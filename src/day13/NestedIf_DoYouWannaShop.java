package day13;

public class NestedIf_DoYouWannaShop {

    public static void main(String[] args) {

        // create a boolean store the result of youWantToShop
        // if yes,do you want go to Store or do you wanna shop online
        // if user do not wanna shop at all, print Good job stay home coding!!!

        boolean youWantToShop = true;
        String preference = "store";
        String storeShop = "Zara";

        //if (youWantToShop){
        if (youWantToShop == true) {

            if (preference.equalsIgnoreCase("Store")) {
                System.out.println("GOING TO STORE FOR SHOPPING");

                if (storeShop.equalsIgnoreCase("Zara")) {
                    System.out.println("You going to zara");
                } else if (storeShop.equalsIgnoreCase("Banana republic")) {
                    System.out.println("You going to Banana Republic");
                } else {
                    System.out.println("You choose another store");
                }

            } else {
                System.out.println("GOING ONLINE FOR SHOPPING");
            }

        } else {
            System.out.println("Good job stay home coding!!!");
        }

    }
}
