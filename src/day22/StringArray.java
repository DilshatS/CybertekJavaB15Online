package day22;

public class StringArray {

    public static void main(String[] args) {

        // create an String array with ize that you define
        // and store all your household member names

        String[] lovedOnes = new String[5];
        lovedOnes[0] = "Ned Stark";
        lovedOnes[1] = "Catlin Stark";
        lovedOnes[2] = "Sansa Stark";
        lovedOnes[3] = "Arya Stark";
        lovedOnes[4] = "Rob Stark";

        System.out.println(lovedOnes[0]);
        System.out.println(lovedOnes[1]);
        System.out.println(lovedOnes[2]);
        System.out.println(lovedOnes[3]);
        System.out.println(lovedOnes[4]);

        // immutable means you can not change the internal structure of the object
        // if you have String abc = "Hello";
        // if you do abc.toUppercase --> it will create new String object
        // and it does not change original hello at all!!!

        // not resizable --> specifically for array
        // we can not change the elements inside this array
        // and it means : IT IS NOT IMMUTABLE

    }

}
