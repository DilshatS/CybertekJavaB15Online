package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {

        // checking for String equality should be always
        // done using equals method of the string

        // oneString.equals(anotherString) --> true or false
        // equals method coming from String class
        // each and every String object you created will have this functionality

        // just comparing 2 String literal directly using equals method
        // This is something that you will do rarely
        //System.out.println("Java".equals("java"));

        String myStr = "Java";
        System.out.println(myStr.equals("Java"));
        // Intellij display original as helper, its not part of your code
        // please ignore and keep typing. do not type original just type your text
        String yourStr = new String("Java");
        System.out.println("is my string name as your string? : ");
        // how to compare myStr to yourStr for equality
        System.out.println(myStr.equals(yourStr));

        // Create a program to check whether myStr value is Java
        // if true --> CORRECT WORD!!!
        // if false --> SAY JAVA!!!

        if (myStr.equals("Java")){
            System.out.println("CORRECT WORD!!!");
        }else {
            System.out.println("SAY JAVA!!!");
        }

        // Create a program to check whether myStr value is equal to yourStr value
        // if true --> CORRECT WORD!!!
        // if false --> SAY JAVA!!!

        if (myStr.equals(yourStr)){
            System.out.println("CORRECT WORD!!!");
        }else{
            System.out.println("SAY JAVA!!!");
        }

    }

}
