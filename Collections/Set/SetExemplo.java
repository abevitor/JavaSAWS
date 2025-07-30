package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetExemplo {
    public static void main(String[] args) {
        // Criando o Set (HashSet)
        Set<String> frutas = new HashSet<>();

        // add(E e): adicionando frutas
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Abacaxi");
        frutas.add("Laranja");

        // Tentando adicionar fruta repetida (não será adicionada)
        boolean adicionou = frutas.add("Maçã");
        System.out.println("Tentou adicionar Maçã novamente? " + adicionou); // false

        // size(): tamanho do conjunto
        System.out.println("Total de frutas: " + frutas.size());

        // contains(Object o): verifica se existe
        System.out.println("Contém Banana? " + frutas.contains("Banana"));
        System.out.println("Contém Uva? " + frutas.contains("Uva"));

        // iterator(): percorrendo os elementos
        System.out.println("\nFrutas no conjunto:");
        Iterator<String> iterator = frutas.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // remove(Object o): removendo elemento
        frutas.remove("Abacaxi");
        System.out.println("\nDepois de remover Abacaxi:");
        System.out.println(frutas);

        // isEmpty(): verifica se está vazio
        System.out.println("Está vazio? " + frutas.isEmpty());

        // clear(): limpando tudo
        frutas.clear();
        System.out.println("Depois do clear, está vazio? " + frutas.isEmpty());
    }
}

