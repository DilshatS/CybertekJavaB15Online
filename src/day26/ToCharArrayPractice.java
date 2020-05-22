package day26;

public class ToCharArrayPractice {

    public static void main(String[] args) {

        // 2 additional String methods related to Array
        // toCharArray(), another is split(bySomething)

        String survey = "B15 Online 1 Month Survey";

        // how did I determine to use char for each??
        // because each item in char array is char
        char[] surveyChar = survey.toCharArray();
        // using for each loop
        for ( char each : surveyChar ){

            System.out.println("each char is : " + each);

        }

        // using for loop
        for (int i = 0; i < surveyChar.length; i++) {
            System.out.println("each char is : " + surveyChar[i]);
        }


        // just for fun why don't we try while loop

        int x = 0;
        while( x < surveyChar.length){

            System.out.println("each char is : " + surveyChar[x]);
            x++;

        }

        // for fun do while
        int y = 0;
        do {
            System.out.println("each char is : " + surveyChar[y]);
            y++;
        }
        while (y < surveyChar.length);

    }

}
