package FunctionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleT {

    /*Aceita um argumento tipo T e não retorna nada
     * Utilizada para realizar ações ou efeitos
     * colaterais nos elementos do Stream
     */

    public static void main(String[] args) {
        
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 6, 8);

        Consumer<Integer> imprimirNumeroImpar = numero -> {
            if(numero % 2 == 1) {
                System.out.println(numero);
            }
        };

        num.stream().forEach(imprimirNumeroImpar);
    }
    
}
