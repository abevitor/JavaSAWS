package ListArray;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        List<ExemploListaPessoas> pessoas = new ArrayList<>();

        // Adicionando pessoas com nome e ano
        pessoas.add(new ExemploListaPessoas("João", 1990));
        pessoas.add(new ExemploListaPessoas("Maria", 1985));
        pessoas.add(new ExemploListaPessoas("Lucas", 2000));

        for (ExemploListaPessoas p : pessoas) {
            System.out.println(p);
        }
    }
    
}
