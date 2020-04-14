package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        int apple = 10;

//        apple = apple + 1;
//        apple += 1;
        ++ apple; // this is increasing the value by one is shortcut using ++
        ++ apple;

        System.out.println("Used ++ twice then apple is : " + apple );

//        apple = apple + 1;
//        apple += 1;
        --apple;

        System.out.println("Used -- once then apple is : " + apple );

//        System.out.println( ++ apple );
        System.out.println("Used ++ to increment and concatenate : " + ++apple );

    }

}
