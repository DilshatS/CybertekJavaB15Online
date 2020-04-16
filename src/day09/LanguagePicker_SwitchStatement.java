package day09;

import java.util.Scanner;

public class LanguagePicker_SwitchStatement {

    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Call Center");

        System.out.println("Please select your language option from 1-7");

        //Scanner scan = new Scanner(System.in);

        int languageOption = 1;
        String greeting = "";

        switch (languageOption) {
            case 1:
                greeting = "Salam";
                break;
            case 2:
                greeting = "Hello";
                break;
            case 3:
                greeting = "Privet";
                break;
            case 4:
                greeting = "Szia";
                break;
            case 5:
                greeting = "Merhaba";
                break;
            case 6:
                greeting = "Hola";
                break;
            case 7:
                greeting = "Bonjour";
                break;
            default:
                greeting = "Unknown";
        }
        greeting = greeting + ", SDET";

        System.out.println("This is how the greeting message you get : " + greeting);
    }

}
