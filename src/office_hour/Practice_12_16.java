package office_hour;

import java.util.Arrays;

public class Practice_12_16 {

    public static void main(String[] args) {

        String[] names = {"John", "Kevin", "Scott"};
        System.out.println("First name: " + names[0]);

        System.out.println("----- for each loop print all names 1 by 1 -----");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("----- fori loop print all names 1 by 1 -----");

        for (int x = 0; x < names.length; x++) {
            System.out.println(names[x]);
        }
        // 2D array is : array of arrays; 3D array is : array of array of arrays

        // apache poi library ( read/write data from excel with java)
        // if you need age of 3rd student students[2][2]
        // if you need age of 1st student students[0][2]
        // if you need age of 2nd student students[1][2]
        // let's say we need to store some table
        // where we have rows and columns
        //             | student id | name  | age | country
//                     | 1          | John  | 35  | USA
//                     | 2          | Kevin | 40  | Brazil
//                     | 3          | Scott | 20  | Canada
        String[][] students = {{"1", "John", "35", "USA"},
                               {"2", "Kevin", "40", "Brazil"},
                               {"3", "Scott", "20", "Canada"}};

        // to format your code
        // click option + command + L
        System.out.println("How many arrays inside students 2D arrays? " + students.length);
        System.out.println("HOw many values in second row (inner array)? " + students[1].length);

        // loop through inner arrays
        for (String[] arr : students) {
            // loop through values in every inner array
            for (String value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // find oldest student and print his name
//        for (int i = 0; i < students.length; i++) {
//            int age = Integer.parseInt(students[i][2]);
//        }

        // 1st Get only age values
        // Integer.parseInt - convert string into int
        String oldestPersonName = students[0][1]; // let's infer that 1st person is oldest
        int ageOfOldestPerson = Integer.parseInt(students[0][2]);
        for (String[] row : students){
            // go through every row and get
            // value only from 3rd column | number -1 = index
            System.out.println(row[2]); // 3rd row represents age
            // I need to convert into integer to be able to compare

            int age = Integer.parseInt(row[2]); // convert string --> into int


            System.out.println("age = " + age);

            // if age is higher then previous max
            if (age > ageOfOldestPerson){
                // then we have new max age and new oldest name
                ageOfOldestPerson = Integer.parseInt(row[2]);
                oldestPersonName = row[1];
            }

        }
        System.out.println("Oldest person is : " + oldestPersonName);
        System.out.println("ageOfOldestPerson = " + ageOfOldestPerson);
    }

}
