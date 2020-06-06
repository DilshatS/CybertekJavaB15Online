package day31;

public class HomeWork {

    public static void main(String[] args) {

        printMyOwnName();
        printAnyName("Dilshat");
        printLastCharacterName("Dilshat");
        printFullNameInformation("Dilshat", "Sadamov");
        compareNameCharacterCount("Dilshat", "Elnaza");
        printAtoZ('A');

    }

    public static void printMyOwnName(){

        System.out.println("Dilshat");

    }

    public static void printAnyName(String name){

        System.out.println("reversed name is : " + name.charAt(6)+name.charAt(5)+name.charAt(4)+
                name.charAt(3)+name.charAt(2)+name.charAt(1)+name.charAt(0));

    }

    public static void printLastCharacterName(String lastChar){

        System.out.println("Last character of name is : " + lastChar.charAt(lastChar.length()-1));

    }

    public static void printFullNameInformation(String firstName, String lastName){

        System.out.println("My first name is : " + firstName + ", and my last name is : " + lastName);
        System.out.println("Length of my Full name is " + (firstName.length() + lastName.length()));

    }

    public static void compareNameCharacterCount(String name1, String name2){

        if (name1.length() > name2.length()){
            System.out.println("name1 is Longer");
        }else if (name1.length() < name2.length()){
            System.out.println("name2 is longer");
        }else if (name1 == name2){
            System.out.println("name1 and name2 same character count");
        }

    }

    public static void printAtoZ(char myChar){

        for (char i = myChar; i <= 'Z'; ++i){
            System.out.print(i + " ");
        }

    }

}
