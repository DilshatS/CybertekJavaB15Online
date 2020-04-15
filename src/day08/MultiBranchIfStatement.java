package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        /*
        pseudo sudo code
        given your currentSpeed, speedLimit
        check whether the current speed is

        more than 90 --> jail
        more than 80 and less than 90 --> reckless driving

        ----- tart from here above two optional
        more than 70 and less than 80 --> point taken
        more 60 less than 70 --> warning
        if not speeding keep driving
         */

        // 45, 65, 90  Bad Idea, condition should be always starting with top to bottom or
        // more specific to more generic
        int currentSpeed = 45;
        //int speedLimit = 60;
        if (currentSpeed > 70 ){
            System.out.println("you are speeding more than 70 : Points taken!");
            // asking whether it's less or equal than 70 and more than 60
            // when you come to this point, your speed is already not more than 70
        }else if (currentSpeed > 60){
            System.out.println("your speed is less than or equal 70 but more than 60");
        }else {
            System.out.println("KEEP DRIVING YOU ARE GOOD!!!");
        }

    }

//        if (currentSpeed > 60 ){
//            System.out.println("you are speeding more than 70 : Points taken!");
//            // asking whether it's less or equal than 70 and more than 60
//            // when you come to this point, your speed is already not more than 70
//        }else if (currentSpeed > 60){
//            System.out.println("your speed is less than or equal 70 but more than 60");
//        }else {
//            System.out.println("KEEP DRIVING YOU ARE GOOD!!!");
//        }
//
//    }

}
