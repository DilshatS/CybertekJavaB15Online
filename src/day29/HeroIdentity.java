package day29;

public class HeroIdentity {

    public static void main(String[] args) {

        // assume this can be different hero
        String hero1 = "Superman-Clark J Kent";
        // hide this hero identity

        //String heroX = "Superman-************";

        // given a String with hero code and name separated by -
        // turn this String into hero code and * with same length as hero name

        // Plain English Logic :

        // split it by - to get the code and full name
        // get the length of full name
        // generate starts with same length as full name character count
        // concatenate hero code with dash and stars and save it
        // OR one the star is generated , replace full name with stars

        String[] heroSplit = hero1.split("-");
        String heroCode = heroSplit[0];
        String fullName = heroSplit[1];

        int nameCharCount = fullName.length();
        String stars = "";
        //String stars = heroCode + "-";

        for (int i = 0; i < nameCharCount; i++) {

            stars = stars + "*"; // stars += "*";

        }

//        System.out.println(fullName);
//        System.out.println(stars);

        String heroX = heroCode + "-" + stars;
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);

    }

}
