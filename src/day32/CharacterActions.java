package day32;

public class CharacterActions {

    public static void main(String[] args) {

        printAtoZ('A');
        printZtoA();
        printAtoZ('D');

    }

    // printAtoZ
    // create a method that has no parameter
    // and print A-Z in one line

    public static void printAtoZ(char myChar){

        for (char i = myChar; i <= 'Z'; ++i){
            System.out.print(i + " ");
        }
        System.out.println(); // so we can move to the next line
    }

    // printZtoA
    // create a method that has no parameter
    // and print Z-A in one line

    public static void printZtoA(){

        // this is how we can print in descending order
//           start          end      decrement
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println(); // so we can move next line
    }

}
