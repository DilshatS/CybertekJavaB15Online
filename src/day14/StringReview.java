package day14;

public class StringReview {

    public static void main(String[] args) {

        String str = "I like Pumpkin";

        //System.out.println("str");
        System.out.println("str : " + str);

        //System.out.println(str.equals("pumpkin"));

        // contains :
        // it check whether a string exists in another string
        // and return true or false result
        System.out.println("does it contain pumpkin");

        System.out.println( str.contains("I like"));
                             // true
        boolean gotPumpkin = str.contains("Pumpkin");

        System.out.println("gotPumpkin : " + gotPumpkin);

        // startsWith endWith
        // check whether a string start with another string
        // check whether a string end with another string
        // and return true or false result

        boolean startedWithI = str.startsWith("I");
        System.out.println("started With I : " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("end With Pumpkin : " + endWithPumpkin);

        // PASSWORD VALIDATOR

        // MINIMUM * CHAR MAX 16
        // IT MUST CONTAINS _ OR $
        // IT MUST NOT CONTAINS SPACE
        // IT MUST START WITH AB

        // if any of condition does not match say INVALID PASSWORD
        // else say GOOD PASSWORD!!!

        // MINIMUM * CHAR MAX 16
        String password = "Ab2feaf_$";

        boolean min8Max16 = password.length() >= 8 && password.length() <= 16;
        boolean mustContain_Or$ = password.contains("_") || password.contains("$");
        // password.contains("_") || password.contains("$");

        // IT MUST NOT CONTAINS SPACE
        boolean mustNotContainsSpace = ! password.contains(" ");
        // ! password.contains(" ");

        // IT MUST START Ab
        boolean mustStartWithAb = password.startsWith("Ab");
        // password.startWith("Ab");

        if (min8Max16 && mustContain_Or$ && mustNotContainsSpace && mustStartWithAb){
            System.out.println("VALID PASSWORD!!!");
        }else {
            System.out.println("INVALID PASSWORD!!!");
        }


    }

}
