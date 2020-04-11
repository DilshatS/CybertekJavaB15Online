package day04;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fahrenheit");

        double fahrenheit = scan.nextDouble();
        double celsius ;

        celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println(fahrenheit + "F equals to " + celsius + "C.");

    }

}
