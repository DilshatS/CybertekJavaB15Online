package day11;

public class StringEquality {

    public static void main(String[] args) {

        // Objects has attributes (Height,Color,Weight,Make,Model,Year and ect.)
        // Objects has behavior (Run, Eat, Sleep, Drive, Make Noise, and ect.)
        // Everything what object have or doing is in CLASS!!!
        // Class is a blueprint/template to create an object (in JDK), guid line to build something
        // String class A special class in Java to create and manipulate strings
        // String s = "Hello World"; or String s = new String("BLA BLA");

        String name = "Rabia";

        String name2 = new String("Rabia");

        String name3 = "Rabia";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("USING == METHODS");
        System.out.println( name == name2 );
        System.out.println( name == name3 );

        // The correct wat of comparing String to get consistent result is
        // using one of the String object behavior / method called
        // equals method
        // str1.equals(str2)
        System.out.println("USING EQUAL METHODS!!!");
        System.out.println(name.equals(name2)); // name is a STRING -> STRING AS AN OBJECT
        System.out.println(name.equals(name3));

        // BOTTOM LINE IS : DO NOT EVER USE == TO CHECK STRING EQUALITY

    }

}
