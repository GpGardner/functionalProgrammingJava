package Model;

public class Person {


    private final String name;
    private final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public enum Gender {
        MALE, FEMALE
    }


    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

}
