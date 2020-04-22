package day14;

public class PasswordValidator {

    public static void main(String[] args) {

        // PASSWORD VALIDATOR

        // MINIMUM * CHAR MAX 16
        // IT MUST CONTAINS _ OR $
        // IT MUST NOT CONTAINS SPACE
        // IT MUST START WITH AB

        // if any of condition does not match say INVALID PASSWORD
        // else say GOOD PASSWORD!!!

        String password = "Ab2abc_$";

        // MINIMUM * CHAR MAX 16
        boolean min8Max16 = password.length() >= 8 && password.length() <= 16;

        // IT MUST CONTAINS _ OR $
        boolean mustContain_Or$ = password.contains("_") || password.contains("$");

        // IT MUST NOT CONTAINS SPACE
        boolean mustNotContainsSpace = ! password.contains(" ");

        // IT MUST START Ab
        boolean mustStartWithAb = password.startsWith("Ab");

        if (min8Max16 && mustContain_Or$ && mustNotContainsSpace && mustStartWithAb){
            System.out.println("VALID PASSWORD!!!");
        }else {
            System.out.println("INVALID PASSWORD!!!");
        }


    }

}