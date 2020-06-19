package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {

    public static void main(String[] args) {

        List<String> nameLst = new ArrayList<>();

        nameLst.add("Dilshat");
        nameLst.add("Ruzi");
        nameLst.add("Sabahidin");
        nameLst.add("Guzelnurin");

        //printAList( (ArrayList) nameLst );
        printAList( nameLst );

        String resultLongest = getLongestElement(nameLst);
        System.out.println("resultLongest = " + resultLongest);

//        byte myByte = 17;
//        printByte(myByte);
//
//        int myInt = 100;
//        printByte( myInt );

    }

    /**
     * A simple method to print a byte value passed
     * @param nameLst
     */
    public static String getLongestElement (List<String> nameLst){

        String longestName = nameLst.get(0); // or nameLst.get(0);
        for (int x = 0; x < nameLst.size(); x++) {

            String eachName = nameLst.get(x);
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if (eachName.length() >= longestName.length()) {
                longestName = eachName;
            }

        }
        return longestName;
    }

    // Create a method that accept a List of String as argument
    // same thing as a method that has List of String parameter
    // and print out each and every item in the list vertically
    // return nothing

    /**
     * This method will print out the content of passed List object vertically
     * @param lst of String
     * @return nothing
     */
    public static void printAList(List<String> lst){

        for (String each : lst) {
            System.out.println("each = " + each);
        }

    }

}
