package POO.Exercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        // Passo 1: Informar modelo e ano
        carro.modeloCarro(scanner);

        // Passo 2: Perguntar se deseja ligar o carro
        carro.desligarLigar(scanner);


        // Verificar se o carro foi ligado (por segurança)
        System.out.println("Digite o estado do carro (ligado/desligado):");
        String estadoCarro = scanner.nextLine();
        carro.setEscolha(estadoCarro);

        // Passo 3: Acelerar
        carro.acelerar(0, "acelerando", "diminuindo", scanner);

        // Passo 4: Mostrar marcha com base na velocidade
        carro.trocarMarcha(0);

        // Passo 5: Direção
        carro.direcaoVirar("", scanner);

        scanner.close();
    }
}

