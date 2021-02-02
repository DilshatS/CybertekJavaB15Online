package day43;

public class StarbucksUtil {

    public static void main(String[] args) {

        Coffee c = new Coffee("Blonde",5, 1.6);
        printCoffeeInfo(c);

        String myString = new String("Hello");
        printStringInfo(myString);
        printStringInfo("abc");

        Coffee c1 = new Coffee();
        printCoffeeInfo(c1);

        // you can either store Coffee object into a variable like above
        // of your can directly pass a coffee object without storing it
        printCoffeeInfo( new Coffee("Intensito", 10));

        // we would need and object of current class if we wanted call
        // instance method of current class
//        StarbucksUtil util = new StarbucksUtil();
//        util.printStringInfo(myString);

    }

    // Create a static method to accept a coffee object and print IT'S information
    // like this: This coffee is : name, price is <price>, caffeine level is <level>

    /**
     * Create a static method to accept a coffee object and print IT'S information
     * like this: This coffee is : name, price is <price>, caffeine level is <level>
     * @param co the coffee object caller pass
     */

    public static void printCoffeeInfo(Coffee co){

        System.out.println("This coffee is : " + co.getType());
        System.out.println("Price is : " + co.getPrice());
        System.out.println("CaffeineLevel is : " + co.getCaffeineLevel());

    }

    /**
     * a static method to print out first and last character of a String
     * @param str
     */

    public static void printStringInfo(String str){

        System.out.println("first character is : " + str.charAt(0));
        System.out.println("last character is : " + str.charAt(str.length()-1));

    }

}
