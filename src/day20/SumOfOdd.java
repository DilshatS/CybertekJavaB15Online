package day20;

public class SumOfOdd {

    public static void main(String[] args) {

        // give me the sum of odd numbers from
        // 10 - 100, use for loop

        // hint: create a variable sum as int
        // loop through 10 - 100
        // in each iteration check it's a even number or not
        // if it's add that number to sum

        // eventually after the loop --> print out of sum

        int sum = 0;

        for (int x = 10; x <= 100; x++) {

            if (x % 2 == 1){ // if (x % 2 != 0){
                //System.out.println(x);
                sum = sum + x; // sum += x;
            }

        }

        System.out.println(sum);

    }

}
 