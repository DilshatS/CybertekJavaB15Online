package day31;

public class MethodPractice3 {

    public static void main(String[] args) {

        // create a class called MethodPractice3
        // give a name count1to10                            : method name
        // no need for object when being called              : static
        // it should be accessible anywhere in your project  : public
        // it does not return any value                      : void
        // does not need any external data when being called : (nothing inside)

        // Create a method called countDownFrom20
        // Create a method to print odd numbers from 1-100 : printOddNumbers1to100
        // Create a method to spell your name : Seda -> S-e-d-a

        countDownFrom20();

        printOddNumbers1to100();

        spellName();

    }

    public static void countDownFrom20(){

        for (int i = 20; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printOddNumbers1to100(){

        for (int x = 0; x <= 100; x++) {

            if (x%2==1){
                System.out.print(x + " ");
            }

        }
        System.out.println();
    }

    public static void spellName(){

        String name = "Seda";
        for (int z = 0; z < name.length(); z++) {

            System.out.println(name.charAt(0));

        }

    }

}
