package day08;

public class MultiBranchIfStatement2 {

    public static void main(String[] args) {

         /*
        pseudo sudo code
        given your currentSpeed, speedLimit
        check whether the current speed is

        more than 90 --> jail
        more than 80 and less than 90 --> reckless driving
        more than 70 and less than 80 --> points taken
        more 60 less than 70 --> warning
        if not speeding keep driving
         */

        int currentSpeed = 10;

        if (currentSpeed > 90){
            System.out.println("JAIL TIME!");
        }else if (currentSpeed > 80){
            System.out.println("Reckless driving");
        }else if (currentSpeed > 70){
            System.out.println("POINTS TAKEN!");
        }else if (currentSpeed > 60){
            System.out.println("WARNING!");
        }else {
            System.out.println("KEEP DRIVING!");
        }
        System.out.println("THE END");
    }

}
