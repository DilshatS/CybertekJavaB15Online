package day15;

public class ReplaceMethod {

    public static void main(String[] args) {

        // Replace method of the String
        // it will go through all part of String and replace
        // any match with the new String
        // It is case sensitive

        String message = "I love Pumpkin, Pumpkin IS FUN";
        message = message.replace("pumpkin", "Java");
        System.out.println("message = " + message);
//        System.out.println(message.replace("Pumpkin","Java"));
//        System.out.println(message);
        //                 01234567890123456789012345678
        String message2 = "Happy Thanks Giving to All!!!";
        // "Happy Thanks Giving to All!!!" ---> "Happy Thanksgiving to All!!!"
        message2 = message2.replace("Thanks Giving","Thanksgiving");
        System.out.println("message2 = " + message2);

        message2 = message2.replace("!!!","!");
        System.out.println("message2 = " + message2);

        message2 = message2.replace(" ", "");
        System.out.println("message2 = " + message2);

        String message3 = "TOMORROW IS OFF NO!";
        // How do we remove NO!
        message3 = message3.replace(" NO","");
        System.out.println("message3 = " + message3);

//        System.out.println(message2.length());
//        System.out.println(message2.substring(13,19).toLowerCase());

        // what if I want replace space from everywhere


    }

}
