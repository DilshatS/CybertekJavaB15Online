package day23;

public class ForEachPractice {

    public static void main(String[] args) {

        // create a long array of 5 item called salaries
        // put your salary amounts that ok for your offer
        // use for each loop to iterate over the them

        // OPTIONALLY
        // print only the salary more than 100000
        // use for each loop to find max
        // use for each loop to find the sum


        long[] salaries = new long[] {100000L, 200000L, 150000L, 115000L, 65000L};


//        for ( long eachSalary : salaries ) {
//
//            System.out.println("Each Salary = " + eachSalary);
//
//        }

        for ( long salary : salaries ) {

//            if ( salary > 100000 ){
//                System.out.println("salary = " + salary);
//            }

            // how can I skip salaries less than or equal to 100000

            if (salary <= 100000){
                continue;

            }

            System.out.println("salary = " + salary);

        }

    }

}
