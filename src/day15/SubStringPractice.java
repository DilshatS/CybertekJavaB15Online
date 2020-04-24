package day15;

public class SubStringPractice {

    public static void main(String[] args) {

        // getting the part of the String out of another String
        //              0123456789012345
        String movie = "Lord Of The Ring";
        // I want to get the word <of> from this movie
        // Sub String will return part of another string
        // starting from beginning index until RIGHT BEFORE ENDING INDEX

        String wordOf = movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        String fullWord = movie.substring(0,16);
        System.out.println("fullWord = " + fullWord);

        String wordLordOf = movie.substring(0,7);
        System.out.println("wordLordOf = " + wordLordOf);

        // Get from the second word till last word!
        //                 0123456789012345
        // String movie = "Lord Of The Ring";
        //int startingPoint = movie.indexOf(" " ) + 1;
        //int endingPoint = movie.length();
        // assume we already know the location of starting point of second word
        // end ending of the sentence

        String secondWordTillLast = movie.substring(5,16);
        System.out.println("secondWordTillLast = " + secondWordTillLast);

        // If you want to start from somewhere and just get the rest of the String
        // above method will work, however there is even better method
        // if you provide only one parameter substring method
        // it will just start from that location and get till the end
        String secondToLast = movie.substring(5);

        // with this in mind :
        // YOU KNOW INDEX ALREADY
        // String movie = "Lord Of The Ring";
        // reverse lord of the ring --> ring of the lord

        // TASK MY WAY
        System.out.println("TASK : " + movie.substring(12) + movie.substring(4,12) + movie.substring(0,4));
        // OR
        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4,12);
        String wordLord = movie.substring(0,4);
        System.out.println(wordRing + wordOfThe + wordLord);

        // Turn --> Lord Of The Ring --> Ring Of The Java Lord
        System.out.println(wordRing + wordOfThe + "Java " + wordLord);

        //System.out.println("Second word till last : " + movie.substring(startingPoint, endingPoint));

        //System.out.println(movie.charAt(movie.length()-1));

    }

}
