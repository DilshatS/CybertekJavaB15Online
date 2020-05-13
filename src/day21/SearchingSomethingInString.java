package day21;

public class SearchingSomethingInString {

    public static void main(String[] args) {

        /*
        Given your name stored in a variable myName as String
        for example: String myName = "My name is YourName here";

        1. loop through each and every character print them out like this: M->y-> n->a->m->e and so on
        put arrow in between the character
        I chalenge you to use substring for this task
         */

        //               012345678901234567890123
        String myName = "Gulay Dimerel";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);

//        01234
//        Hello
//        int x = 0;
//        System.out.println(myName.substring(x,x+1));  H
//        x++; 1
//        System.out.println(myName.substring(x,x+1));  e
//        x++; 2
//        System.out.println(myName.substring(x,x+1));  l
//        x++; 3
//        System.out.println(myName.substring(x,x+1));  l
//        x++; 4
//        System.out.println(myName.substring(x,x+1));  0

//        for hello example : there is two way to represent when do we keep looping
//        if the x value is less than or equal to 4, x <= 4
//        if the x value is less than 5, x < 5

        //for (int x = 0; x < charCount; x++) {
        for (int x = 0; x <= lastCharIndex; x++) {

            //System.out.print( myName.charAt(x)+ "->" );
            System.out.print(myName.substring(x,x+1)+"->");

        }

        System.out.println();

        for (int x = 0; x <= lastCharIndex-1; x++) {
        //for (int x = 0; x < charCount-2; x++) {

            String twoChar = myName.substring(x,x+2);
            System.out.print(twoChar + "->");

        }

        System.out.println();

        for (int x = 0; x <= lastCharIndex-2; x++) {
            //for (int x = 0; x < charCount-2; x++) {

            String twoChar = myName.substring(x,x+3);
            System.out.print(twoChar + "->");

        }


    }

}
