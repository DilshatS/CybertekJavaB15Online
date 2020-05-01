package day18;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {

        // skip counting by 2
        // starting from 0 -- 100

        for (int i = 0; i < 100; i += 2) { // or i = i + 2
                System.out.print(i + " ");
        }

        // skip counting by 3
        // starting from 0 -- 100
        System.out.println();

        for (int i = 0; i < 100; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Even Number");

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("-------------------------");
        // THE SHORTCUT FOR GENERATING FOR LOOP IS : fori tab
        for (int i = 0; i < 100; i++) {
            if (i %5 == 0 && i %3 == 0 ){
                System.out.println(i + " IS FIZZ BUZZ NUMBER");
            }
        }

        // Everything you can do with the for loop --> can be done using while loop

    }

}
