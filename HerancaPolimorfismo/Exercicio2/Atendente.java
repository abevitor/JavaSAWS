package HerancaPolimorfismo.Exercicio2;
import java.util.Scanner;
import java.util.Random;

public non-sealed class Atendente extends Empregados {
    protected double caixa = 100;
    protected boolean adm = false;
    protected String fecha;

    Random random = new Random();
   

   
    public String getFecha(){
        return fecha;

    }

    public double getCaixa(){
        return caixa;
    }

    public void setCaixa(double caixa){
        this.caixa = caixa;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

 

    public void receberPagamento(){
        int receba = random.nextInt(150);
        double valorInicial = caixa;
        setCaixa(receba);
        System.out.println("Valor do caixa antes do pagamento: R$ " + valorInicial);
        System.out.println("Recebendo pagamento de: " + receba + " R$");

        caixa =+ receba;

        System.out.println("Valor do caixa após o pagamento: R$ " + caixa);


    }

    public void fecharCaixa(Scanner scanner){
        System.out.println("Deseja fechar o caixa?");
        var fecha = scanner.next();
        setFecha(fecha);

        if(fecha.equalsIgnoreCase("sim")){
            System.out.println("Fechando caixa...");
            return;
        }

        if(fecha.equalsIgnoreCase("nao")){
            System.out.println("Mantendo caixa aberto...");
            return;
        }
    }

    public void realizarLogin(Scanner scanner){

        System.out.println("Deseja fazer login?");
        String loginProjeto = scanner.nextLine();

         if(loginProjeto.equalsIgnoreCase("sim") && adm == true){
            System.out.println("Digite seu login:");
            String loginsson = scanner.nextLine();
            setEmail(loginsson);

            System.out.println("Digite sua senha:");
            String senhazita = scanner.nextLine();
            setSenha(senhazita);

            System.out.println("Bem vindo!");

            while(true){
                System.out.println("1-Receber pagamento");
                System.out.println("2-Alterar dados");
                System.out.println("3-Alterar senha");
                System.out.println("4-Fechar caixa");
                System.out.println("5-Sair");

                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {

                case 1:
                     receberPagamento();
                    
                    break;

                case 2:
                    alterarDados(scanner);
                    break;

                case 3:
                     alterarSenha(scanner);
                     break;

                case 4:
                     fecharCaixa(scanner);
                     break;
        
                case 5:
                     System.out.println("Saindo do sistema...");
                     return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    if (loginProjeto.equalsIgnoreCase("nao")) {
        System.out.println("Fechando o programa...");
        return;
    }

}

    public void alterarDados(Scanner scanner){

        System.out.println("Deseja alterar seus dados?"); 
        var variaveis = scanner.next();

        if(variaveis.equalsIgnoreCase("sim")){
            System.out.println("digite seu nome:");
            var nome = scanner.nextLine();
            setNome(nome);

            scanner.nextLine();
            System.out.println("digite seu Email:");
            var email = scanner.nextLine();
            setEmail(email);

            scanner.nextLine();
            System.out.println("Digite sua idade:");
            var idade = scanner.nextInt();

            scanner.nextLine();
            System.out.println("Digite seu endereço: ");
            var endereco = scanner.nextLine();

            System.out.println("==========DADOS ATUALIZADOS==========");
            System.out.println("nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("idade: " + idade);
            System.out.println("endereço: " + endereco);
            System.out.println("=====================================");

            return;

        }

        if(variaveis.equalsIgnoreCase("nao")){
            System.out.println("Fechando o sistema...");

            return;
            
        }


    }

    public void alterarSenha(Scanner scanner){
        System.out.println("Deseja alterar a senha?");
        var alterar = scanner.next();

        if(alterar.equalsIgnoreCase("sim")){

            System.out.println("Digite sua nova senha:");
            var novaSenha = scanner.nextLine();
            setSenha(senha);

            System.out.println("Sua nova senha é : " + novaSenha);

            return;
        }

        if(alterar.equalsIgnoreCase("nao")){

            System.out.println("Fechando o sistema...");
            return;
            
        }



    }
    
    
}
