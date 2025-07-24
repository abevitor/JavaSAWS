package ListArray;

import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        // Criando um Vector de Strings
        Vector<String> nomes = new Vector<>();

        // Adicionando elementos
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        // Inserindo elemento na posição 1
        nomes.add(1, "Beatriz");

        // Removendo elemento
        nomes.remove("Carlos");

        // Acessando elementos
        System.out.println("Primeiro nome: " + nomes.get(0));

        // Tamanho do vetor
        System.out.println("Tamanho do Vector: " + nomes.size());

        // Iterando com for-each
        System.out.println("Todos os nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

