
package programa1_luisleonardoriveratierrafria_19030342;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Programa1_LuisLeonardoRiveraTierrafria_19030342 {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John", Gender.MALE));
        people.add(new Person("Marisa", Gender.FEMALE));
        people.add(new Person("Alice", Gender.FEMALE));
        people.add(new Person("Sylvie", Gender.FEMALE));
        
        //Imperativo
        ArrayList<Person> females = new ArrayList<>();
        for(Person person:people){
            if(Gender.FEMALE.equals(person.getGender())){
                females.add(person);
            }
        }
        for (Person female : females){
            System.out.println(female);
        }
        //Declarativo
        List<Person> females2 =people.stream().filter(person -> 
                Gender.FEMALE.equals(person.getGender()))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);
        
    }
    
}
