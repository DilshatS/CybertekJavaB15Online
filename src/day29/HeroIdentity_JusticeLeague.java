package day29;

public class HeroIdentity_JusticeLeague {

    public static void main(String[] args) {

        String[] allHeros = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for (String eachHero : allHeros) {
            //System.out.println("eachHero = " + eachHero);

            // assume this can be different hero
            String hero = eachHero;
            // hide this hero identity

            //String heroX = "Superman-************";


            String[] heroSplit = hero.split("-");
            String heroCode = heroSplit[0];
            String fullName = heroSplit[1];

            String stars = "";
            for (int i = 1; i <= fullName.length(); i++) {

                stars += "*";

            }

            String heroX = hero.replace(fullName, stars);
            System.out.println("hero = " + hero);
            System.out.println("heroX = " + heroX);

        }

    }

}
