package POO.Exercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Operacoes operacao = new Operacoes();
        
        
while (true) {
    System.out.println("\n--- MENU ---");
    System.out.println("1. Consultar saldo");
    System.out.println("2. Consultar cheque especial");
    System.out.println("3. Depositar dinheiro");
    System.out.println("4. Sacar dinheiro");
    System.out.println("5. Pagar boleto");
    System.out.println("6. Verificar uso do cheque especial");
    System.out.println("0. Sair");
    System.out.print("Escolha uma opção: ");

    

    int opcao = scanner.nextInt();
    scanner.nextLine(); // limpar buffer

    switch (opcao) {
        case 1:
            System.out.printf("Saldo atual: R$ %.2f\n", operacao.getSaldo());
            break;

        case 2:
            System.out.printf("Cheque especial disponível: R$ %.2f\n", operacao.getChequeEspecial());
            break;

        case 3:
            System.out.print("Digite o valor para depositar: ");
            double valorDeposito = scanner.nextDouble();
            operacao.depositar(valorDeposito);
            break;

        case 4:
            System.out.print("Digite o valor para sacar: ");
            double valorSaque = scanner.nextDouble();
            operacao.sacar(valorSaque);
            break;

        case 5:
            System.out.print("Digite o valor do boleto: ");
            double valorBoleto = scanner.nextDouble();
            operacao.pagarBoleto(valorBoleto);
            break;

        case 6:
            operacao.verificarUsoChequeEspecial();
            break;

        case 0:
            System.out.println("Encerrando o programa...");
            return;

        default:
            System.out.println("Opção inválida. Tente novamente.");
    }

      scanner.close();
}

   

    }
    
}
