package office_hour;

import org.w3c.dom.ls.LSOutput;

public class Practice_12_11 {

    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        // index :            0         1        2          3             4          5
        //fruits[2].endsWith("e");
        // length : return the total number of elements
        // 1.7 print out only those items end with letter e

        for (int i = 0; i < fruits.length; i++) { // i:0, 1, 2, 3, 4, 5
            String str = fruits[i];
            //System.out.println(str);
//            if (str.endsWith("e")) {
//                System.out.println(str);
//            }

            if (!str.endsWith("e")) {
                continue;
            }
            System.out.println(str);
        }

        System.out.println("-----------------------");

        // for(Variable : Collection of data){
        //     statement
        // }
        // variable MUST be representing each elements of the collection data

        // {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        for (String eachFruit : fruits) {
            char lastChar = eachFruit.charAt(eachFruit.length() - 1); // represent the last character of each string
            //System.out.println(lastChar);

            if (lastChar == 'e') {
                System.out.println(eachFruit);
            }

        }

        System.out.println("----------------------------");

        // print out only last 3 characters of al the items
        // {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        // length-3 --> 3

        for (int i = 0; i < fruits.length; i++) {
            String last3 = fruits[i].substring(fruits[i].length() - 3, fruits[i].length());
            System.out.println(last3);
        }

        System.out.println("----------------------------");

        for (String eachFruit : fruits) {
            //String last3 = eachFruit.substring(eachFruit.length()-3);
            String last3 = "" + eachFruit.charAt(eachFruit.length() - 3) + eachFruit.charAt(eachFruit.length() - 2) + eachFruit.charAt(eachFruit.length() - 1);
            System.out.println("last3 = " + last3);
        }

        System.out.println("----------------------------");

        for (int i = 0; i < fruits.length; i++) {
            String last3 = "" + fruits[i].charAt(fruits[i].length() - 3) + fruits[i].charAt(fruits[i].length() - 2) + fruits[i].charAt(fruits[i].length() - 1);
            System.out.println(last3);
        }

        System.out.println("----------------------------");

        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        //                  0      1      2      3      4      5
        float max = prices[0]; // 1.99

        for (float eachPrice : prices) {

            if (eachPrice > max) {
                max = eachPrice;
            }

            //System.out.println(max);

        }

        System.out.println(max);

        System.out.println("----------------------------");

        float Max = prices[0];

        for (float eachPrice : prices) {

            if (eachPrice < Max) {

                continue;

            }

            Max = eachPrice;

        }

        System.out.println(Max);

        System.out.println("----------------------------");

        // finding second maximum number from the array
        float secondMax = prices[0]; // store second max number

        for (float eachPrice : prices) {

            if (eachPrice > secondMax && eachPrice < max) {

                secondMax = eachPrice;

            }
        }
        // find the index number of second maximum number

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] == secondMax) {
                System.out.println("index number of : " + secondMax + " is " + i);


            }

        }

        System.out.println(secondMax);

        System.out.println("----------------------------");

        float thirdMax = prices[0];

        for (float eachPrice : prices) {

            if (eachPrice > thirdMax && eachPrice < secondMax) {

                thirdMax = eachPrice;

            }

        }

        System.out.println("thirdMax = " + thirdMax);

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] == thirdMax) {

                System.out.println("index number of : " + thirdMax + " is " + i);

            }

        }

        System.out.println("----------------------------");
        // find the index num of max price

        System.out.println("max = " + max);

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] == max) {

                System.out.println("index number of : " + max + " is " + i);

            }

        }

    }

}
