package day33;

/**
 * Practice method with return type
 * @author Dilshat
 *
 * return keyword is used to return a value out of a method
 * it also used to get out of your method
 * the moment the return line get executed, the method will finish running
 */

public class MethodWithReturnPractice3 {

    public static void main(String[]args){

        System.out.println(calculateAgeFromBirthYear(1899));

    }

    /**
     * calculateAgeFromBirthYear
     * This method will
     * calculate the age according to the birth year
     * and return the age
     * @param birthYear the number that represent birth year
     * @return the calculated value from the age
     * if the birth year is not within 1900-2020 return 0
     */

    public static int calculateAgeFromBirthYear(int birthYear){
        // I want to take out negative scenario first and just return 0
        if (birthYear < 1900 || birthYear > 2020 ){
            return 0;
        }
        // If I reach this point, that means the birth year is valid

        return  2019 - birthYear ;

    }

}
