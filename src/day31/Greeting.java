package day31;

import day06.UsingTheValueOfOtherVariables;

public class Greeting {

    public static void main(String[] args) {

        //sayHello();
         sayHelloTo("Batch 15"); // -> print hello Batch 15
         sayHelloTo("Kids"); // -> print hello Kids
        sayHelloTo("" + 123);

    }

    // I want to create a method that do below :
    // say hello to the person's name I passed when I call this method

    // (String blabla) this is called method parameter
    // it's used to tell caller of this method,
    // it's expecting this type of data when being called

    public static void sayHelloTo( String str ){
        // str = 123;
        System.out.println("Hello " + str);

    }

//    public static void sayHello(){
//
//        System.out.println("Hello B15");
//
//    }

}
