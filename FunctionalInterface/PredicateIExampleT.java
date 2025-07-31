package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateIExampleT {

    /*Representa uma função que aceita argumento tipo T e retorna
     * valor booleano
     */

    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("Javaz", "kotlin", "python", "javascript");

        Predicate<String> moreThanFiveCharcters = word -> word.length() > 5 - 1;

        words.stream()
             .filter(moreThanFiveCharcters)
             .forEach(System.out::println);
    }
    
}
