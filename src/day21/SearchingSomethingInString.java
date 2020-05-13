package day21;

public class SearchingSomethingInString {

    public static void main(String[] args) {

        // Find out index all the a in case insensitive manner
        // I will go through each and every letter of the String
        // --> each character I can use substring(0,1) and so on
        // --> going to 0 to last index --> for loop
        // while I am going through each and every character
        // I will check whether current character I am looking at
        // equals to a or A --> currentCharacter.equalsIgnoreCase("a");
        // if it is I will print index println(the variable you use to keep the index)
        // if not --> just move on
        // perform this action until I reach last character if I go over last character index I stop

        String myName = "Dilshat Sadamov";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println();

        //for (int x = 0; x < charCount; x++) {
        for(int x = 0; x <= lastCharIndex; x++){
            String currentChar = myName.substring(x,x+1);

            if (currentChar.equalsIgnoreCase("a")){

                System.out.println("The index of a or A is " + x);

            }
        }

    }

}
