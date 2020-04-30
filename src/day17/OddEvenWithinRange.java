package day17;

public class OddEvenWithinRange {

    public static void main(String[] args) {

        // write a program to print out a even number from 0 to 50
        // write a program to print out a odd number from 0 to 50

        System.out.println();
        int count = 0;
        while(count <= 50){
            System.out.print(count + " ");
            count += 2;
        }

        System.out.println();
        int count2 = 1;
        while (count2 < 50){
            System.out.print(count2 + " ");
            count2 += 2;
        }

    }

}
