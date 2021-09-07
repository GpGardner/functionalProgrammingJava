package Streams;

import Model.Person;

import java.util.List;
import java.util.function.Predicate;

import static Model.Person.Gender.FEMALE;
import static Model.Person.Gender.MALE;


/*
Stream is for iterating over a collection
it is sequential and lives only in your specific thread
* */
public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Steve", MALE),
                new Person("Mark", MALE),
                new Person("Kelly", FEMALE),
                new Person("Sarah", FEMALE)
        );

//        people.stream()
//                .map(Person::getGender)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);


        System.out.println(people.stream()
                .allMatch(personPredicate));

    }

    static Predicate<Person> personPredicate = person -> person.getGender().equals(FEMALE);

}
