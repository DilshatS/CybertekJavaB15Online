package office_hour;

public class Practice_12_17 {

    public static void main(String[] args) {

        // String method, nested loop

        // data types: primitive       non-primitive
        // primitive: byte, short, int, long, float, double, char, boolean
        // non-primitive: Scanner, String, Array

        int number = 6;

        String word = "java";
        System.out.println(word); // java

        // replace j to --> c
        System.out.println("After replace : " + word.replace("j","c"));

        System.out.println("word"); // word

        System.out.println(number); // 6

        System.out.println(number + 6); // 6 + 6 = 12

        // in order to see how many chars we have in a variable
        System.out.println("there ara total "+word.length() + " chars in word"); // 8

        System.out.println("I have 6" + 7);
        //                  I have 6    7 = 67
        System.out.println("I have 9" + 1 + 2);
        //                  I have 9     1    2 = 912
        System.out.println("I have 8 " + (1+4));
        //                  I have 8       5 = 85
        System.out.println((3+2) + (3+5));
        //                   5       8 = 13

        //             0123456789012345678
        String book = "learn java in 1 day, java is fun";
        System.out.println(book.length()); // 6

        System.out.println("last index of J "+book.lastIndexOf("j"));

        System.out.println("first index j "+book.indexOf("j"));

        // I want only one char -> l
        System.out.println(book.charAt(0));

        System.out.println("I am looking for a space " + book.charAt(5));

        // we can use substring method to get 1 or more characters
        String student = "Rabia";
        System.out.println(student.length());
        //                5 -> int

        int i = 9;
        int lengthOfStudent = student.length();
        //                           5
        System.out.println("lengthOfStudent = " + lengthOfStudent);

        System.out.println(student.substring(2) + student.toLowerCase().substring(0,2)); // last 3 char bia

        System.out.println(student.substring(0,1)); // first R
        System.out.println(student.substring(4)); // last a

        System.out.println(student.toUpperCase()); // RABIA
        System.out.println(student.toLowerCase()); // rabia

        String lowerStudent = student.toLowerCase();
        System.out.println(lowerStudent);

        String batch = "Online";

        // uppercase + length

        System.out.println("uppercase + length : " + batch.toUpperCase().length());
        //                                              ONLINE
        System.out.println("Asiya".toUpperCase().length());

        // trim
        String a = "  Asiya   ";
        System.out.println(a);
        System.out.println(a.trim() + " + count : " + a.length()); // Asiya

    }

}
