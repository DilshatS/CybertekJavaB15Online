package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

        // each character has it's corresponding ascii value
        // from ascii table
        //int x = 'A';
        char myChar = 'A'; // e

        //System.out.println(x);

        System.out.println(++myChar);
        // 'A' + 1 --> 65 + 1 = 66 --> 'B' (myChar data type is char)
        System.out.println(myChar);
        // 'B' + 1 --> 66 + 1 = 67 --> 'C' (myChar data type is char)
        System.out.println(++myChar);
        // 'C' + 1 --> 67 + 1 = 68 --> 'D' (myChar data type is char)
        System.out.println(++myChar);
        // 'D' + 1 --> 68 + 1 = 69 --> 'E' (myChar data type is char)
        System.out.println(++myChar);

        System.out.println('A' > 'B'); // 65>66
        System.out.println('Z' > 'B'); // 65>66

        for (char iChar = 'A'; iChar <= 'Z'; ++iChar){
            System.out.print(iChar + " ");
        }

        System.out.println();
        for ( char kChar = 'Z'; kChar >= 'A'; kChar--){
            System.out.print(kChar + " ");
        }

        // HOMEWORK
        // CREATE INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER EDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER Z A , or A K
        // Can we ask use character? NO!!!
        // Ask user for String and pick first character by charAt(0)

    }

}
