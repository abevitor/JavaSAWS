package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExampleTR {

    /*Aceita argumento do tipo T e 
     * retorna um resultado tipo R
     * transforma ou mapeia os elementos do
     * Stream para outros valores e tipos
     */


    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 25);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
                                               .map(dobrar)
                                               .collect(Collectors.toList());

                                               numerosDobrados.forEach(System.out::println);

        
    }
    
}
