package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {

        String students = "Abbos, Zulyar, Zhibek, Hasan, Muge, Orhan, Susan";

        students = students.replace(" ", "");
        System.out.println("students = " + students);

        String[] namesArrays = students.split(",");

        System.out.println(Arrays.toString(namesArrays));

        System.out.println("length of namesArrays is : " + namesArrays.length);

        int studentCount = namesArrays.length;

        for (int x = 0; x < studentCount; x++) {

            String name = namesArrays[x]; // Abbos // A-b-b-o-s-
            System.out.println("spelling = " + name);

            for (int i = 0; i < name.length(); i++) {

                System.out.print(name.charAt(i) + "-");

            }

            System.out.println();


        }



//
//            String name1 = namesArrays[1]; // Zulyar
//            for (int i = 0; i < name1.length(); i++) {
//
//                System.out.print(name1.charAt(i) + "-");
//
//            }
//
//            System.out.println();
//
//            String name2 = namesArrays[2]; // Zhibek
//            for (int i = 0; i < name2.length(); i++) {
//
//                System.out.print(name2.charAt(i) + "-");
//
//            }


            // first get all the name into String array called namesArray
            // Spell the name of each person in this format
            // exclude space if you get space in names
            // A-b-b-o-s- ...
            // Z-u-l-y-a-r- ...

            // Optionally count a from each name and print


        }

    }
