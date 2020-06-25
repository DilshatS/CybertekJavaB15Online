package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    /**
     * This is instance method to print all the information about Offer object
     * no parameter and no return type
     */
    // inside instance method we can directly access instance variable
    public void displayInformation(){

        System.out.println("Location = " + location + " | " + "Company = " + company + " | "
                            + "Salary = " + salary + "$ | " + "isFullTime " + isFullTime);

    }

    // Write a method called turnToFullTime
    public void turnToFullTime(){

        if ( isFullTime == false ) {
            isFullTime = true;
        }else {
            System.out.println("ALREADY FULL TIME!!!");
        }

    }

    // Write a method to change the location of the Offer
    // to the location user passed
    public void changeLocation(String newLocation){

        location = newLocation;

    }

    public void changeCompany(String newCompany){
        company = newCompany;
    }

    // Write a method to accept 4 parameters to change all info
    // about offers
    public void changeAllInfo(String newCompany, String newLocation, boolean newIsFullTime, int newSalary){

        location = newLocation;
        company = newCompany;
        isFullTime = newIsFullTime;
        salary = newSalary;
        // an instance method can call another instance method
        // an instance method can use any instance fields
        // since we already have functionality to display information
        // we called it here to display new information after modifying
        displayInformation();

    }

    // write a method to check the offer belong to 100K club and return the result as true or false

    /**
     * method to check the offer belong to 100K club
     * @return true if salary is more than 100k, false if not
     */
    public boolean is100KOffer(){

        // salary >= 100000 already generate a boolean result
        // so we can directly return that result
        return salary >= 100000;

    }

    /**
     * Create an instance method called toString
     * has no parameter
     * @return String representation of Offer Object
     * In below format
     * [Location = Atlanta , Company = Intel , Salary = 280000$ , isFullTime true]
     */

    public String toString(){
        String str = ("[ Location = " + location + " | " + "Company = " + company + " | "
                + "Salary = " + salary + "$ | " + "isFullTime " + isFullTime + " ]");
        return str;
    }

}
