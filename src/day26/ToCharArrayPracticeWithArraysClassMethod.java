package day26;

import java.util.Arrays;

public class ToCharArrayPracticeWithArraysClassMethod {

    public static void main(String[] args) {

        // 2 additional String methods related to Array
        // toCharArray(), another is split(bySomething)

        String survey = "B15 Online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();
        System.out.println("Before surveyChars : " + Arrays.toString(surveyChars));
        Arrays.sort(surveyChars);

        System.out.println("After surveyChars : " + Arrays.toString(surveyChars));

    }

}
