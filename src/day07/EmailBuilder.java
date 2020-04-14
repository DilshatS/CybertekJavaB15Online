package day07;

public class EmailBuilder {

    public static void main(String[] args) {

        String firstName, lastName, company, email;
        firstName = "Astrid";
        lastName = "Enver";
        company = "Verizon";
        // firstName_lastName@company.com
        email = firstName + "_" + lastName + "@" + company + ".com";
        System.out.println("My name is " + firstName + " " + lastName + " and I work for " +
                company + ", my email is " + email);

    }

}
