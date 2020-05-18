package day23;

public class ForEachPracticeFindMax {

    public static void main(String[] args) {

        // I need to pick up an item from this array so I can compare with other items
        // since first one is right there, I just decided to pick it up
        // and make it temporarily the max value
        // can I pick 2nd or 3rd instead -> YES YOU CAN!!!

        // plain English logic to find max number
        // write down the first number as temporarily max salary on a paper
        // then go through each number and compare the number
        // if the number you are comparing is more than what is on the paper
        // delete that number and replace with bigger number
        // keep doing this until you don't have any more number left.

        long[] salaries = new long[] {100000L, 200000L, 150000L, 115000L, 65000L};

        long maxSalary = salaries[0]; // if I put 0 with minus value I'll get 0 as a max value
        // YOU CAN NOT PICK SOMETHING THAT YOU DON'T HAVE INSIDE ARRAY AS INITIAL VALUE

        for (long salary : salaries) {
            // check the current salary is more than max
            if (salary > maxSalary){
                // if so replace the existing value of max with current bigger salary
                maxSalary = salary;

            }

            System.out.println("maxSalary = " + maxSalary);

        }

    }

}
