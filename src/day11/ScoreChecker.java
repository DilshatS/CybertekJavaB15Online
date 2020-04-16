package day11;

public class ScoreChecker {

    public static void main(String[] args) {

        /*
        Create a program to check the score : ScoreChecker with main method

        Create a variable called score assign a value of your choise

        if the score is less than 0 or more than 100 --> INVALID SCORE
        if the score is 100 --> Perfect Score!!!
        if the score is between 70-100 --> you have passed!
        Else You Have Failed!!!

        OPTIONAL: add more condition for failing scores
        if the score is less than 20 --> COME TO MY OFFICE!!!
        if the score is between 30-40 --> Attend additional classes
        if the score is between 40-70 --> Little bit more study will let you pass
         */

        // if score 67 --> you have passed!
        // Score > 70 || score < 100 --> TRUE
        // DON'T MAKE THIS MISTAKE!!!

        int score = 17;

        if (score < 0 && score > 100){
            System.out.println("Invalid Score!!!");
        }if (score == 100){
            System.out.println("Perfect Score");
        }else if ( score > 70 && score < 100){
            System.out.println("You have Passed!");
        }else if(score > 40 && score < 70) {
            System.out.println("Little bit more study will let you pass");
        }else if (score > 30 && score < 40){
            System.out.println("Attend additional classes");
        }else if(score > 20 && score < 30) {
            System.out.println("YOU HAVE FAILED!!!");
        }else if (score >= 0 && score < 20){
            System.out.println("COME TO MY OFFICE!!!");
        }else {
            System.out.println("Invalid Score!!!");
        }

    }

}
