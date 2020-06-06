package day31;

public class Calculator extends Calculator_V2 {

    public static void main(String[] args) {

      // create a static method tha add
      // it accept 2 numbers and print the result od addition
        add(7,23);
        add(17,3);
        add(1,7);

        add3Numbers(1,5,99);
        add3Numbers(10,5,25);

        calculate('/', 25, 5);

    }

    // a static method that has 2 int parameters
    public static void add( int num1, int num2 ){

        System.out.println("addition result " + (num1 + num2));

    }

    public static void add3Numbers(int num1, int num2, int num3){

        System.out.println("add 3 numbers result " + (num1 + num2 + num3));

    }

}
