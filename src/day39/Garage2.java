package day39;

public class Garage2 {

    public static void main(String[] args) {

        // Create car object using Class
        // or Get an instance of car Class

        Car car1 = new Car();

        car1.model = "4 Runner";
        car1.color = "White";
        car1.make = "Toyota";
        car1.year = 2020;

        car1.goForward();
        car1.printAge();

        car1.changeColorTo("Blue");
        System.out.println("car1.color = " + car1.color);

        System.out.println("---------");

        Car car2 = new Car();

        car2.model = "SantaFe";
        car2.color = "Black";
        car2.make = "Hyundai";
        car2.year = 2017;

        car2.goForward();
        car2.printAge();

        System.out.println("END");
    }

}
