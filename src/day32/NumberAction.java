package day32;

public class NumberAction {

    public static void main(String[] args) {

        repeatString("Java", 3);
        repeatString("DO NOT TOUCH WORKING CODE", 10);

        numberComparision(5,2);

        skipCountBy3From0to50();

    }

    /**
     * numberComparision
     * this method has 2 parameters called num1 and num2
     * if num1 is more than num2 print num1 is more than num2
     * if num2 is more than num1 print num2 is more than num1
     * if num2 are equals num1 print they are equal
     *
     *
     * @param number1
     * @param number2
     */

    public static void numberComparision(int number1, int number2){

        if ( number1 > number2){
            System.out.println("number1 is more than number2");
        }else if (number2 > number1){
            System.out.println("number2 is more than number1");
        }else {
            System.out.println("they are equal");
        }

    }

    /**
     * This method will print from 1 to the number user passed
     *
     * @param x
     */

    public static void print1toX(int x){

        for (int i = 1; i <= x; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    /**
     * skipCountBy3From0to50
     */

    public static void skipCountBy3From0to50(){

        for (int i = 0; i < 50; i = i +3) {
            System.out.print(i + " ");
        }

    }

    /**
     * countDownByEvenNumberFrom50to0
     * create a method that has no parameter
     * and count Down By Even Number From 50 to 0
     * for example 50 , 48 , 46 .....0
     */



    /**
     * instead of countDownByEvenNumberFrom50to0
     * now count Down By EvenNumber From x to y
     *
     * @param x
     * @param y
     */

     /**
     * repeatString
     * this method has 2 parameters
     * String strToRepeat and int count
     * repeat printing the string as many time as <count> number define
     * repeatString("Java", 3) -->> Java Java Java
     * @param strToRepeat
     * @param count
     */

     public static void repeatString(String strToRepeat, int count){

         for (int i = 1; i <= count; i++) {
             System.out.print(strToRepeat + " ");
         }
         System.out.println();
     }

}
