package FunctionalInterface.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercicio9 {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2 ,3 ,4 ,5, 6, 7, 8, 9, 10, 4, 2, 3, 11, 14, 12, 15, 30);

        Optional<Integer> segundoMaior = numeros.stream()
                                                .distinct()
                                                .sorted((a,b) -> b - a)
                                                .skip(1)
                                                .findFirst();

        System.out.println("Segundo maior número: " + segundoMaior.get());
 

    }
    
}
