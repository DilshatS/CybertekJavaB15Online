package day30;

import java.util.Arrays;

public class SplitPractice {

    public static void main(String[] args) {

        String car = "Lexus-IS-F";
        String[]carSplit = car.split("-");
        System.out.println("carSplit = " + Arrays.toString(carSplit));

        String model = carSplit[1];
        System.out.println("model = " + model);

    }

}
