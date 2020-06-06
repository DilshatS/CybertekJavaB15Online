package day31;

public class SeasonChecker {

    public static void main(String[] args) {

        // a String variable declared and assigning value inside main method
        // It can be accessible in main method

        decideSeasonAction("winter");
        decideSeasonAction("Summer");

        String mySeason = "Company";
        decideSeasonAction(mySeason);

        System.out.println("AAAA"); // you can directly pass AAAA to the method
        decideSeasonAction(mySeason); // or you can pass a variable that has value AAAA to the method

    }

    public static void decideSeasonAction(String season) {
        // this season method parameter can only be accessible inside method body
        //String season = "Winter";

        switch (season) {
            case "Spring":
                System.out.println("hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpkin picking");
                break;
            case "Winter":
                System.out.println("Go Snowboarding");
                break;
            default:
                System.out.println("INVALID SEASON!!!");
        }

//        if (season.equalsIgnoreCase("Winter")){
//            System.out.println("Go Snowboarding");
//        }else if (season.equalsIgnoreCase("Spring")){
//            System.out.println("hiking");
//        }else if (season.equalsIgnoreCase("Fall")){
//            System.out.println("Pumpkin picking");
//        }else if (season.equalsIgnoreCase("Summer")){
//            System.out.println("Swimming");
//        }else {
//            System.out.println("UNKNOWN SEASON");
//        }


        // Write a static method called decideSeasonAction
        // It has one String parameter called season
        // Inside method body :
        // According to what user passed it should print correct action

    }
}