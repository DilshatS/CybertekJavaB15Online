package day36;

import day06.UsingTheValueOfOtherVariables;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        // create a ArrayList Object of long and assign it to a variable
        ArrayList<Long> lst = new ArrayList<>();

//        C.R.U.D
//                Create, Read, Update, Delete

        // add item, insert an item, read item, update the item, remove the item, check the location ...

        lst.add( 12L  ); // 12L is automatically converted to new Long(12L) ; because ArrayList only store object
        lst.add( 100L );
        lst.add( 150L );
        lst.add( 200L );
        // practically you will not add null, but it possible
        // lst.add(null);

        System.out.println("lst = " + lst);
        // I want to insert 125 between 100L and 150L, basically 2nd and 3rd item
        lst.add(2,125L);
        System.out.println("lst = " + lst);
        System.out.println("lst item count = " + lst.size());

        System.out.println("lst.get(3) = " + lst.get(3));

        // updating value at certain index : set method
        lst.set(3,195L);
        System.out.println("NEW VALUE FOR lst.get(3) = " + lst.get(3));
        System.out.println("lst = " + lst);

        // removing item by its value
        // lst.remove(100L);
        // System.out.println("lst after removing 100 = " + lst);
        // removing item by its index
        // lst.remove(2);
        // System.out.println("lst after removing by index = " + lst);

        // looking for location of certain item

        System.out.println("\nLocation of 100L is using lst.indexOf(100L) " + lst.indexOf(100L));

        System.out.println("\nLocation of 23L is using lst.indexOf(23L) " + lst.indexOf(23L));

        // Check whether a list is empty or not
        System.out.println("\nlst.size() > 0 = " + (lst.size() > 0));

        System.out.println("\nlst.isEmpty() = " + lst.isEmpty());

        // how do I delete everything inside my ArrayList
        // lst.clear();
        // System.out.println("\nlst.isEmpty() = " + lst.isEmpty());
        // System.out.println("lst = " + lst);

        // check whether we have certain item or not

        System.out.println("\nlst.contains(100L) = " + lst.contains(100L));
        System.out.println("lst.contains(10L) = " + lst.contains(10L));

        // how do I check whether a list contains an item without using contains
        // use indexOf method, if it return -1, it means we don't have it
        System.out.println("DO I HAVE 10L = " + (lst.indexOf(10L) != -1));

        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(5);
        lst2.add(3);
        lst2.add(4);
        lst2.add(2);

        lst2.indexOf(3);
        System.out.println("\nlst2 = " + lst2);


    }

}
