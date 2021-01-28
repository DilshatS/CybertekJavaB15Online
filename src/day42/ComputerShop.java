package day42;

public class ComputerShop {

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);

        Computer c1 = new Computer();
        c1.setBrand("Apple");
        c1.setRam(32);
        c1.setPrice(2000);

        c1.runProgram();
        c1.calculate();

        // testing invalid input
        c1.setPrice(12);
        c1.setRam(1000);
        System.out.println("c1 = " + c1.toString());

        int myRam = c1.getRam();
        System.out.println("myRam is = " + myRam);
        String myBrand = c1.getBrand();
        System.out.println("myBrand is = " + myBrand);
        double myPrice = c1.getPrice();
        System.out.println("myPrice = " + myPrice);
        System.out.println();

        Computer c2 = new Computer();
        c2.setBrand("HP");
        // set HP ram to quarter of apple price
        c2.setRam(myRam*4);
        // set HP price to half of apple price
        c2.setPrice(c1.getPrice()/2);

        c2.runProgram();
        c2.calculate();

        int myRam2 = c2.getRam();
        System.out.println("myRam = " + myRam2);
        String myBrand2 = c2.getBrand();
        System.out.println("myBrand = " + myBrand2);
        double myPrice2 = c2.getPrice();
        System.out.println("myPrice = " + myPrice2);
        System.out.println("c2 = " + c2.toString());


    }

}
