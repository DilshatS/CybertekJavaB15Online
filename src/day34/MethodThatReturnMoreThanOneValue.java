package day34;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        char[] eachChars = sentence.toCharArray();
        String[] eachWords = sentence.split(" ");

        System.out.println(Arrays.toString(eachChars));
        System.out.println(Arrays.toString(eachWords));

        int[] resultArr = returnBoysAndGirlsResult();
        System.out.println(Arrays.toString(resultArr));

    }

    // create a method that return int array returnBoysAndGirlsResult
    public static int[] returnBoysAndGirlsResult(){

        // after fierce competition
        int[] boysGirlsCount = {59, 59};
        return boysGirlsCount;

    }

}
