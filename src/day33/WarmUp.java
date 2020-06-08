package day33;

public class WarmUp {

    public static void main(String[] args) {

        System.out.println(getSpelledName("Dilshat"));
        System.out.println(getSpelledName("Serra"));
        System.out.println(getSpelledName("Zeynap"));

    }

    /**
     * create a method getSpelledName
     * This method will put dash in between given String
     * for example : Akbar -> A-k-b-a-r
     * @param name this is the name parameter
     * @return the name has dash in between
     */

    public static String getSpelledName(String name){
        // creating a variable for resulting String
        String result = "";

        for (int x = 0; x < name.length(); x++) {

            result = result + name.charAt(x);
            // concatenate dash(-)
            // if we are not at last characetr
            if (x != name.length()-1){
                result = result + "-";

            }

        }

        return result;

    }

    public static String getSpelledName2(String name){

        String result = "";

        return result;

    }

}
