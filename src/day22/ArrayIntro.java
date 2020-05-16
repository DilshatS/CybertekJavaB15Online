package day22;

public class ArrayIntro {

    public static void main(String[] args) {

        // syntax for creating variable to store single item
        // and assigning value
        // dataType variableName = value here
        int num1 = 10;
        //System.out.println(num1);

        // syntax for creating variable to store multiple items
        // and assigning a values
        // dataType [] variable name = new dataType [count of item];

        // this array can hold 4 items, it's also know as array size

        // creating an array object with empty space
        int[] scores = new int[4];
        // assigning value to each index
        // [0] -> first item
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;
        // accessing the elements inside array one by one
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        // updating the value at certain index
        scores[1] = 99;
        System.out.println(scores[1]);

        // Once array is created with certain size, we CAN NOT CHANGE THE SIZE!!!

        // When you create new Array Object
        // it will get default value in each element

        int[] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // Create a byte a byte array with size 4
        // and store it into a variable called data

        // assign a value for each index location
        // printout the values at each index

        // update last index value
        // then print it out
        System.out.println("------TASK-------");

        byte[] data = new byte[4];
        data[0] = 7;
        data[1] = 3;
        data[2] = 4;
        data[3] = 10;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data[3] = 9;
        System.out.println(data[3]);


    }

}
