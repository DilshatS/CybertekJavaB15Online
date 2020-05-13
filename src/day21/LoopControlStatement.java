package day21;

public class LoopControlStatement {

    public static void main(String[] args) {

        // break
        // if the line contains break reaches, the loop will stop!!!

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            break;
//        }

        // while iteration over 1 to 10
        // break out of the loop when it's 5

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            if (i==5){
//                break;
//            }
//        }

        // I want to keep adding money to my bank account from day 1 till day 10
        // day 1 I add 1$
        // day 2 I add 2$
        // day 3 I add 3$
        //...
        // day 10 I add 10$

        // however my bank account can only hold 12$
        // so I need to stop adding money the moment I realize it can not hold
        // the money I am about put if the sum would go over 40

        int sum = 0;

        for (int x = 1; x <= 10; x++) {

            System.out.println("Final sum is " + sum);
            System.out.println("If I add " + x + " dollar, it would be " + (sum+x));
            // here we are checking whether after adding the next number
            // it will go over 40 or not
            // that's why we should use sum + x to see whether it will go over before we actually add them

            if (sum + x > 12){
                break; // BREAKING OUT OF THE LOOP

            }
                // we need to check the sum after we make sure it did not go over 40
                sum = sum + x;

        }

        System.out.println("sum = " + sum);

        // continue
        // if the line contains break reaches the loop will skip to next iteration

        // WE CAN USE break and continue for any type of loop
        
    }
    
}
