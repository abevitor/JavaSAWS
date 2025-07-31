package FunctionalInterface.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercicio3 {

    public static void main(String[] args) {
         List<Integer> numeros = Arrays.asList(-2, -3, 1, 2 ,3 ,4 ,5, 6, 7, 8, 9, 10, 4, 2, 3, -10, -20, -40);

         Predicate<Integer> naoNegativo = numero -> numero >= 0;

         numeros.stream()
                .filter(naoNegativo)
                .forEach(System.out::println);


    }
    
}
