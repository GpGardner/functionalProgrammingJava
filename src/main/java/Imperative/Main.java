package Imperative;

import Model.Person;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Steve", Person.Gender.MALE),
                new Person("Mark", Person.Gender.MALE),
                new Person("Kelly", Person.Gender.FEMALE),
                new Person("Sarah", Person.Gender.FEMALE)
        );

        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (person.getGender().equals(Person.Gender.FEMALE)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female.getName());
        }
    }


}
