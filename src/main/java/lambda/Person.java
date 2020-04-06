package lambda;

import java.util.function.Predicate;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    static Predicate<Person> nameFromB = person -> person.name.toUpperCase().startsWith("B");

}
