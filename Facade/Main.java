package Facade;

// Main.java
public class Main {
    public static void main(String[] args) {
        Amplificador amp = new Amplificador();
        Projetor proj = new Projetor();
        Tela tela = new Tela();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, proj, tela);

        homeTheater.assistirFilme();
        System.out.println("\n---\n");
        homeTheater.encerrarFilme();
    }
}

