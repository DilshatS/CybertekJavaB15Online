package day38;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
import java.util.*;

public class SortingAListObject {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300,200,700,600,800));
        System.out.println("nums before sort = " + nums);

        // 2 ways to sort an ArrayList
        // Use Collections utility class (just like Arrays utility class for array objects)
        // Collections is a class coming from java.util package
        // it has a lot of ready method to work with Collections objects like ArrayList and so on
        Collections.sort(nums);
        System.out.println("nums after sort = " + nums);

        // This version of sort method accept 2 arguments
        // 1st is the list to be sorted
        // 2nd a Comparator Object that contains comparing logic
        // good news is there is ready method already in java
        // we can get reverse order comparator object by calling
        // Comparator.reverseOrder(), JUST TAKE IT AND USE IT!!!
        Collections.sort( nums, Comparator.reverseOrder() );

    }

}
