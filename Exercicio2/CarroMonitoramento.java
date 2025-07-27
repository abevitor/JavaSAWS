package Exercicio2;

import java.util.Scanner;


public class CarroMonitoramento {
    
    public static String estaApto(int anoFabricacao, int anoAtual) {
    int idade = anoAtual - anoFabricacao;
    if (idade < 10) {
        return "O carro não está apto!";
    } else {
        return "O carro está apto!";
    }

        

}
     public static void main(String[] args) {
        // Criando o scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.println("Digite o ano da fabricação: ");
        int anoFabricacao = scanner.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();


        System.out.println(estaApto(anoFabricacao, anoAtual));
    
        scanner.close();
    }
    
}
