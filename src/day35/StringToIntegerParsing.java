package day35;

public class StringToIntegerParsing {

    public static void main(String[] args) {

        // I have a employee ID : "FB-457"
        // give me the employee number and store it into a method

        String  strNum = "100";
        int num = Integer.parseInt(strNum);
        //System.out.println("num = " + num);

        String empID = "FB-457";
        /*
        Integer class is class coming from java.lang package
        It's primarily used for wrapping up primitive value and treat it as an object
        what we will focus here is though
        many useful static methods it provide already
        parseInt is a static method of Integer class
        It will turn a String that has only numbers and return int result
        if we have any non-numerical character -> It will throw NumberFormatException
         */

        //int id = Integer.parseInt(empID.split("-")[1]);
        String[] empIDSplit = empID.split("-");
        String idStr     =    empIDSplit[1];
        int id = Integer.parseInt(idStr);
        System.out.println("id = " + id);

        String twoNumbers = "100,600";
//        I want you to add them and give the result
//        int twoNumSplit = Integer.parseInt(twoNumbers.split(",")[1]);
//        System.out.println("twoNumSplit = " + twoNumSplit);
        String num1 = "100";
        String num2 = "600";
        // I want you to add them and give the result 700

        // IN ORDER TO PERFORM ARITHMETIC OPERATION
        // WE MUST HAVE NUMBERS STORED IN int
        // SO FIRST WE NEED TO TURN STRING INTO int
        // JDK already provide such methods
        // and it comes from Integer class from java.lang package
        // Integer.parseInt("YourNumberInString");

        int numI = Integer.parseInt(num1);
        int numX = Integer.parseInt(num2);
        System.out.println("sum of num1 and num2 : "+ (numI + numX));




    }

}
