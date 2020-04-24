package day15;

public class StringCaseInSensitiveCheck {

    public static void main(String[] args) {

        String name = "Arya Start";

        System.out.println("name.contains(\"st\") RESULT IS : " + name.contains("st"));

        // I wanna check whether this name contains st no matter the case
        // so I want to store the upperCase version of this name then check for ST

        String upperCaseName = name.toUpperCase(); // "ARYA STARK";
        System.out.println("upperCaseName contains ST or not? : " + upperCaseName.contains("ST"));
        //System.out.println(uppercaseName.contains("ST"));

        String lowerCaseName = name.toLowerCase(); // "arya stark";
        System.out.println("lowerCaseName contains st or not? : " + lowerCaseName.contains("st"));

        // This is called method chaining, combining multiple method call
        // make my name all lowerCase (String) then check whether it contains lowerCase st

        // THIS WORK BECAUSE name.toLowerCase() result in another String object
        System.out.println( name.toLowerCase().contains("st") );
        //System.out.println(name.length().toUpperCase ); // BAD IDEA

    }

}
