package day17;

public class WakeUp_NameCorrector {

    public static void main(String[] args) {
        //             01234567
        String name = "kHumAyRa";

        // substring method copy the part of String inside another String
        // it has 2 version
        // 1 start with certain index and end at ending index
        // 2 start with certain index then get the rest of the String

        // get the first character
        // get the rest of the characters starting starting from 2nd character
        // then make it lowercase
        // eventually concatenate them

//        String nameFix = (name.charAt(0)+"").toUpperCase();
//        nameFix = nameFix + name.substring(1).toLowerCase();

        String nameFix = name.toUpperCase().substring(0,1);
        nameFix += name.substring(1).toLowerCase();

        System.out.println("nameFix = " + nameFix);

        // make whole name uppercase the get the first character
        // get the rest of the characters starting starting from 2nd character
        // then make it lowercase
        // eventually concatenate them

    }

}
