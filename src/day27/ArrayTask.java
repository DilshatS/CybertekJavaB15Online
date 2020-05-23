package day27;

import java.util.Arrays;

public class ArrayTask {

    public static void main(String[] args) {

        // Task02:
        // write a program that can find the minimum number from an int array

        //Task03: write a program that can find the second minimum number for an array
        // DO NOT USE sort method

        //Task04: write a program that can find the third minimum number for an array
        // DO NOT USE sort method

        int[] scores = {100, -99, -1000, 2000, 5000, 0, 1, 2000};

        int min = scores[0]; // min: 100

        for (int i = 0; i < scores.length; i++) {

            if (min > scores[i]) {
                min = scores[i];

            }

        }
        System.out.println("min number : " + min);

        int secondMin = scores[0];
        for (int i = 0; i < scores.length; i++) {

            if (scores[i] == min) {
                continue;
            }

            if (secondMin > scores[i]) {
                secondMin = scores[i];
            }

        }
        System.out.println("secondMin : " + secondMin);

        int thirdMin = scores[0];
        for (int i = 0; i < scores.length; i++) {

            if (scores[i] == min || scores[i] == secondMin) {
                continue;
            }

            if (thirdMin > scores[i]){
                thirdMin = scores[i];
            }

        }
        System.out.println("thirdMin : " + thirdMin);

        int fourthMin = scores[0];
        for (int i = 0; i < scores.length; i++) {

            if (scores[i] == min || scores[i] == secondMin || scores[i] == thirdMin) {
                continue;
            }

            if (fourthMin > scores[i]){
                fourthMin = scores[i];
            }

        }
        System.out.println("fourthMin : " + fourthMin);

//        Arrays.sort(scores);
//
//        int maxScores = scores[scores.length-1];
//        int minScores = scores[0];
//
//        System.out.println("maxScores = " + maxScores);
//        System.out.println("minScores = " + minScores);

    }

}
