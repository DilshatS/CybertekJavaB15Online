package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        // YOU DO THIS
        // from 1 - 100 print out all numbers can be divided by 15 without remainder
        // DO THIS ONE TOGETHER
        // from 1 - 100 count how many numbers can be divided by 15

        int counter = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0){
                System.out.println(i);
                //counter = counter + 1;
                //counter += 1;
                ++counter;
            }

        }

        System.out.println("counter = " + counter);
        System.out.println("====================");

        // given a String with value
        // find out how many a showed up in this String

        int countOfA = 0;

        String name = "Kahren Mkrtchya Said Argaphlu Hasan Ankar Rana Aral";

        System.out.println(name.charAt(0) == 'a');

        for (int x = 0; x < name.length(); x++) {
            //System.out.println( name.charAt(x) );
            char currentChar = name.charAt(x);

            if (currentChar == 'a'){
                System.out.println("BINGO FOUND IT!!!");
                ++countOfA;
            }

        }

        System.out.println("countOfA = " + countOfA);

    }

}
