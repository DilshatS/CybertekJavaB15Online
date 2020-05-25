package day27;

public class MultiDimensionalArray_Practice {

    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam = {"Zhibeckchan", "Mohammed Sohrabi", "Hassan Mammadov", "Nursultan"};
        String[] businessAnalystTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalystTeam};

        int maxLength = scrumTeam[0][0].length();
        String longestString = ""; // to store the longest name

        for (String[] each1DArray : scrumTeam){

            for (String eachElement : each1DArray){

                if (maxLength < eachElement.length()) { // to compare which String has the largest length
                    maxLength = eachElement.length();
                    // to assign maximum string length

                    longestString = eachElement;
                    // if the String has the largest length, we assign that String to longestString
                }

            }

        }

        System.out.println("maxLength = " + maxLength + " - " + longestString);

//        for (String[] each1DArray : scrumTeam){
//
//            for (String eachElement : each1DArray){
//
//                if (maxLength == eachElement.length()) {
//
//                    System.out.println(eachElement);
//                }
//
//            }
//
//        }

    }

}
