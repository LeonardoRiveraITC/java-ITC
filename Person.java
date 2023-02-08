package Chapter1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Integer age; private String name;  private String Birthday;
    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;

    }
    public Person(Integer age, String name, String Birthday) {
        this.age = age;
        this.name = name;
        this.Birthday = Birthday;
    }
    public Person(Integer age) {
        this.setAge(age);
    }
    public String getName() {
        return name;
    }
    public String getBirthday() {
        return Birthday;
    }
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }
    public void setName(String name) {
        this.name = name;
    }  
    public Integer getAge() {
        return age;
    }
    private void setAge(Integer age) {
        this.age = age;
    }
    public static int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }    
    public static List<Person> createRoster1() {
        List<Person> roster1 = new ArrayList<>();
        roster1.add(new Person(20, "Juan" ,  "23 nov 2015"));       
        roster1.add(new Person(24, "Luis" ,  "12 dic 1987"));       
        roster1.add(new Person(35, "Ana"  ,  "2  may 2012"));
        roster1.add(new Person(37, "Mike" ,  "25 jul 2018"));
        roster1.add(new Person(23, "Lucy" ,  "21 jun 2016"));
        roster1.add(new Person(18, "Jorge",  "26 nov 2017"));
        roster1.add(new Person(33, "Jesus",  "28 feb 2010"));
        roster1.add(new Person(3 , "Luis" ,  "14 dic 1983"));
        roster1.add(new Person(19, "Juan"  , "16 ene 1988"));
        return roster1;
    }
    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" 
                + name + ", Birthday=" + Birthday + '}';
    }   
}

/*
public static List<Person> createRoster() {
        List<Person> roster = new ArrayList<>();
        roster.add(new Person(20));
        roster.add(new Person(24));
        roster.add(new Person(35));
        roster.add(new Person(20));
        return roster;
    }
*/