package day33;

public class NumberActions {

    public static void main(String[] args) {

        System.out.println(getSumFrom1toX(7));

    }

    /**
     * create a method getSumFrom1toX
     * This should calculate the sum of
     * the numbers from 1 to the positive number user passed
     * @param x final number to be added
     * @return the sum of numbers from 1 to x as int
     */

    public static int getSumFrom1toX(int x){
        int sum = 0;

        // TODO: YOUR CODE GOES HERE
        for (int i = 1; i <= x; i++) {
            sum += i; // sum = sum + i;
        }

        return sum;
    }

    /**
     * build_GOT_Gmail
     * This method should build email using user's full name
     * for example Jon Snow -> JSnow@NughWatch.com
     * @param firstName user's first name
     * @param lastName user's last name
     * @return the email created using
     * firstName initial+lastName+@NughWatch.com
     */
}
