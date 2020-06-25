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
        }

    }

}
