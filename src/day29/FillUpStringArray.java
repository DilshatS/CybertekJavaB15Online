package day29;

import java.util.Arrays;

public class FillUpStringArray {

    public static void main(String[] args) {

        // Create an array with size 300 and fill it up with I love Java
        String[] strArr = new String[300];
        System.out.println("before filling asrArr = " + Arrays.toString(strArr));
//        strArr[0] = "I love Java";
//        strArr[1] = "I love Java";
//        strArr[2] = "I love Java";

//        strArr[0] = "1:I love Java";
//        strArr[1] = "2:I love Java";
//        strArr[2] = "3:I love Java";
        //                    300
        for (int i = 0; i < strArr.length; i++) {

            //strArr[i] = "I love Java";
            strArr[i] = (i+1) + ": I Love Java";

        }
        System.out.println(Arrays.toString(strArr));


        String str = new String("ABC"); // THIS IS STRING OBJECT WITH VALUE ABC
        String[] strArr2 = new String[5]; // STRING ARRAY WITH CAPACITY 5
        strArr2[0] = "I LOVE JAVA";
        strArr2[1] = "I LOVE JAVA";
        strArr2[2] = "I LOVE JAVA";
        strArr2[3] = "I LOVE JAVA";
        strArr2[4] = "I LOVE JAVA";

        System.out.println("strArr2 = " + Arrays.toString(strArr2));

    }

}
