package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExampleT {

    /*
     * Representa uma operação que combina dois
     * argumentos tipo T e retorna um resultado
     * do mesmo tipo
     * 
     * Usada para realizar operações de redução
     * em pares de elementos
     * como somar numeros ou combinar objetos
    
     */

     public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
         
        int resultado = numbers.stream()
                            .reduce(0, somar);

                            System.out.println("A soma dos numeros é: " + resultado);
     }
    
}
