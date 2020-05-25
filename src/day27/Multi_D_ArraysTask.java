package day27;

public class Multi_D_ArraysTask {

    public static void main(String[] args) {

        int[][] numbers = { {12, 11, 10,19}, {19, 20, 15}, {100, 90, 89, 7888} };
        //                         0              1               2
        int max = numbers[0][0]; // assume that first element is the max

        for (int i = 0; i < numbers.length; i++){ // checks each single dimensional array

            for (int j = 0; j < numbers[i].length; j++){ // check each elements int he single dimensional arrays

                if (max < numbers[i][j]){ // compare index 0 of the array with each indexes
                    max = numbers[i][j]; // assigns the maximum number
                }

            }

        }

        System.out.println("max = " + max);

        // solution 2:
        int max2 = numbers[0][0];
        for(int[] each1DArray : numbers){ // variable each1DArray represents each single dimension array in numbers

            for (int eachInt : each1DArray){

                if (max2 < eachInt){
                    max2 = eachInt;
                }

            }

        }

        System.out.println("max2 = " + max2);

        // finding the minimum number:

        System.out.println("==============================");

        int min = numbers[0][0]; // assume that first element is the max

        for (int i = 0; i < numbers.length; i++){ // checks each single dimensional array

            for (int j = 0; j < numbers[i].length; j++){ // check each elements int he single dimensional arrays

                if (min > numbers[i][j]){ // compare index 0 of the array with each indexes
                    min = numbers[i][j]; // assigns the maximum number
                }

            }

        }

        System.out.println("min = " + min);

        int min2 = numbers[0][0];
        for(int[] each1DArray : numbers){ // variable each1DArray represents each single dimension array in numbers

            for (int eachInt : each1DArray){

                if (min2 > eachInt){
                    min2 = eachInt;
                }

            }

        }
        System.out.println("min2 = " + min2);

    }

}
