package ListArray;

public class ExemploListaPessoas {
    private String nome;
    private int ano;

    public ExemploListaPessoas(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return nome + " - Ano: " + ano;
    }
    
}
