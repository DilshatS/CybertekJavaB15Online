package day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {

        /**
         * Amazon has 2 type of user one is Prime member and another is regular member
         * prime member get free shipping in all purchase no matter the amount
         * regular member user get free shipping only if their purchase is more than 25$
         * otherwise they get 5$ shipping fee
         */

        String memberType = "member";
        //double amount = 15.99;
        float amount = 45.99f;
        int shippingFee = 0;

        // first I wanna check it's prime member or not
        if (memberType.equalsIgnoreCase("Prime member")) {
            System.out.println("You get one day free shipping");
            System.out.println("Your final price is " + amount);
            //}else if (amount > 25){
        }else if (!memberType.equalsIgnoreCase("Prime member") && amount > 25) {
            System.out.println("NOT A PRIME MEMBER BUT YOU GOT ORDER IS MORE THAN 25$");
            System.out.println("YOU GOT FREE SHIPPING ON AMOUNT " + amount);
        }else{
            System.out.println("DO YOU WANNA SIGN UP FOR PRIME MEMBERSHIP?");
            shippingFee = (int) 5;
            amount = amount + shippingFee; // amount += shippingFee
            System.out.println("YOUR FINAL AMOUNT IS " + amount);
        }

    }

}
