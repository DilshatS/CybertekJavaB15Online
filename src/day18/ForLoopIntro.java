package day18;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ForLoopIntro {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter");
//
//        int x = scan.nextInt();
//
//        for (int i = x; i < 5; i++) {
//            System.out.println("YOU GOT IT!");
//        }

        // count 1 to 5
        // for loop() has 3 parts separated by;
        // first part initialization
        // it will run only once when you enter the loop

        // second part termination condition :
        // loop will stop if it's false
        // it will be checked every time

        // third part increment or decrement to change condition eventually
        // it will run after each iteration

        for (int i = 0; i < 5 ; i++) {
            System.out.println("i = " + i);
            System.out.println("HAPPY BIRTHDAY");
        }

        for (int counter = 5; counter > 0; counter--) {
            System.out.println("counter = " + counter);
        }

    }

}
