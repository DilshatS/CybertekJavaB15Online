package day09;

import java.util.Scanner;

public class LanguagePicker {

    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Call Center");

        System.out.println("Please select your language option from 1-7");

        Scanner scan = new Scanner(System.in);

        int LanguageOption = scan.nextInt();
        String greeting = ""; // assigning a empty String value


        if (LanguageOption == 1) {
            greeting = "Salam";
        } else if (LanguageOption == 2) {
            greeting = "Hello";
        } else if (LanguageOption == 3) {
            greeting = "Privet";
        } else if (LanguageOption == 4) {
            greeting = "Szia";
        } else if (LanguageOption == 5) {
            greeting = "Merhaba";
        } else if (LanguageOption == 6) {
            greeting = "Hola";
        } else if (LanguageOption == 7) {
            greeting = "Bonjour";
        } else {
            greeting = "Unknown";
        }
        // Hello, SDET
        greeting = greeting + ", SDET";

        System.out.println("This is how the greeting message you get : " + greeting);

    }

}
