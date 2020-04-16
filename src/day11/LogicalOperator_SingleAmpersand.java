package day11;

public class LogicalOperator_SingleAmpersand {

    public static void main(String[] args) {

        // && 2 ampersand & 1 ampersand --> Logical And Operator
        // This is used to check both conditions are true at the same time

        // && is called short circuit AND
        // --> it does not check the next condition as long as the first condition is false
        // --> just like if you have multiple condition for rocket launching
        // isEngineRunning, isCommunicationSystemWorking, isAirEnough

        // isEngineRunning && isCommunicationSystemWorking && isAirEnough
        // if isEngineRunning is false then it does not go and check next conditions

        // & --> CHECK EACH and EVERY CONDITION NO MATTER WHAT

        // isEngineRunning && isCommunicationSystemWorking && isAirEnough
        // if isEngineRunning is false then it does not go and check next conditions
        // it still check isCommunicationSystemWorking
        // it still check isAirEnough
        // and eventually give you the outcome

//        System.out.println( 7 > 5 && 1 > 7 );
//        System.out.println( 5 > 5 && 1 > 7 );
//        System.out.println( 1 > 5 && 9 > 7 );
//
//        System.out.println( 7 > 5 && 1 > 7 );
//        System.out.println( 5 > 5 && 1 > 7 );
//        System.out.println( 1 > 5 && 9 > 7 );

//        System.out.println( 7 > 5 && 9 > 7 );

        //System.out.println( 9 / 0 ); // ERROR! CAN NOT DIVIDE BY 0
        // I want to check whether dividing 9 by 0 is 3
        //System.out.println( 9/ 0 == 3 );

        // combine the result of 5 is more than 10
        // and 9 dividing by 0 is 3
        // For example if Engine doesn not work not reason to check further!!!!!
        System.out.println( 5 > 10 && 9 / 0 == 3 );
        System.out.println( 11 > 10 & 9 / 0 == 3 );

    }

}
