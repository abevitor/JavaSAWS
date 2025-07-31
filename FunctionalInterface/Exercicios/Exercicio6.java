package FunctionalInterface.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercicio6 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2 ,3 ,4 ,5, 6, 7, 8, 9, 10, 4, 2, 3, 11, 14, 12);

        Predicate<Integer> maior = numero -> numero > 10;

        numeros.stream()
               .filter(maior)
               .sorted()
               .forEach(System.out::println);
                                   


    }
    
}
