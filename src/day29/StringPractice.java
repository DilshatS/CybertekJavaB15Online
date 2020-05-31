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

        System.out.println(heroSplitted[0]);

    }

}
