package day15;

import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Print your name");

        String name = scan.next();

        int lengthOfTheName = name.length();
        System.out.println("length Of The Name = " + lengthOfTheName);

        if (lengthOfTheName < 4){
            System.out.println("Short name");
            // lengthOfTheName >= 4
        }else if (lengthOfTheName >= 4 && lengthOfTheName <= 11){
            System.out.println("Medium name");
        }else {
            System.out.println("Longer name");
        }
        //      true || true ---> true
        if (name.contains("e") || name.contains("e")){
            System.out.println("Name contain a or e");
        }else {
            System.out.println("I don't have both a or e in my name");
        }

//        if (name.contains("a") || name.contains("e")) {
//            System.out.println("Name contains a or e");
//
//            if (name.length() < 4) {
//                System.out.println("Short name");
//            } else if (name.length() >= 4 && name.length() <= 11) {
//                System.out.println("Medium name");
//            } else {
//                System.out.println("Longer name");
//            }
//
//
//        }else {
//            System.out.println("I don't have both a or e in my name");
//        }
//
    }

}
