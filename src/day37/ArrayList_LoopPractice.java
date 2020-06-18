package day37;

import java.util.ArrayList;

public class ArrayList_LoopPractice {

    public static void main(String[] args) {

        ArrayList<String> nameLst = new ArrayList<>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Ayjerenjan");

        System.out.println("nameLst = " + nameLst);

        // find longest name
        // assume the first one is the longest then compare with the rest
        String longestName = nameLst.get(0); // or = "";
        for (int x = 0; x < nameLst.size(); x++) {

            String eachName = nameLst.get(x);
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if (eachName.length() >= longestName.length()) {
                longestName = eachName;
            }

        }
        //System.out.println("longestName = " + longestName);
        for (int i = 0; i < nameLst.size(); i++) {

            if (nameLst.get(i).length() == longestName.length()){
                System.out.println("longestName = " + nameLst.get(i));
            }

        }

        // How do I get the concatenation of all longest words if there are more than one
        // first find out the longest word, and get the character count
        // then loop through each names
        // and check whether character count equal to longest word character count


        // length    : counting the elements inside array, it's a property of array object
        //             last item of an array : arr[ arr.length-1 ]
        // length()  : counting the characters inside String, it's a method of String object
        //             last char of String : str.charAt( str.length-1 )
        // size()    : counting the elements inside ArrayList object, it's a method of list Object
        //             last element of an arrayList : lst.get( last.size()-1 )

        // HOW DO WE USE FOR EACH LOOP TO GO THROUGH EACH ITEMS
        System.out.println("-----------------------");
        for (String currentName : nameLst) {

            System.out.println("currentName = " + currentName);

        }

    }

}
