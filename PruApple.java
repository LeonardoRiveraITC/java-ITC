/*
 https://howtodoinjava.com/java8/java-streams-by-examples/
 https://howtodoinjava.com/java8/stream-map-vs-flatmap/
 Intermediate Operations:
 filter()  map()  flatMap()  distinct()  sorted() peek() limit() skip()
 Terminal Operations
 forEach()  forEachOrdered()  toArray()  reduce()  collect()  min()
 max()  count()  anyMatch()  allMatch()  noneMatch()  findFirst()  findAny()

 List<Integer> list = new ArrayList<Integer>();
 for(int i = 1; i< 10; i++){ list.add(i);  }
 Stream<Integer> stream = list.stream();
 stream.forEach(p -> System.out.println(p));

 Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
 stream.forEach(p -> System.out.println(p));

 Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
 stream.forEach(p -> System.out.println(p));

 MAP
 List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
 List<Integer> listOfIntegers = listOfStrings
 .stream()
 .map(Integer::valueOf)
 .collect(Collectors.toList());
 */
package Chapter1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruApple {

    public static void main(String[] args) {
        List<Apple> liA = Apple.datos();
        List<Apple> liapp1;

        liapp1 = testA(liA, Apple::isGreenApple);// de la clase Apple::
        System.out.println("" + liapp1);

        Predicate<Apple> pr = a -> "brown".equals(a.getColor());
        
        liapp1 = testB(liA, pr); // predicate with Lambda
        
        System.out.println("" + liapp1);

        // Llama a metodo con Stream as parameter (No Generico)
        // Una vez consumido el Stream ya no existe, hay 2 streamI =
        List<Double> listArray = Arrays.asList(-2.0, 10.0, 4.9, 6.0, 8.5);
        System.out.println(" \n"+listArray);
        
        Stream<Double> streamI = listArray.stream(); //call STREAM1 no Generic       
        System.out.println("SUMA 1 =  " + stream1(streamI));
        
        streamI = listArray.stream();     // call STREAM2 Generic  
        System.out.println("Lista >6 =  " + stream2(streamI,8.0));

    }//main

    public static List<Apple> testA(List<Apple> li, Predicate<Apple> pr) 
    {
        List<Apple> lir = new LinkedList<>();  // Antiguamente
        for (Apple app : li) {
            if (pr.test(app)) {
                lir.add(app);
            }
        }//for
        return lir;
    }//testA

    public static List<Apple> testB(List<Apple> li, Predicate<Apple> pr) 
    {
        List<Apple> lir = li   // nueva tecnologia con STREAMS
                .stream()
                .filter(pr)
                .collect(Collectors.toList());
        return lir;
    }//testB

    public static Double stream1(Stream<Double> input) 
    {// Stream as Parameter Parameter No Generic
        double sum = input
                .reduce(0.0, (x, y) -> Math.sin(x) + Math.sin(y) );
        return sum;
    }

    public static <T extends Number> List<T> stream2(Stream<T> input,T val)
    {
        List<T> listT = input       // Generic
                .filter((x -> {
            return x.doubleValue() > val.doubleValue();
        }))
                .collect(Collectors.toList());
        return listT;
    }

}//class

