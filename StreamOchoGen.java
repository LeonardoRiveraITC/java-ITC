package Chapter1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamOchoGen {

    public static void main(String[] args) throws IOException {

        System.out.println("                 1- Empty Stream\n");
        Stream<String> stream = Stream
                .empty();
        stream
                .forEach(x -> {
            System.out.printf(" %d ", x); });
      
        System.out.println("        2- From Arrays to Collections to Stream");
//        System.out.println("                 LIST");
        List<String> list = Arrays
                .asList(
                        "JAVA", "J2EE", "Spring", "Hibernate", "JAVA");
        Stream<String> stream3 = list
                .stream();//         Lazy
        stream3
                .filter(z -> z.startsWith("J"))
                .forEach(x -> {System.out.printf(" %s ", x); } );  // Eager
        System.out.println("");

//
        System.out.println("\n        List to SET to Stream");

        Set<String> set = new TreeSet<>(list);   //LIST    
        Stream<String> stream4 = set
                .stream();
        stream4
                .filter(x -> x.startsWith("J"))
                .forEach(x -> System.out.print(" J's "
                                + x.toLowerCase()));
        System.out.println("");
//                                    // 3 From Arrays
        System.out.println(" \n           3- From Stream .of ()");
        Stream<String> streamOf = Stream
                .of("a", "b", "c");
        streamOf
                .map(x -> x.toUpperCase())
                .forEach(x -> {
                    System.out.printf("  %s ", x);
                });
        System.out.println("");
        System.out.println("\nStream from Array of String");
        String[] arr
                = new String[]{"Ana", "Lupe", "Maria", "Liz", "Paty", "Jose"};

        Stream<String> streamOfArrayFull
                = Arrays
                .stream(arr);
        streamOfArrayFull
                .map(x -> x.toUpperCase())
                .forEach(x -> {
                    System.out.printf("  %s ", x);
                });
        System.out.println("");

//        //  ONLY A PART
        System.out.println(" \n           Stream from array 2-4 Exclusive");
        Stream<String> streamOfArrayPart
                = Arrays
                .stream(arr, 2, 4);
        streamOfArrayPart
                .forEach(x -> {
                    System.out.printf("  %s ", x);
                });
        System.out.println("");

        System.out.println("\n Array Integer to Stream Integer to Stream");
        Integer[] intArr = {3, 5, 6, 7, 2, 1, 2, 3, 7, 8};
        Stream<Integer> arrToStream
                = Arrays.stream(intArr);
        arrToStream
                .forEach(s -> System.out.print(" " + (2*s)));
        System.out.println("");

        System.out.println(" \n           4- From Stream Builder");
        Stream<Person> streamBuilder
                = Stream
                .<Person>builder()
                .add(new Person(23, "Juan", "25 sep 2020"))
                .add(new Person(34, "Liz", "23 nov 2015"))
                .build();
        streamBuilder
                .forEach(x -> {
                    System.out.printf("%d %5s %5s \n", x.getAge(), x.getName(), x.getBirthday());
                }
                );

////5 Stream Generate
        System.out.println("  \n          5- From Stream Generate");
        Stream<String> streamGenerated
                = Stream
                .generate(() -> "Mike")
                .limit(5);
        streamGenerated.forEach(s -> System.out.print(" " + s.toUpperCase()));

        System.out.println("\n \n           From Developer");
        Developer busy = new Developer("pragmatic");
        busy.add("java");
        busy.add("javascript");
        busy.add("scala");
//             
        Stream<Developer> develop
                = Stream
                .generate(() -> busy)
                .limit(3);
        develop.forEach(s -> {System.out.print(" "+s+"\n"); } );
        System.out.println("");
//
// 6 Iterate
        System.out.println(" \n           6- From Iterate");
        Stream<Integer> streamIterated = Stream
                .iterate(1, n -> n * 2)
                .limit(5);
        streamIterated
                .forEach(s -> System.out.print(" " + s));
        System.out.println("");
        
        System.out.println("        From Iterate Persons ");
        Stream<Person> streamI = Stream
          .iterate(new Person(23, "Juan", "25 sep 2020"),
                     n -> new Person(n.getAge() + 5, n.getName() 
                             , n.getBirthday() )
                )
                .limit(3);
        streamI
         .forEach(s -> {System.out.printf(" %s %d  "
                 ,s.getName(),s.getAge() );});

        //7 Stream from File
        System.out.println("  \n   \n            7- From File");

        Path path = Paths.get("file.txt");

        Stream<String> streamOfStrings // STREAM
                = Files.lines(path);
        System.out.println("  \n      Stream from FILES");
        streamOfStrings
                .filter(x -> !x.isEmpty())
                .forEach(s -> System.out.print("  "+ s+" -> "));

        System.out.println(" \n \n        streamWithCharset      ");
        Stream<String> streamWithCharset = Files
                .lines(path, Charset
                        .forName("UTF-8"));
        System.out.println("        Stream Of Strings ");
        streamWithCharset
                .forEach(s -> System.out.print("  "+ s+" -> "));

        streamOfStrings
                .close();
        streamWithCharset
                .close();

        System.out.println(" \n \n              8- From Stream of Primitives");

        IntStream intStream = IntStream // .rangeClosed(1, 5)
                .range(1, 10);

        intStream.forEach(x -> {
            System.out.printf(" %d ", x);
        }
        );
        System.out.println("");

        System.out.println("\n            Long Stream RangeClosed");
        LongStream longStream = LongStream.rangeClosed(1, 5);
        longStream.forEach(x -> {
            System.out.printf(" %d ", x);
        });
        System.out.println("");

        System.out.println("\n              Random");

        Random random = new Random();
        DoubleStream doubleStream = random
                .doubles(10);
        doubleStream.forEach(x -> {
            System.out.printf(" %6.3f ", x);
        });
        System.out.println("");

    }// main
}//class

/*
    //1     
    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty()
                : list
                        .stream();
    }//   streamOf
    
       //2     
    public static <T> Stream streamOfGen(List<T> list) {
        return list == null || list.isEmpty() ? Stream.empty()
                : list
                      .stream();
    }//  streamOfGen
*/
