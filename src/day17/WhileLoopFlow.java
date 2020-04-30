package day17;

public class WhileLoopFlow {

    public static void main(String[] args) {

        int x = 10;
        // a loop condition is false the it will not even bother to enter the loop
        // doesn't matter what inside the loop
        while (x > 100){
            System.out.println("WOLA!");
            ++x;
        }

        System.out.println("THE END");

    }

}
