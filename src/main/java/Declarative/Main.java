package Declarative;

import Model.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Steve", Person.Gender.MALE),
                new Person("Mark", Person.Gender.MALE),
                new Person("Kelly", Person.Gender.FEMALE),
                new Person("Sarah", Person.Gender.FEMALE)
        );

        List<Person> femaleList = people.stream()
                .filter(filterByGenderFemale)
                .collect(Collectors.toList());
        femaleList
                .forEach(System.out::println);
    }

    static final Predicate<Person> filterByGenderFemale = person -> person.getGender().equals(Person.Gender.FEMALE);

}
