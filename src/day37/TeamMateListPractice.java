package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateListPractice {

    /**
     * Warm Up :
     * Create ArrayList of String and store
     * teamMates
     * print one by one
     * print reverse
     * print first last
     * print 2 at a time
     * concat everyone in one string separated by -
     */
    public static void main(String[] args) {

        //ArrayList<String> teamMates = new ArrayList<>();
        List<String> teamMates = new ArrayList<>();

        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("Maruf");
        teamMates.add("Vasyl");
        teamMates.add("Muhtar");
        teamMates.add("Asiya");
        teamMates.add("Mike");
        teamMates.add("Guljannat");

        System.out.println("teamMates = " + teamMates);

        // first item
        System.out.println("first item = " + teamMates.get(0));
        // last item -> using last index -> size()-1
        int lastItemIndex = teamMates.size()-1;
        System.out.println("lastItemIndex = " + lastItemIndex);
        System.out.println("last item = " + teamMates.get(lastItemIndex));
        System.out.println("last item2 = " + (teamMates.get(teamMates.size()-1))); // one shot print

        // print one by one
        System.out.println("ALL ITEMS : ");
        for (int x = 0; x < teamMates.size(); x++) {

            System.out.println("Item " + x + " = " + teamMates.get(x));

        }

        System.out.println("All ITEMS IN REVERSE ORDER : ");
        for (int x = lastItemIndex; x >= 0; x--) {

            System.out.println("Item " + x + " = " + teamMates.get(x));

        }


    }

}
