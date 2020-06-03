package day31;

// WHY DO WE NEED TO HAVE A METHOD
// REUSABLE CODE!!! AVOID CODE DUPLICATED

public class MethodIntro {

    // MAIN METHOD ENDS HERE!!!!

    // DO NOT CREATE A METHOD INSIDE MAIN METHOD
    public static void sayHello (){

        System.out.println("Hello World!");
        System.out.println("My name is Dilshat");
        System.out.println("I love Java");

    }

    public static void main(String[] args) {

        // two way to call static methods
        // ClassName.method(external data id needed)
        // if you are in same class (MethodIntro)
        // you can directly called them
        // methodName(external data if needed)

//        MethodIntro.sayHello(); // Optional if you are in same class
        System.out.println("Begin");
        sayHello();
        System.out.println("-------------");
        sayHello();
        System.out.println();
        System.out.println("THE END");
        // line 14 -> 15 (24,26,27,28) - > 16 -> 17(24,26,27,28) -> 16 -> DONE!!!

    }

}





























 /*
        println
        print

        Scanner methods :
            String name = scan.next(System.in);
            int age = scan.nextInt();

        String methods
            String str = "Hello";
            char firstChar = str.charAt(0);
            str.toLowercase()l
            and so on....

        Arrays class method:
            Arrays.toString(your array object here);
            Arrays.sort(your array object here);
            Arrays.deepToString(your multi D array object here);

            Observation:
            method that accept external data when being called
            method that does not accept external data when being called
            ------
            method that generate some type of result that can be saved
            method that does not generate any result, just plain action
            ------
            method that need an object when being called
            method that does not need an object when being called
         */