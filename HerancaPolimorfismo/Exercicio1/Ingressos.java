package HerancaPolimorfismo.Exercicio1;

public sealed abstract class Ingressos permits IngressoFamilia, IngressoMeia, IngressoInteira{
    protected String filme;
    protected String dublado;
    protected double preco;


    public Ingressos() {
        this.preco = 40.0; 
    }

  

    public String getFilme(){
        return filme;
    }

    public String getDublado(){
        return dublado;
    }

    public double getPreco(){
        return preco;
    }

    public void setFilme(String filme){
        this.filme = filme;
    }

    public void setDublado(String dublado){
        this.dublado = dublado;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
 

    
}
