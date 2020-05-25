package day27;

import java.util.Arrays;

public class ArraysPractice_3DArray {

    public static void main(String[] args) {

        // [index numb of 2D array] [index num of 1D array] [index num of values/elements]
        //                        0       1            0          1
        int[][][] arr3D = {   {{1,2,3},{4,5,6}},   {{7,8,9}, {10,11,12}}   };
        //                            0                    1

        for (int i = 0; i < arr3D.length; i++){ // each index of 2D array
            for (int j = 0; j < arr3D[i].length; j++){ // each number of 1D array
                for (int k = 0; k < arr3D[i][j].length; k++){ // each index number of the values
                    System.out.print(arr3D[i][j][k] + " "); // returns value
                }

            }

        }

        // Single dimensional array: contains multiple value
            // int[] a = {1,2,3};
            // index:     0 1 2

            // retrieve:
                // variableName[indexNum]
                // ex: arr[2] -> 3

            // Arrays size is fixed

            // CREATING ARRAY
                    // int[] arr = {1,2,3};
                    // int[] arr2 = new int[]{1,2,3}
                    // int[] arr3 = new int[5];

        // Multi Dimensional Array: an array that can contain arrays
            // N dimensional array contains (N-1) dimensional arrays
                // ex: 2 dimensional arrays: contains 1 dimensional arrays

        // length of 2D array is determined by the numbers of 1D array
                // int[][] arr2D = { {1,2,3}, {4,5,6} };
                // [index num of 1D array] [index num of elements/values]

                // arr2D[0][1] -> value: 2
                // arr2D[1] -> 1D array: {4,5,6}

            // CREATING 2D ARRAY
                // int[][] arr2D = { {1,2,3}, {4,5,6} }
                // int[][] arr2D = new int[][] { {1,2,3}, {4,5,6} }
                // int[][] arr2D = new int[lengthNUmber][]

            // 3D array: contains 2D array
                // length of the 3D array is determined by the numbers of 2D array
                // int [][][] arr3D = {  {{1,2,3}, {4,5,6}}  ,  {{7,23}, {4}}   }
                // [index num of 2D array] [index num of 1D array] [index num of elements/value]
                // retrieve
                    // arr3D [1][2][0] -> element: 9
                    // arr3D [1] -> 2D array: {{7,23}, {4}}
                    // arr3D [1][0] -> 1D array: {7,23}

        // Arrays util class:
            // Arrays.toString(): converts single dimensional array to String
                // returns it as String

            // Arrays.deepToString(): converts multi-dimensional array to String
                // returns it as String

            // Arrays.sort(): sorts the single dimensional array, in ascending order

    }

}
