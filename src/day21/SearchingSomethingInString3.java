package day21;

public class SearchingSomethingInString3 {

    public static void main(String[] args) {

        String myName = "Amelia Israfil Hajitev Mehmet Hajitev Amelia Behlia Ashr";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println();

        //for (int x = 0; x < charCount-3; x++) {
        for(int x = 0; x <= lastCharIndex-2; x++){

            // saving the current 3 characters
            String current2Char = myName.substring(x,x+3);

            if (current2Char.equalsIgnoreCase("lia")){

                System.out.println("The index of lia is " + x);

            }

        }

    }

}
