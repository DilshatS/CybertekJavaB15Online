package day29;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";
        // Task :
        // Hero core is Superman and Identity is Clark Kent
        // The initial of the Hero is CK

        // LOGIC 1 : split this String by dash -
        // to get 2 pieces of String into a String array

//        String newHero = hero1.replace("-"," ");
//        System.out.println("hero1 = " + hero1);
        String[] heroSplit = hero1.split("-");
        System.out.println("heroSplitted = " + Arrays.toString(heroSplit));
        String heroCode = heroSplit[0];
        String fullName = heroSplit[1];

        System.out.println(heroSplit[0]);

        // Hero core is Superman and Identity is Clark Kent
        //System.out.println("Hero code is " + heroSplitted[0] + " and Identity is " + heroSplitted[1]);
        System.out.println("Hero code is " + heroCode + " and Identity is " + fullName);

        // The initial of Hero is CK
        // I can just use fullName variable to finish this task

        // LOGIC1 : get the first letter of full name then get the letter after the space
        //          then get first letter after space
        //          concatenate them
        //          downside is what if we have middle name
        //          solution, instead of looking for the letter after first space
        //          look for last index of the space then get next Character

        // LOGIC2 : We already have full name stored in fullName variable
        //          split by space --> we will get firstName (middle name) lastName
        //          get the first letter of full name
        //          then get the last name using last item index
        //          get the first character then concatenate
        //          Clark Kent -> [Clark, Kent] Clark -> C , Kent -> K --> CK


        String[] fullNameSplit = fullName.split(" ");
        System.out.println("fullNameSplit = " + Arrays.toString(fullNameSplit));
        String heroFirstName = fullNameSplit[0];
        // last name will be always the last element by splitting full name
        // no matter the name has middle name or not
        String heroLastName = fullNameSplit[fullNameSplit.length-1];

        System.out.println("Hero Initials : "+ heroFirstName.charAt(0) + heroLastName.charAt(0));

    }

}
