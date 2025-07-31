package FunctionalInterface.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercicio10 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 2, 3, 11, 14, 12, 15, 30, 13, 17, 19);

        Optional<Integer> resultado = numeros.stream()
            .filter(n -> {
                if (n <= 1) return false;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) return false;
                }
                return true;
            })
            .max(Integer::compare);

        resultado.ifPresentOrElse(
            r -> System.out.println("Maior número primo da lista: " + r),
            () -> System.out.println("Nenhum número primo encontrado.")
        );
    }
}
