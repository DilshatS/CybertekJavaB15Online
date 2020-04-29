package day16;

public class Count1To10 {

    public static void main(String[] args) {

        int counter = 1;

        while ( counter < 11 ){
            System.out.println("counter value is : " + counter);
            // SOMETHING HAS TO BE DONE TO CHANGE THE CONDITION ALONG THE WAY
            // OR IT KEEP RUNNING FOREVER
            ++ counter;
        }

        System.out.println("----------------------------");

        int count = 10;

        while ( count >= 1 ) {
            System.out.println("counter value is : " + count);
            // SOMETHING HAS TO BE DONE TO CHANGE THE CONDITION ALONG THE WAY
            // OR IT KEEP RUNNING FOREVER
            -- count;

        }

    }

}
