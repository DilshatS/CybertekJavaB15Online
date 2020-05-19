package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {

        // Arrays class a class coming from java.util package
        // it has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString -> Arrays.toString(yourArrayHere)
        // This method will give you String representation of any type of array
        // the result will look -> [item1, item2, item3 ... lastItem]

        String[] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        //System.out.println(superHeros);
        System.out.println("Arrays.toString(superHeros) result : ");
        System.out.println(Arrays.toString(superHeros));

        System.out.println("----------------------------------");

        // saving the string result into a variable and print
        String superHerosAsString = Arrays.toString(superHeros);
        System.out.println("superHerosAsString result : ");
        System.out.println(superHerosAsString);

        System.out.println("----------------------------------");

        // how do we get first character of superHerosAsString variable
        System.out.println("superHerosAsString.charAt(0) result : ");
        System.out.println(superHerosAsString.charAt(0));

        System.out.println("----------------------------------");

        int[] numbers = {10,44,55,3,78};
        System.out.println("Arrays.toString(numbers) result : ");
        System.out.println(Arrays.toString(numbers));

        // create an double array of 3 items called prices; and put 3 value
        // get a string representation out of this array and save it as pricesString
        // print each and every character in this String in this format
        // character at index 0 is : yourCharacterHere
        // character at index 1 is : yourCharacterHere and so on all the way till last

        System.out.println("--------------TASK----------------");

        double[] prices = {3.14, 5.5, 9.0 };
        // since the method give you back a string representation of array object
        // in this format [ firstItem, secondItem, thirdItem .... lastItem]
        // I can save it into String variable
        String pricesString = Arrays.toString(prices);
        System.out.println("pricesString = " + pricesString);

        // we are looping over a String not an array so we after at last character finishes
        for (int x = 0; x < pricesString.length(); x++) {
            System.out.println("character at index " + x + " is : " + pricesString.charAt(x));
        }

        // THE SOLE PURPOSE OF Arrays.toString(yourArray) is TO SEE WHAT IS INSIDE

        System.out.println("----------------------------------");

//        double[] prices = {1.99, 2.99, 3.99};
//        System.out.println("Arrays.toString(prices) result : ");
//        System.out.println(Arrays.toString(prices));



        // for sorting an array in ascending order
        // sort -> Arrays.sort(youArrayHere)

        // for checking for equality of 2 array object content
        // equals -> Arrays.equals(firstArray, secondArray)

    }

}
