package day42;

public class Bike {

    int speed;
    int gear;

    // constructor is a block of code
    // that has same name as className
    // and has no return type
    // if it does not meed above requirement
    // it will not be a constructor
    // the only time you can call this is:
    // when object is being created
    public Bike(){
        System.out.println("message from constructor");
        gear = 1;
    }

    public Bike( int newGear){
        gear = newGear;
        // this.gear = newGear;
    }

    public Bike(int gear, int speed){

        this.gear = gear;
        this.speed = speed;

    }

}
