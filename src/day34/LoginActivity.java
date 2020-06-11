package day34;

public class LoginActivity {

    public static void main(String[] args) {

        // WITH VOID
        loginVoid("my username", "abc123");
        loginVoid("user", "abc123");

        // WITH RETURN
        boolean result = loginReturn("user", "abc1233");
        System.out.println("result : " + result);

        System.out.println("second run : " + loginReturn("aaa", "bbb"));
        //System.out.println(     loginVoid ("aaa", "bbb")      ); CAN NOT DO IT WITH VOID METHOD
        //boolean result2 = loginVoid("abc","efg");

        if (loginReturn("user1","abc123")) {

            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View The order");

        }else {
            System.out.println("NO SHOPPING UNLESS YOU SIGNED IN!!!");
        }
    }

    public static void loginVoid(String user, String password) {

        if (user.equals("user") && password.equals("abc123")){
            System.out.println("LOG IN SUCCESSFUL");
        }else {
            System.out.println("LOG IN FAILED");
        }
    }

    public static boolean loginReturn(String user, String password) {

        return user.equals("user") && password.equals("abc123");

    }

//        if (user.equals("user") && password.equals("abc123")){
//            return true;
//        }else {
//            return false;
//        }


}
