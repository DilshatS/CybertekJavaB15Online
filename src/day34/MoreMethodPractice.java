package day34;

public class MoreMethodPractice {

    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(false,false));
        System.out.println(monkeyTrouble(true,false));

        System.out.println(monkeyTrouble2(true,true));
        System.out.println(monkeyTrouble2(false,false));
        System.out.println(monkeyTrouble2(true,false));

    }

    // return yes and no instead of true and false

    /**
     * A method that return Yes only if both monkeys are smiling or not smiling
     * @param aSmile
     * @param bSmile
     * @return Yes only if both monkeys are smiling or not smiling, no if not
     */
    public static String monkeyTrouble2(boolean aSmile, boolean bSmile){
        // TODO : Your code goes here
        //return aSmile==bSmile;

        if ( (aSmile && bSmile) || (!aSmile && !bSmile) ){
            return "Yes";
        }else {
            return "No";
        }

        //return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    /**
     * A method that return true only if both monkeys are smiling or not smiling
     * @param aSmile first monkey smile or not
     * @param bSmile seconf monkey smile or not
     * @return true only if both monkeys are smiling or not smiling
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        // TODO : Your code goes here

//        return aSmile==bSmile;
//        if ( (aSmile && bSmile) || (!aSmile && !bSmile) ){
//            return true;
//        }else {
//            return false;
//        }

        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

}
