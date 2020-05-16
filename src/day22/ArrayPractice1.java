package day22;

public class ArrayPractice1 {

    public static void main(String[] args) {

        double[] prices = new double[5];
        System.out.println(prices[0]);

        // can NOT print out array variable directly
        // to see what's inside
        System.out.println(prices);

        prices[0] = 2.96;
        prices[1] = 12.96;
        prices[2] = 992.1;
        prices[3] = 500;
        prices[4] = 65.213;
        // what happen if I go over the range
        // RUN TIME ERROR!!!
        //prices[5] = 165.3;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        // Create a char array that hold all the letters from your first name
        // and assign values using each character of your name

        char[] name = new char[7];
        // What default value do we get for char array
        // we get a char represented by ascii code 0

        System.out.println("<" + name[0] + ">");

        name[0] = 'D';
        name[1] = 'i';
        name[2] = 'l';
        name[3] = 's';
        name[4] = 'h';
        name[5] = 'a';
        name[6] = 't';

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        System.out.println(name[5]);
        System.out.println(name[6]);

        // THIS WILL ACTUALLY PRINT THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
        // AND THIS IS ONLY FOR CHAR ARRAY, ANYTHING ELSE WILL PRINT MEMORY ADDRESS
        //System.out.println(name);

        boolean[] yesNo = new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = 10>7; // true

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

    }

}
