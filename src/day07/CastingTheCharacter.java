package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'C';
        System.out.println(grade);

        // 'B' is represented by 67 in ascii table
        // here type char is automatically widened to int
        // and stored as number
        int letterInNumber = 'C';
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        //----------------------------------------------

        char myFirstChar = (char) 100;
        System.out.println(myFirstChar);

    }

}
