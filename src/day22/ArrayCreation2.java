package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {

        int num; // we are only declaring a variable
            num = 10; // we are assigning a value on different line

        // creating an array in second way

        //int[] ages = new int[]{ 3,5,11,33,57,18 };
        int[] ages; // we are only declaring a variable
        // we are assigning a value on different line
              ages = new int[]{ 3,5,11,33,57,18 };

        int itemCount = ages.length;

        System.out.println("itemCount = " + itemCount);

        System.out.println("ages = " + ages);

        //System.out.println(ages[0]);

        for (int x = 0; x < itemCount; x++) {
            System.out.println(ages[x]);
        }

        int[] areaCode = { 703, 300, 954, 665 };
        // if you do it this way : IT MUST HAPPEN IN ONE LINE TOGETHER
//        int[] areaCode;
//              areaCode = { 703, 300, 954, 665 };
        for (int x = 0; x < areaCode.length; x++) {

            System.out.print(areaCode[x] + " ");

        }

    }

}
