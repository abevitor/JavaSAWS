package HerancaPolimorfismo.Exercicio1;

public non-sealed class IngressoMeia extends Ingressos {

    public void ingressoMeiaBill(Ingressos ingresso) {
    double precoAtual = ingresso.getPreco();
           ingresso.setPreco(precoAtual / 2);
           
    }
}


