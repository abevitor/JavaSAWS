package EqualsObject;

    public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Sobrescrevendo o método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // mesma referência
        if (obj == null || getClass() != obj.getClass()) return false;

        Pessoa pessoa = (Pessoa) obj;
        return nome != null && nome.equals(pessoa.getNome());
    }

    @Override
    public String toString() {
        return nome;
    }
}
    

