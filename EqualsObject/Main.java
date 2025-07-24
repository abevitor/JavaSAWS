package EqualsObject;

   public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João");
        Pessoa p2 = new Pessoa("João");

        System.out.println(p1 == p2);        // false (referências diferentes)
        System.out.println(p1.equals(p2));   // true (nomes iguais, conteúdo igual)
    }
}

    

