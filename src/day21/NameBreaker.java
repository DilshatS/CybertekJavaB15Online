package day21;

public class NameBreaker {

    public static void main(String[] args) {

        //             012345678
        String name = "NursuLtan";

        for (int x = 0; x < name.length(); x++) {

            char currentChar = name.charAt(x);

            if (currentChar == 'l') {
                System.out.println("FOUND IT!!!");
                break;
            }

            System.out.println(currentChar);

        }

        // OPTIONALLY CHANGE THE METHOD WITHOUT SAVING EACH CHAR
        for (int x = 0; x < name.length(); x++) {

            String currentChar = name.substring(x, x + 1);

            if (name.substring(x,x+1).equalsIgnoreCase("l")) {
                System.out.println("FOUND IT!!!");
                break;

            }
            System.out.println(currentChar);
        }

        for (int x = 0; x < name.length(); x++) {

            char currentChar = name.charAt(x);

            if (currentChar == 'l' || currentChar == 'L') {
                System.out.println("FOUND IT!!!");
                break;
            }

            System.out.println(currentChar);

        }


    }

}
