package day41;

public class TVStore {

    public static void main(String[] args) {

        TV t1 = new TV();
        t1.name = "Sony";
        t1.currentChannel = 2000;

        System.out.println("t1 = " + t1.toString());
        t1.turnOn();
        t1.setCurrentChannel(68);

        System.out.println(t1.getCurrentChannel());
        t1.turnOff();

        System.out.println("t1 = " + t1.toString());

    }

}
