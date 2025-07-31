package FunctionalInterface.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio2 {
    public static void main(String[] args) {

         List<Integer> numeros = Arrays.asList(1, 2 ,3 ,4 ,5, 6, 7, 8, 9, 10, 4, 2, 3);

          List<Integer> ordemNatural = numeros.stream()
                                    .sorted()
                                    .collect(Collectors.toList());

                                    System.out.println(ordemNatural);
    }
    
}
