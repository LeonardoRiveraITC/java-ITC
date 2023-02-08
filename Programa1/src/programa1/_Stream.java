
package programa1;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class _Stream {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John", Gender.MALE));
        people.add(new Person("Marisa", Gender.FEMALE));
        people.add(new Person("Alice", Gender.FEMALE));
        people.add(new Person("Sylvie", Gender.FEMALE));
        people.add(new Person("Cirno", Gender.PREFER_NOT_TO_SAY));
//        people.stream().map(person -> person.name)
//                .collect(Collectors.toSet()).forEach(
//                (System.out::println));
       boolean containsOnlyFemales = people.stream().anyMatch(person -> Gender.FEMALE.equals(person.gender));
       
    }
public static class Person {
    private final String name;
    private final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + '}';
    }
    
}

enum Gender{
    MALE,FEMALE, PREFER_NOT_TO_SAY
}
    
}
