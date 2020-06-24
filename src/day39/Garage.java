package day39;

public class Garage {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.model = "4 Runner";
        car1.color = "White";
        car1.make = "Toyota";
        car1.year = 2020;

        System.out.println("car1.make = " + car1.make);
        System.out.println("car1.year = " + car1.year);

        System.out.println("---------");

        Car car2 = new Car();

        car2.model = "SantaFe";
        car2.color = "Black";
        car2.make = "Hyundai";
        car2.year = 2017;

        System.out.println("car1.model = " + car2.model);
        System.out.println("car1.color = " + car2.color);
        
        car2.year = 2020;
        System.out.println("car2.year = " + car2.year);

        // I WANT TO CHANGE THE COLOR OF HYUNDAI TO THE COLOR OF TOYOTA
        car2.color = car1.color;
        System.out.println("car2.color = " + car2.color); // car2.color = "white";

    }

}
