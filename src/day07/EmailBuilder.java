package day07;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name, last name, company by space : ");

        String firstName, lastName, company, email;
        firstName = scan.next();
        lastName = scan.next();
        company = scan.next();
        // firstName_lastName@company.com
        email = firstName + "_" + lastName + "@" + company + ".com";
        System.out.println("My name is " + firstName + " " + lastName + " and I work for " +
                company + ", my email is " + email);

    }

}
