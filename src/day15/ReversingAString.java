package day15;

public class ReversingAString {

    public static void main(String[] args) {

        String name = "Akbar";
        String name1 = "Dilshat";

        System.out.println(name.charAt(0) + " " + name.charAt(1) + " " + name.charAt(2) + " " +
                name.charAt(3) + " " + name.charAt(4) );

        System.out.println(name.toUpperCase().charAt(4) + " " + name.charAt(3) + " " + name.charAt(2) + " " +
                name.charAt(1) + " " + name.charAt(0) );

        // How do you find out last character of any String
        // counting character start with one
        // counting index (location) start with 0
        // so last character index/location will be always one less than actual character count
        // Akbar has 5 character
        // 01234 and last character index is 4 not 5; 5 - 1 = 4

        int characterCount =name.length();
        System.out.println(characterCount);
        // counting character start with one
        // counting index (location) start with 0
        // so last character index/location will be always one less than actual character count
        int lastCharIndex = characterCount - 1;
        System.out.println(lastCharIndex);
        char lastChar = name.charAt(lastCharIndex);
        System.out.println("LAST CHARACTER IS : " + lastChar);

        System.out.println("last char in one shot" + name.charAt(name.length()-1));
        System.out.println(name1.charAt(name1.length()-1)); // Task 64

    }

}
