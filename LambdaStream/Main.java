package LambdaStream;

import java.util.Arrays;
import java.util.List;

/*Lambda: em Java serve para representar funções anônimas — ou seja, funções sem nome,
 que podem ser passadas como argumento para métodos, armazenadas em variáveis, etc. */

 /*A chamada nomes.stream() converte uma lista (ou outro tipo de coleção) em um Stream
 — que é uma sequência de elementos que podem ser processados de forma funcional, ou seja, com operações como:
filter (filtrar)
map (transformar)
sorted (ordenar)
forEach (percorrer e executar algo)
collect (coletar de volta como lista, conjunto, etc.) */

public class Main {
     public static void main(String[] args) {
        // Lista de nomes
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos", "Amanda", "Beatriz");

        // Usando lambda para filtrar nomes que começam com "A"
        nomes.stream() // Transforma a lista em um Stream (fluxo de dados)
             .filter(nome -> nome.startsWith("A")) // Lambda: testa se o nome começa com "A"
             .forEach(nome -> System.out.println("Nome com A: " + nome)); // Lambda para imprimir o nome
    }
    
}
