package com.xywei.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person("zhangsan", 20);
        Person p2 = new Person("lisi", 30);
        Person p3 = new Person("wangwu", 40);

        List<Person> personList = Arrays.asList(p1, p2, p3);

        PersonTest test = new PersonTest();
//        List<Person> persons = test.getPersonByAge(30, personList);
//        persons.forEach(System.out::println);
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (Integer age, List<Person> persons) -> {
            return persons.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
        };

        test.getPersonByAge2(20, personList, biFunction).stream()
                .forEach(person -> System.out.println(person.getAge()));
    }


    public List<Person> getPersonByUsername(String username, List<Person> personList) {
        List<Person> persons = personList.stream().filter(person -> username.equals(person.getUsername()))
                .collect(Collectors.toList());
        return persons;
    }

    public List<Person> getPersonByAge(int age, List<Person> persons) {

        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) ->
                personList.stream()
                        .filter(person -> person.getAge() > 30)
                        .collect(Collectors.toList());

        return biFunction.apply(age, persons);
    }

    public List<Person> getPersonByAge2(int age, List<Person> persons, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, persons);
    }
}
