package day22;

public class LoopingThroughAnArrayInReverseOrder {

    public static void main(String[] args) {

        String[] name = new String[7];
        name[0] = "D";
        name[1] = "i";
        name[2] = "l";
        name[3] = "s";
        name[4] = "h";
        name[5] = "a";
        name[6] = "t";

        int nameCount = name.length;

        for (int i = 0; i < nameCount; i++) {
            System.out.println(name[i] + " - " + i);
        }
    }

}
