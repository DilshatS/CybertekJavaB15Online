package day35;

public class ParsingPractice {

    public static void main(String[] args) {

        //                 0   1    2    3   4    5    6    7    8   9
        String sentence = "I bought 3 tomato and the price was 3,14 each";

        // How much is your final checkout price
        // HINT :
        // The count is always 3rd word
        // The price is always at 2nd word from the last

        // LOGIC : split by space, parse count and price, do calculation

        String[] allWords = sentence.split(" ");
        int count = Integer.parseInt(allWords[2]);

        // getting the last element of any array we use index length-1
        // getting the second last element of any array we use index length-2

        String priceString = allWords[allWords.length-2];
        priceString = priceString.replace(",", ".");
        double price = Double.parseDouble(priceString);

        System.out.println("Tomatoes count : " + count);
        System.out.println("Price for each Tomato : " + price);
        System.out.println("Total Price is : " + count * price);



    }

}
