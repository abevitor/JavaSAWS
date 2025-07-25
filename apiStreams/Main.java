package apiStreams;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> values1 = List.of(3,6, 9, 11);
        List<Integer> values2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       var newValues = values2.stream()
                    .filter(v -> values1.contains(v))
                    .peek(n -> System.out.printf("Filter %s \n ", n))
                    .map(n -> values1.stream().reduce(n, (n1, n2) -> n1 -n2))
                    .peek(n -> System.out.printf("Filter %s \n ", n))
                    .collect(Collectors.toSet());

                    System.out.println(newValues);

                    System.out.println("============================");






        //List<String> debugValues = new ArrayList<>();
       // var value3 = Stream.of(1, 2, 3, 4, 5, 6, 7)
                    //.map(n -> n % 2 == 0)
                    //.toList();
        
                //.distinct().toList();
                //.average();

                //.peek(System.out::println)
                //.peek(debugValues::add)
                //.parallel()
                //.reduce("",(a, b) -> a + b +  ";").replaceFirst(";", " ");
                //.limit(2)
                // .filter(name -> name.endsWith("a"))
                //.peek(debugValues::add)
                //.findAny();
                //.findFirst();
                //.allMatch(n -> n.contains("r"));
                //.noneMatch(n -> n.contains("y"));
                //.anyMatch(n -> n.contains("a"));

                //System.out.println(value3);
                //System.out.println(debugValues);

                System.out.println("=============================");

               
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        var value1 = Stream.generate(() -> new Random().nextInt())
                     .limit(5)
                     .toArray(Integer[]:: new);


                     for(var v: value1){
                        System.out.println(v);
                     }

                     System.out.println("=============================");

                     var value2 = IntStream.generate(() -> new Random().nextInt())
                                .limit(5)
                                .toArray();

                                for(var v: value2){
                        System.out.println(v);
                     }
        
    }
    
}
