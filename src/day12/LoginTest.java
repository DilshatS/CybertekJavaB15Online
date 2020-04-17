package day12;

public class LoginTest {

    public static void main(String[] args) {

        /**
         * String str = "abs";
         * str.equals("abs") ->  !str.equals("abs") -> false
         *
         * Create class called LoginTest with main method
         * Create 2 Strings variable called userName, password
         * and do following
         * your current userName and password correct
         * If so print login successful
         * If not
         * Check whether your userName correct
         * if not print, userName is not correct
         * Check your password is correct or not
         * If not print password is not correct
         */

        // we can declare and assign value like this
        // if it's multiple variables of same type
        String userName = "user123" , password = "pass123";
        // user123, pass123

        //System.out.println(!userName.equals("user123"));

        if (userName.equals("user123") && password.equals("pass123") ){
            System.out.println("Login Successful");
        }else if (!userName.equals("user123") && password.equals("pass123") ){
            System.out.println("USERNAME NOT CORRECT!!!");
        }else if (userName.equals("user123") && !password.equals("pass123")){
            System.out.println("PASSWORD NOT CORRECT!!!");
        }else{
            System.out.println("USERNAME AND PASSWORD NOT CORRECT!!!");
        }

    }

}
