package day26;

public class ArrayReview {

    public static void main(String[] args) {

        /*
        Array :
        is an object that can hold multiple items/elements of same type
        array has fixed size
        once created with certain size, it can not be changed
        we can change the value inside the array

        Default value for array item if it is empty

        byte, short, int, long --> 0
        float, double          --> 0
        char                   --> '' empty character
        boolean                --> false

        what about non primitive type : reference type
        String --> null

        3 ways to create an array object and assign it to variable
        */
        int[] myNumbers = new int[4]; // 4 is item count
        //we assign value using array variable and it's index
        myNumbers[0] = 10;
        myNumbers[1] = 40;
        myNumbers[2] = 30;
        myNumbers[3] = 7;

        //how do we get the size of an array
        int size = myNumbers.length; // 4
        int lastIndex = size - 1; // myNumbers.length-1
        //how do we get last item of any array
        //I want to save last item into a variable
        //int lastItemValue = myNumbers[3];
        //int lastItemValue = myNumbers[lastIndex];
        int lastItemValue = myNumbers[myNumbers.length-1];
        //print third item
        System.out.println("third item value " + myNumbers[2]); // 30

        //1.1 I want to add 1 to the second item value
        myNumbers[1] = myNumbers[1] + 1;
        System.out.println("new value of second item " + myNumbers[1]);
        //1.2 I want to double the second item value
        myNumbers[1] = myNumbers[1] * 2;
        System.out.println("new value of second item after doubling  " + myNumbers[1]);

        //1.3 I want to assign 3rd item value to
        //sum of first and second item
        myNumbers[2] = myNumbers[0] + myNumbers[1];
        System.out.println("new value of third item " + myNumbers[1]);

        //just change my int array data type to int to avoid issues

        //1.4 Swap the first item value with last item value


    }

}
