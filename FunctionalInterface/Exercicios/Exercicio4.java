package FunctionalInterface.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercicio4 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2 ,3 ,4 ,5, 6, 7, 8, 9, 10, 4, 2, 3);

        Consumer<Integer> imprimiraNumerosPares = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(imprimiraNumerosPares);
                        
    }
    
}
