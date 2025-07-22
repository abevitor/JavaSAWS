package HerancaPolimorfismo.Exercicio1;

public non-sealed class IngressoFamilia extends Ingressos {
    protected int pessoas;


    public int getPessoas(){
        return pessoas;
    }

    public void setPessoas(int pessoas){
        this.pessoas = pessoas;
    }

    public double ingressosPessoas() {
    double precoUnitario = this.getPreco();              // preço de um ingresso
    double precoPessoas = precoUnitario * pessoas;       // total sem desconto
    double precoFinal;                                   // variável para armazenar o valor final

    if (pessoas > 3) {
        double desconto = precoPessoas * 0.05;           // 5% de desconto
        precoFinal = precoPessoas - desconto;            // aplica o desconto
    } else {
        precoFinal = precoPessoas;                       // sem desconto
    }

    return precoFinal;
}

    
}
