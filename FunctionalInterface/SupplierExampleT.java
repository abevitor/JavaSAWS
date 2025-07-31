package FunctionalInterface;

import java.util.List;

import java.util.stream.Stream;

public class SupplierExampleT {
    /*
     * Não aceita nenhum argumento e 
     * retorna um resultado tipo T
     * Usada para criar ou fornecer novos objetos
     * de um determinado tipo
     */

    public static void main(String[] args) {
        

    List<String> listaBoasVindas = Stream.generate(() -> "Olá, seja bem vindo(a)")
                                         .limit(10)
                                         .toList();

    listaBoasVindas.forEach(System.out::println);
    }
    
}
