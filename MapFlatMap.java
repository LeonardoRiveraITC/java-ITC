package Chapter1;

import nada.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMap {

    public static void main(String[] args) {
        List<String> myList = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("List to uppercase  " + myList);

        List<List<String>> list = Arrays.asList(//list of lists
                Arrays.asList("a", "x"),
                Arrays.asList("b", "y"));
        System.out.println("Lista de Listas "+list);

        System.out.println("List of Lists to FlatMap "+list
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
       System.out.println("\n");    
        
        //List to MAP
       Map<String, Book> mapBook = 
          Book.getBooks()
            .stream()
            .collect(
               Collectors.toMap(z -> z.getIsbn(), x -> x)
            );
        System.out.println("Lista to MAP ");
        
       // Map to list        
          mapBook 
                .entrySet()
                .stream()                
                .forEach( 
                        entry1 -> System.out.println(" key: "
                             + entry1.getKey() + " value: "+entry1.getValue())
                );
          
        List<Map.Entry<String, Book>> mapToList = mapBook 
                .entrySet()
                .stream()
                .collect(Collectors.toList());
        System.out.println("\nMap To List  ");
        mapToList 
                .forEach(
                  (x)  -> System.out.println(" "+x.getKey()+ " "+x.getValue()) 
                );
        System.out.println("");
  
             // split a map into 2 List
        List<String> resultSortedKey = new ArrayList<>();
        List<Book> resultValues = 
              mapBook
                .entrySet()
                .stream()
                //sort a Map by key and stored in resultSortedKey
                .sorted(Map.Entry.<String, Book>comparingByKey().reversed())
                .peek(e -> resultSortedKey.add(e.getKey()))
                .map(x -> x.getValue())
                .filter(x -> x.getIsbn().startsWith("03") )
                .collect(Collectors.toList() ) ;
        System.out.println("\nMap into two Lists 1- Sorted");

        resultSortedKey.forEach(System.out::println);
        System.out.println("\nMap into two Lists 2- Filtered 03...");
        resultValues.forEach(System.out::println);
        System.out.println("");
        
        //          List of Lists to FlatMAP
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);           
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);           
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
        List<List<Integer>> listOfListofInts = //List of Lists
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers); 
  
        System.out.println("The Structure before flattening is : " + 
                                                  listOfListofInts); 
        // Using flatMap for transformating and flattening. 
        List<Integer> listofInts  = listOfListofInts.stream() 
                                    .flatMap(listx -> listx.stream()) 
                                    .collect(Collectors.toList()); 
        System.out.println("The Structure after flattening is : " + 
                                            listofInts);      
    }//main

}//class
