package day41;

public class Person {

    // private make it only accessible within the same class
    private String name;
    private int age;
    private long ssn;

    // What if I want to get only the name
    public String getName(){
        return name;
    }

    // What if I want to change only the name
    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public long getSsn(){
        return ssn;
    }

    public void setSsn(int newSsn){
        ssn = newSsn;
    }

// write a method to give value to the field

    public void setAll(String newName, int newAge, long newSsn){
        // YOU CAN PUT WHATEVER CHECK TO MAKE SURE
        // THE DATA IS CORRECT or any other logic
        name = newName;
        age = newAge;
        ssn = newSsn;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}