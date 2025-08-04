package Facade;

// HomeTheaterFacade.java
public class HomeTheaterFacade {
    private Amplificador amplificador;
    private Projetor projetor;
    private Tela tela;

    public HomeTheaterFacade(Amplificador amp, Projetor proj, Tela tela) {
        this.amplificador = amp;
        this.projetor = proj;
        this.tela = tela;
    }

    public void assistirFilme() {
        System.out.println("Preparando para assistir um filme...");
        tela.descer();
        projetor.ligar();
        amplificador.ligar();
    }

    public void encerrarFilme() {
        System.out.println("Encerrando sessão...");
        amplificador.desligar();
        projetor.desligar();
        tela.subir();
    }
}
