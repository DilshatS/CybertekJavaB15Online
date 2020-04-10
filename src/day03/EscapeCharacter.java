package day03;

public class EscapeCharacter {

    public static void main(String[] args) {

        System.out.println("Hello \\ world"); // \\ - back slash

        System.out.println("I like the book \"Java\" awesome"); // " word "

        System.out.println("The move name is : 'Lord of the rings'"); // ' word '

        System.out.println("Hello\tWorld"); // \t - tab

        System.out.println("Hello\nWorld"); // \n - new line

        // what is the equivalent of println and print, using one of the above

        System.out.print("This is regular print \n");
        System.out.println("This is println");

        /*
        byte integer 1 byte -128 to 127
        short integer 2 bytes - 32,768 to 32,767
        int integer 4 bytes - 2,147,483,648 to 2,147,483,647
        long integer 8 bytes - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        byte numberOfTheLetter = 26;
        short feetInMile = 2500;
        int mileToSun = 1300000;
        long nationalDebt = 180000000000L;

        float priceOfTheBook = 49.99f;
        double meterToMile = 2.345543124d;

        char single character(unicode) 2 bytes All Unicode values from 0 to 65,535
        boolean 1 bit True or False

        char firstLetterOfName = 'A';
        boolean loveJava = true;

        byte->short->int->long->float->double
               char->

         */

    }

}
