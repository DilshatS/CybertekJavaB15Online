package office_hour;

import java.util.Arrays;

public class Practice_12_19 {

    public static void main(String[] args) {

        int a = 'A';
        int[] arr = { 10, (byte)9, (short)8, 'a' }; // data MUST match with the data type of the array

        System.out.println(Arrays.toString(arr));

        long l1 = 100; // implicit : by default 100 is an integer, and we assign it to long data type
        int num1 = (int) l1; // explicit

        System.out.println(arr[arr.length-1]); // data at last index : 97

        int[] arr2 = {0, 0, 0};
        for (int each : arr2){
            System.out.println(each); // 0 0 0
        }

        System.out.println("================");
        for (int i = 0; i < 4; i++) {
            System.out.println(i); // 0
            if (i == 2){
                break; // exits the loop IMMEDIATELY
            }
            //System.out.println(i); // 0 1
        }

        System.out.println("====================");
        // task1: write a program that can check if a String is build out of the same letters as another String

        String str1 = "abc", str2 = "cba"; // expected result: true

        // split(), toCharArray();

        char[] ar1 = str1.toCharArray(); // [a, b, c]
        Arrays.sort(ar1); // [a, b, c]

        char[] ar2 = str2.toCharArray(); // [c,b,b]
        Arrays.sort(ar2); // [b,b,c]

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        System.out.println(Arrays.equals(ar1,ar2));

        str1 = Arrays.toString(ar1);
        str2 = Arrays.toString(ar2);

        System.out.println(str1.equals(str2)); // false

        System.out.println("====================");

        // task2: Write a program that will remove all the duplicates characters from a String. (DO it with arrays)

        String s1 = "aaabbaaccbbdd"; // expected result : abcd
        String s2 = ""; // we store no duplicated characters in it
        // s2 = "ab"

        for (int i = 0; i < s1.length(); i++ ){
            String eachChar ="" + s1.charAt(i); // a
            if (!s2.contains(eachChar))
            s2 += eachChar; // we only concat the character if that character is not exist in s2
            // s2: "a"
        }

        System.out.println("s2 = " + s2);

        // solution 2:
        String fiveMinutes = "abcabca"; // [a,b,c,a,b,c,a]
        String[] eachChar = fiveMinutes.split("");
        String result = ""; // to store all non duplicated String objects of the array
        for(String each : eachChar){

            if (!result.contains(each)){
                result = result + each;
            }

        }

        System.out.println("result = " + result);

    }

}
