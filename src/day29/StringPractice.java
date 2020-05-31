package day29;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";
        // Task :
        // Hero core is Superman and Identity is Clark Kent
        // The initial of the Hero is CK

        // LOGIC 1 : split this String by dash -
        // to get 2 pieces of String into a String array

//        String newHero = hero1.replace("-"," ");
//        System.out.println("hero1 = " + hero1);
        String[] heroSplitted = hero1.split("-");
        System.out.println("heroSplitted = " + Arrays.toString(heroSplitted));
        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];

        System.out.println(heroSplitted[0]);

        // Hero core is Superman and Identity is Clark Kent
        //System.out.println("Hero code is " + heroSplitted[0] + " and Identity is " + heroSplitted[1]);
        System.out.println("Hero code is " + heroCode + " and Identity is " + fullName);

        // The initial of Hero is CK
        // I can just use fullName variable to finish this task

        // LOGIC1 : get the first letter of full name then get the letter after the space
        //          then get first letter after space
        //          concatenate them



    }

}
