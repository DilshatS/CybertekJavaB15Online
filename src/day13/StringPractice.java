package day13;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        //String actions that we already know so far

        // equals
        String s1 = "hello"; // "hello" is object, s1 is remote control
        System.out.println(s1.equals("hello"));
        // equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("Hello"));

        // toUpperCase method of String is used to make String all character uppercase
        System.out.println(s1);
        System.out.println(s1.toUpperCase());

        // toLowerCase method of String is used to make String all character lowercase
        System.out.println(s1.toLowerCase());

        // store your name into a variable
        // print your name in all uppercase
        // you may optionally concatenate "my name is : " + yourName";

        // In order to get how many character we have inside String
        // we can use length method of String
        // it will count each and every
        System.out.println(s1.length());

        int lengthOfStr = s1.length();
        System.out.println(lengthOfStr);
        if (lengthOfStr > 4){
            System.out.println("more than 4 characters");
        }else{
            System.out.println("less than 4 characters");
        }

    }

}
