package day18;

public class DoWhileAtLeastRunOnce {

    public static void main(String[] args) {

        // WHILE LOOP VS DO WHILE LOOP
        /*
        while loop check the condition first then enter the statement
        do while loop will take the action at least once then check the condition

        DO WHILE LOOP ALWAYS RUN AT LEAST ONE ITERATION
        WHILE LOOP MIGHT NOT EVEN RUN
         */

        int x = 1000;
        do {
            System.out.println("KEEP GOING");
        } while (x < 5);

        System.out.println("THE END");

        while (x < 5){
            System.out.println("KEEP GOING IN WHILE");
        }

    }

}
