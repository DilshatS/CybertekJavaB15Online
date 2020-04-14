package day08;

public class WarmUpTask {

    public static void main(String[] args) {

        /*
        Voting Eligibility program
        Create a variable called age as int
        check whether this age is more than or equal 18
        if yes print : you are ready to vote!!!
        if it's less 18 print wait until you are 18
         */

        int age = 27;

        //System.out.println( age >= 18);

        if (age >= 18){
            System.out.println("you are ready to vote!!!");
        }else {
            System.out.println("wait until you are 18!!!");
        }

    }

}
