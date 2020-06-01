package day30;

import java.util.Arrays;

public class SplitPractice {

    public static void main(String[] args) {

        /*
        What does split do?
        it will split the String into multiple part a

        What do I need to provide when calling it?
        We need to provide the separator

        What do I get out of it
        We get a String array out of it with each prat split

        Does it actually change your ORIGINAL String
        NO!!!
         */

        String car = "Lexus-IS-F";
        String[]carSplit = car.split("-");
        System.out.println("carSplit = " + Arrays.toString(carSplit));
        System.out.println("car = " + car);

        String model = carSplit[1];
        System.out.println("model = " + model);

    }

}
