package office_hour;

import java.util.Arrays;

public class Practice_12_12 {

        /*
        Practice : Arrays
                   String
                   Loop
         */

        /*
        Array : one of the data structures in Java
                we need data structures to manage data efficiently, in
                organized manner

                we can store multiple data into a variable
                    int a = {10,20} -> wrong

                declaration:
                    Data-type[] variableName = { data, data, ...};
                        index:                     0     1   ...

                    retrieve data from array:
                        variableName[index]
                            Ex: int[] arr = {1,2,3}
                                       arr[2] == 3

                    Array is immutable, and Array size is fixed
                    without initializing bits size we cannot use it

                    initializing the size of the array
                    1. giving values :
                        int[] a = {1,2,3}
                        it initialize the size and at the same time
                        initializes the value
                    2. giving the size of the array only :
                        int[] a = new int[LengthNumber]

                    Arrays: presented in java.util package
                        Arrays.toString(VariableName): converts any data type of
                            array to String, returns String

                        Arrays.sort(VariableName): sorts the elements within the
                            array in ascending order, does not return anything

                    String class split method:
                        str.split("String"): split the string by given value
                        and returns it as String array
                                String[] arr = "ABCD".split(""); {A,B,C,D}

                    str.toCharArray(): Assign the String to char array,
                        returns char array

                default values:
                byte, short, int long = 0
                String = null
                double, float = 0.0
                boolean = false
                char = empty space
         */


    public static void main(String[] args) {

        int[] arr ={1,2,3}; // size -> 3
        arr = new int[4];

        System.out.println(Arrays.toString(arr));
        // 1,2,3,0
        // 0,0,0,0

        int[] arr2;
        //System.out.println(arr2[0]); // array size is fixed, without initializing bits size we cannot use it

        String[] names = new String[5];
        int lastIndex = names.length-1;
        System.out.println(lastIndex);
        names[2] = "Dilshat";
        names[4] = "Parvin";
        System.out.println(Arrays.toString(names));

        int[] nums = new int[7]; // highest index 6
        //int[7] = 10; // array size is fixed

        System.out.println(Arrays.toString(nums));

        char[] characters = {'a', 'b', 'c', 'd'};

        String str = Arrays.toString(characters);
        System.out.println(str);

        int[] scores = {10,9,8,7,6,5,4,3};

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        String[] chars = "ABCD".split("");
        int lastIndex1 = chars.length;
        System.out.println(lastIndex1);

        for (int x = 0; x < lastIndex1; x++) {
            System.out.println(chars[x]);
        }

        System.out.println(Arrays.toString(chars)); // {A,B,C,D}

        char[] chars2 = "Vald".toCharArray();
        System.out.println(chars2);

        // 1. Write a program that can print out the unique values from an int Array
        int[] numbers = {1,1,2,2,3,3,7,9,4,4,5,5}; // expected result : 3


        for (int x = 0; x < numbers.length; x++){


            int count = 0; // find out yhe number of appearance

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numbers[x]) {
                    count++; // adds one to the occurrence number of 1
                }
            }

            if (count == 1) { // if the value is unique, then we print out
                System.out.println(numbers[x]);
            }

        }

        System.out.println("-------------------------");

        // write a program that can print out the unique values from String Array

        String[] letters = {"a", "a", "B", "b", "c", "c", "d", "1"}; // expected result "b"

        for (int x = 0; x < letters.length; x++) {

            int count2 = 0; // to store the number of appearance

            for (int i = 0; i < letters.length; i++) {

                if (letters[i].equals(letters[x])) {
                    count2++;
                }

            }

            if (count2 == 1) {
                System.out.println(letters[x]);
            }

        }

        System.out.println("--------------------------");

        // write a program that can find the second max number from int array. DO NOT USE sort method

        int[] num = {1,2,3,4,5,6,7,8}; // expected result : 7

        int Max = num[0];

        for (int eachNum : num) {

            if (eachNum > Max){
                Max = eachNum;
            }

        }

        System.out.println("Max : " + Max);

        int SecondMax = num[0];

        for (int eachNum : num) {

            if (eachNum > SecondMax && eachNum < Max){

                SecondMax = eachNum;
                //eachGrades = secondMax;

            }

        }

        System.out.println("secondMax = " + SecondMax);


        System.out.println("--------------------------");


        int[] grades = {1,2,3,4,5,6,7,8};

        int max = grades[0];

        for (int eachGrade : grades) {

            if (eachGrade > max) {
                max = eachGrade;
            }

        }

        System.out.println("max = " + max);

        int secondMax = grades[0];

        for (int eachGrades : grades) {

            if (eachGrades == max){
                continue;
            }

            if (eachGrades > secondMax){

                secondMax = eachGrades;

            }

        }

        System.out.println("secondMax = " + secondMax);

        // Swap two variable values without using a temporary variable

        int a = 10, b = 20; // expected result : a = 20, b = 10

        /*
        int c = a;  // c = 10;
        a = b;      // a = 20;
        b = c;      // b = 10;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
         */

        a = a + b; // a = 10+20 = 30
        b = a - b; // b = 30-20 = 10
        a = a - b; // a = 30-10 = 20
        // interview question

        System.out.println("a = " + a + " " + "b = " + b);

        // assignment : write program that can divide two numbers without / operator  and remainder % operator

    }

}
