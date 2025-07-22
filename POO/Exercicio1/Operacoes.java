package POO.Exercicio1;
import java.util.Scanner;


public class Operacoes {
    

    private String email;
    private String senha;
    private double chequeEspecial;
    private double saldo;

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void criarConta(Scanner scanner) {
        System.out.println("Digite seu e-mail: ");
        this.email = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        this.senha = scanner.nextLine();

        System.out.println("Digite o valor inicial que deseja depositar:");
        this.saldo = scanner.nextDouble();

        if(saldo<= 500) {
            this.chequeEspecial= 50.0;
            return;
        }
        if(saldo >= 500) {
            this.chequeEspecial = saldo * 0.5;
        }

        scanner.nextLine(); // limpar buffer

    System.out.println("Conta criada com sucesso!");
    System.out.println("Email: " + this.email);
    System.out.printf("Saldo: R$ %.2f\n", this.saldo);
    System.out.printf("Cheque especial disponível: R$ %.2f\n", this.chequeEspecial);

    }
    public void pedirChequeEspecial(Scanner scanner) {


    }

 public void depositar(double valor) {
    if(valor > 0) {
        this.saldo += valor;
        System.out.printf("Depósito de %,2f realizado com sucesso!", valor);
        System.out.printf("Saldo atual: R$ %.2f", this.saldo);
        return;
    }
    if(valor < 0) {
        System.out.println("Valor de depósito inválido.");
        return;
    }
 }

 public void sacar(double valor) {
    double limiteDisponivel = saldo + chequeEspecial;

    if(valor <= 0) {
        System.out.println("Valor inválido.");
        return;
    }

    if(valor <= limiteDisponivel) {
        if(valor > saldo) {
            double usoCheque = valor - saldo;
            double taxa = usoCheque * 0.2;
            saldo = -usoCheque - taxa;

            System.out.printf("Você usou R$ %.2f do cheque especial com taxa de R$ %.2f\n", usoCheque, taxa);
                

        } else {
            saldo -= valor;
        }
        
        System.out.printf("Saque de R$ %.2f realizado!\n", valor);
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    } else {
        System.out.println("Saldo insuficiente incluindo o cheque especial.");
    }

    }

    public void pagarBoleto(double valor) {
    double limiteDisponivel = saldo + chequeEspecial;

    if (valor <= 0) {
        System.out.println("Valor inválido.");
        return;
    }

    if (valor <= limiteDisponivel) {
        if (valor > saldo) {
            double usoCheque = valor - saldo;
            double taxa = usoCheque * 0.2;
            saldo = -usoCheque - taxa;
            System.out.printf("Você usou R$ %.2f do cheque especial com taxa de R$ %.2f\n", usoCheque, taxa);
        } else {
            saldo -= valor;
        }

        System.out.printf("Pagamento de boleto de R$ %.2f realizado!\n", valor);
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    } else {
        System.out.println("Saldo insuficiente para pagar o boleto.");
    }
}
public void verificarUsoChequeEspecial() {
    if (saldo < 0) {
        System.out.println("Você está usando o cheque especial.");
        System.out.printf("Valor usado do cheque especial: R$ %.2f\n", -saldo);
    } else {
        System.out.println("Você não está usando o cheque especial.");
    }
  } 
}





