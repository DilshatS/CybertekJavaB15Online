package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

//        int[] nums = {13, 31, 8, 5, 21, 2};
        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println("nums = " + Arrays.toString(nums));

        // storing the size of an array into a variable
        int numsItemCount = nums.length;
        // i want to copy the content of nums array into the new array

        // creating an array with same size as original array
        int[] numsCopy = new int[numsItemCount];
        // copying the value of one array into the new array

        for (int x = 0; x < numsItemCount; x++) {

            numsCopy[x] = nums[x]; // this line is copying nums array items into numsCopy one by one

        }

        System.out.println("before sort numsCopy = " + Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);

        System.out.println("after sort numsCopy = " + Arrays.toString(numsCopy));

        // Check whether the array still have same content in same order after sorting
        // what method will check for content
        if (Arrays.equals(nums, numsCopy)){
            System.out.println("THIS ARRAY IS ALREADY SORTED");
        }else {
            System.out.println("THIS ARRAY IS NOT ALREADY SORTED");
        }

        // plain english logic to see a 7 number is sorted or not
        // you copy this 7 number in another container
        // sort the number

    }

}
