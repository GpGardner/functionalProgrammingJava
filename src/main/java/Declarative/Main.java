package Declarative;

import Model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Steve", Person.Gender.MALE),
                new Person("Mark", Person.Gender.MALE),
                new Person("Kelly", Person.Gender.FEMALE),
                new Person("Sarah", Person.Gender.FEMALE)
        );

        people.stream()
                .filter(person -> person.getGender().equals(Person.Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
