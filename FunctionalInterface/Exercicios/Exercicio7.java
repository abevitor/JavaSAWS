package FunctionalInterface.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Exercicio7 {
    
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2 ,3 ,4 ,5, 6, 7, 8, 9, 10, 4, 2, 3, 11, 14, 12, 15, 30);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int total = numeros.stream()
               .filter(n -> n % 3 == 0 && n % 5 == 0)
               .reduce(0, somar);

               System.out.println(total);
        
    }
    
}
