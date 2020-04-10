package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {

        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount);
        // use above example to print out the rest of the variable value in similar format
        short sheepCount = 300;

        int catCount = 20;

        long mileToMoon = 5000000L;
        long mileToSun = 10000000000L;

        //------------- floating point --------------

        // you must add f at the end of number this is float data type
        // uppercase lowercase does not matter, but it's mandatory
        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49F;

        // ----------------- larger floating numbers -------------------

        double priceOfIpad1 = 355.99d;
        double priceOfIpadPro = 1024.99D;
        // compiler automatically assume it's an double so it's not required to have d
        // however for good programming habit, add them always
        double priceOfMac = 2299.99;
        // if you have a whole number by itself, compiler automatically assume it's an int
        // if you have a fractional number by itself, compiler automatically assume it's an double


    }

}
