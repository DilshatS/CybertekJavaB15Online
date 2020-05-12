package day20;

import org.w3c.dom.ls.LSOutput;

public class FIndDogInASentence {

    public static void main(String[] args) {

        // given sentence, find out the location of the dog
        // our approach is
        // doing through the sentence 3 character at a time
        // then if 3 characters happen to be a dog, we print out the index

        /*
        0123456789012345678901234567890123456789012345
        I like Dog , Dogs are cute , Dogs are friendly
        I l
         li
        lik
        ike
        ke
        ...
         */

        String msg = "I like Dog , Dogs are cute , Dogs are friendly";
        int lastCharIndex = msg.length()-1;
        for (int x = 0; x <= lastCharIndex-2; x++){

            String current3Chars = msg.substring(x, x+3);
            //System.out.println(x + " : " + msg.substring(x, x+3));

            if (current3Chars.equals("Dog")){
                System.out.println("Bingo!!! AT " + x);
            }

        }

    }

}
