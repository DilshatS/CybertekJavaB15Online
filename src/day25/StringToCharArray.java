package day25;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {

        // pick up your own name and turn in into char array
        // and use for each loop to loop over them
        // OPTIONALLY count how many you a have in your name

        String name = "Dilshat";
        // turn this into charArray using toCharArray() method of String

        char[] allCharsInName = name.toCharArray();
        //System.out.println("namesChar = " + Arrays.toString(allCharsInName));

        for (char eachChar : allCharsInName) {

             System.out.println("eachChar = " + eachChar);

        }

    }

}
