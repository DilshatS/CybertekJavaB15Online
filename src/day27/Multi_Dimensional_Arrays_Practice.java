package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Practice {

    public static void main(String[] args) {

        // N dimensional Array MUST contains (N-1) dimensional arrays

        // 2 dimensional array MUST contains (2-1) dimensional array
        //                        0           1          0         1
        String[][] names = {{"Rukhshona", "Ghoya"}, {"Hasan", "Tetiana"}};
        //                              0                     1
        // print Hasan :
        System.out.println(names[1][0]);

        // print Tetiana
        names[1][1] = "Dilshat";
        System.out.println(names[1][1]);

        // print Hasan & Dilshat
        System.out.println(Arrays.toString(names[1]));

        // print: { {"Rukhshona", "Ghoya"}, {"Hasan", "Tetiana"} };
        System.out.println(Arrays.deepToString(names));

        System.out.println("===============================");

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}};
        //                     0         1         2         3

        for (int i = 0; i < numbers.length; i++) { // checks each index of two dimensional array

            //System.out.println(Arrays.toString(numbers[i]));

            for (int j = 0; j < numbers[i].length; j++) { // checks each elements of single array

                System.out.print(numbers[i][j] + " ");

            }

        }

        System.out.println("\n=========================");

        // print all the even numbers from the 2D arrays
        int[][] ages = {{10}, {12, 13, 14, 16, 17}, {19, 20, 21, 22, 23}};

        for (int x = 0; x < ages.length; x++) {

            for (int i = 0; i < ages[x].length; i++) {

//                if (ages[x][i] % 2 != 0) {
//                    continue;
//
//                }
                if (ages[x][i] % 2 == 0) {
                    System.out.print(ages[x][i] + " ");
                }

            }

        }

        System.out.println("\n=========================");

        int[] arr1D = {1, 2, 3};

        for (int each : arr1D) {

            System.out.print(each+" ");

        }

        System.out.println("\n=========================");
        int[][] arr2D = { {10, 20, 30}, {40, 50, 60, 70, 80, 90, 100} };
        //                      1                    2

        for (int[] each1DArray : arr2D) {
            // variable name each1DArray represents each index of the 2nd array

            for (int eachElement : each1DArray) {
                // variable name eachElement represents each element that's contain in the 2D array

                System.out.print(eachElement + " ");

            }

        }


    }

}
