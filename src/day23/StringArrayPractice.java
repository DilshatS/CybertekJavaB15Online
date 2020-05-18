package day23;

public class StringArrayPractice {

    public static void main(String[] args) {

        // we created array in short way just by opening up { }
        // we put them in different line since white space does not matter
        String[] show = { "Orville", "Gifted", "Game of Throne", "Flash", "Arrow", "Super girl"};

        String myFavoriteShow = show[0];
//        System.out.println("myFavoriteShow = " + myFavoriteShow);
//
//        System.out.println("my favorite show character count is : " + myFavoriteShow.length());

        System.out.println("myFavoriteShow = " + myFavoriteShow + " char count is : " + myFavoriteShow.length());

        int showCount = show.length;
        System.out.println("showCount = " + showCount);

        for (int x = 0; x < showCount; x++) {
            //String currentShow = show[x];
            //System.out.println(currentShow + " : has character count - " + currentShow.length());

            System.out.println(show[x] + " : has character count - " + show[x].length());

        }

    }

}
