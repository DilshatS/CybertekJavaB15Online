package day32;

import java.util.jar.JarOutputStream;

public class StringAction {

    public static void main(String[] args) {

        reversedPrintMyOwnName();

        printStringWithDashInBetween("Dilshat");
        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Tolkun");
        printStringWithDashInBetween("Lisa");
        printStringWithDashInBetween("Gulbara");

    }

    // printStringWithDashInBetween
    // it has one String Parameter called name
    // it will do following in method body
    // print each and every character of a String with dash in between
    // excluding the last one Akbar --> A-k-b-a-r
    // logic : keep concatenating - after each character
    // when it comes to last character don't add it

    public static void printStringWithDashInBetween(String name){
        // String name = "Dilshat";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            // if I am not at last index I print -
            if (i != name.length()-1){
                System.out.print("-");
            }

        }
        System.out.println();
    }

    // reversedPrintMyOwnName
    // create a method that has no parameter and print your name in reversed order

    public static void reversedPrintMyOwnName(){

//        String name1 = "Dilshat";
////        System.out.println(name.charAt(6)+name.charAt(5)+name.charAt(4)+name.charAt(3)+
////                name.charAt(2)+name.charAt(1)+name.charAt(0));
//
//        // start from last character and print toward first character
//        // put dash in between
//        for (int i = name1.length()-1; i >= 0; i--) {
//            System.out.print(name1.charAt(i));
//            if (i != name1.charAt(i)){
//                System.out.print("-");
//            }
//
//        }
//        System.out.println();
    }

}
