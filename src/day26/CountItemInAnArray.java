package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHero = {"Iron Man", "Captain America", "Spider Man",
                 "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                 "Captain America", "Spider Man",
                 "Black Widow", "Wanda", "Captain Marvel",
                 "Captain America"};

        System.out.println("Marvel Hero = " + Arrays.toString(marvelHero));
        int sizeOfArray = marvelHero.length;
        System.out.println("Hero count = " + sizeOfArray);

        String itemToSearch = "Black Widow";
        int countOfItem = 0;

        for (String eachHero : marvelHero){

            if (eachHero.equals(itemToSearch)){

                countOfItem++;

            }

        }

        // COUNT THE HERO WITH THE NAME CONTAINS BLACK

        System.out.println("countOfItem = " + countOfItem);

//        for (int x = 0; x < marvelHero.length; x++) {
//
//            if (x == sizeOfArray){
//
//                countOfItem++;
//
//            }
//
//        }
//        System.out.println("countOfItem = " + countOfItem);

    }

}
