package FunctionalInterface.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercicio8 {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2 ,3 ,4 ,5, 6, 7, 8, 9, 10, 4, 2, 3, 11, 14, 12, 15, 30);

        Consumer<Integer> imprimirNumerosPares = numeroPar -> {
            if(numeroPar % 2 == 0){
                System.out.println(numeroPar);
                
            }
        };

        Consumer<Integer> imprimirNumerosImpares = numeroImpar -> {
            if(numeroImpar % 2 == 1){
                System.out.println(numeroImpar);
            }
        };

        System.out.println("numeros pares:");
        numeros.stream()
               .sorted()
               .forEach(imprimirNumerosPares);


               System.out.println("==================================");


               System.out.println("numeros impares:");
               numeros.stream()
                      .sorted()
                      .forEach(imprimirNumerosImpares);


    }
    
}
