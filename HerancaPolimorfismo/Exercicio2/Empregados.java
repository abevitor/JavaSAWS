package HerancaPolimorfismo.Exercicio2;

public sealed abstract class Empregados permits Vendedor, Atendente, Gerente{

    protected String nome;
    protected String email;
    protected String senha;
    protected String endereco;
    protected int idade;

    
    public String getEndereco(){
        return endereco;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    
}
