package day17;

import java.util.Scanner;

public class ReversePrintString {

    public static void main(String[] args) {


        // get your name printed in reversed order
        // assuming you don't know the length

        // find out the location of your last character of your name
        // pick your last character of your name
        // then keep shifting the location to pick until first character

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name");
        //             01234567 index = count - 1
        //String name = "Birnigar";
        //             12345678 count = name.length()
        String name = scan.nextLine();

        int lastCharacterIndex = name.length()-1; // IMPORTANT !!! LAST CHARACTER INDEX OF STRING!!!

        while ( lastCharacterIndex >= 0 ){
            System.out.println("index : " + lastCharacterIndex + " : " + name.charAt(lastCharacterIndex));
            --lastCharacterIndex;
        }


    }

}
