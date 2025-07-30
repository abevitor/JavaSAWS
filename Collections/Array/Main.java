package Collections.Array;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> alunos = new Hashtable<>();

        // put(K, V): adiciona chave-valor
        alunos.put(101, "Alice");
        alunos.put(102, "Bruno");
        alunos.put(103, "Carla");

        // get(K): obtém valor pela chave
        System.out.println("Aluno 102: " + alunos.get(102));

        // containsKey e containsValue
        System.out.println("Contém chave 101? " + alunos.containsKey(101));
        System.out.println("Contém valor 'Carla'? " + alunos.containsValue("Carla"));

        // remove(K): remove pelo ID
        alunos.remove(101);

        // Iterando pelos pares
        System.out.println("\nTodos os alunos:");
        for (Integer id : alunos.keySet()) {
            System.out.println("ID: " + id + " -> " + alunos.get(id));
        }
    }
}
