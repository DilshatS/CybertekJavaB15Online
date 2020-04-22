package day14;

public class EmailChecker {

    public static void main(String[] args) {

        // Task 2
        // create variable called email
        // check for below conditions
        // if it does not contain character @ say invalid email
        // if it contain space say invalid email
        // if it endWith @gmail.com --> gmail
        // if it endWith @yahoo.com --> yahoo
        // if it endWith @mail.ru --> mail
        // --------------------------------------------------------
        // MY OWN VERSION

        String email = "door@gmail.com";

        boolean contain = email.contains("@");
        boolean space = ! email.contains(" ");

        boolean endGmail = email.endsWith("@gmail.com");
        boolean endYahoo = email.endsWith("@yahoo.com");
        boolean endMail = email.endsWith("@mail.ru");

        if (contain && space){

            if (endGmail){
                System.out.println("This is gmail.com");
            }else if (endYahoo){
                System.out.println("This is yahoo.com");
            }else if(endMail){
                System.out.println("This is mail.ru");
            }else{
                System.out.println("INVALID EMAIL!!!");
            }

        }else{
            System.out.println("INVALID EMAIL!!!");
        }

        // AKBAR TEACHER VERSION

        if (! email.contains("@") || email.contains(" ") ){
            System.out.println("INVALID EMAIL!!!");
        }else if (email.endsWith("@gmail.com")){
            System.out.println("Google mail");
        }else if (email.endsWith("@yahoo.com")){
            System.out.println("Yahoo mail");
        }else if (email.endsWith("@mail.ru")){
            System.out.println("Russian email");
        }else{
            System.out.println("INVALID EMAIL!!!");
        }

    }

}
