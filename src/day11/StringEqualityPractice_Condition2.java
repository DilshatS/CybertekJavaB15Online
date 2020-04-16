package day11;

public class StringEqualityPractice_Condition2 {

    public static void main(String[] args) {

        /**
         update this program to add more condition
         using else if in the middle

         * check the value of myStr
         * if it is Java --> Correct Word!
         * if it is Cava --> Pumpkin!
         * else say NOT JAVA, NOT PUMPKIN
         */

        String myStr = "Cava";

        if (myStr.equals("Java")){
            System.out.println("CORRECT WORD!");
        }else if (myStr.equals("Cava")){
            System.out.println("PUMPKIN!");
        }else {
            System.out.println("NOT JAVA, NOT PUMPKIN!!!");
        }

    }

}
