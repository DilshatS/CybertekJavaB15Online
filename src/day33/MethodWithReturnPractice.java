package day33;

public class MethodWithReturnPractice {

    /**
     * Practicing method with return type
     * @author : Dilshat
     * @param args
     */

    public static void main(String[] args) {
        // 1+2+3+4+5+6+7 = 28
        System.out.println(getSumFrom1toX(7));

        System.out.println(build_GOT_Gmail("Dilshat", "Sadamov"));
        System.out.println(build_GOT_Gmail("Sam", "Tarly"));

        // you are given a variable fullName that has first name and last name
        // use this full name to generate GOT_email

        String fullName = "Susan Cure";
//        store this resulting email
//        String part1 = fullName.split(" ")[0];
//        String part2 = fullName.split(" ")[1];
//        String herEmail = build_GOT_Gmail(part1,part2);


        String[] fullNameSplit = fullName.split(" ");
        String herEmail = build_GOT_Gmail(fullNameSplit[0], fullNameSplit[1]);

        System.out.println("herEmail = " + herEmail);

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
     * for example Jon Snow -> JSnow@NighWatch.com
     * @param firstName user's first name
     * @param lastName user's last name
     * @return the email created using
     * firstName initial+lastName+@NughWatch.com
     */

    public static String build_GOT_Gmail(String firstName, String lastName){

        String domain = "@NighWatch.com";
        String email = firstName.charAt(0) + lastName + domain;

        return email;

    }
}
