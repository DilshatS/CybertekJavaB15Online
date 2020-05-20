package day25;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class String_Split_Method {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        // WHAT DOES IT DO?
        // split(bySomething) is a method of String that split string into multiple part
        // DO I NEED TO PROVIDE EXTRA DATA WHILE CALLING THE METHOD?
        // YES! we need to tell what do we use while splitting, in this example space
        // WHAT DO I GET OUT OF IT?
        // We get out String array

        String[] allWords = sentence.split(" ");

        System.out.println("allWords = " + Arrays.toString(allWords));
        System.out.println("How many word do I have in this sentence? : " + allWords.length);

        // How do I get the last word of the sentence using this array I GOT from String
        System.out.println("Last word in this sentence is : " + allWords[allWords.length-1]);

        // ARE WE LIMITED TO SPLIT BY SPACE OR WE CAN SPLIT BY ANYTHING -> ANYTHING

        String sentence2 = "Everything is Awesome!!!";
        // split by letter e

        String[] splitBy_e_Arr = sentence2.split("e");
        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr)); // "e" is gone!!!

        for (String eachPiece : splitBy_e_Arr) {

            System.out.println("eachPiece = <" + eachPiece+">");

        }

        // split this sentence by is and print your result

        String[] splitByIs = sentence2.split("is");
        System.out.println("splitByIs = " + Arrays.toString(splitByIs));
        System.out.println("splitByIs = " + splitByIs);
        // using for each loop to iterate over the resulting array
        for (String eachPiece : splitByIs) {
            System.out.println("eachPiece = <" + eachPiece+">");

        }

    }

}
