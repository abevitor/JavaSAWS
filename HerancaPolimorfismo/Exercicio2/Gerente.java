package HerancaPolimorfismo.Exercicio2;
import java.util.Random;
import java.util.Scanner;

public non-sealed class Gerente extends Empregados {

    protected boolean adm = true;
    Random random = new Random();


    public void gerarRelatorio(Scanner scanner){
        System.out.println("Deseja gerar um relátorio financeiro?");
        String resposta = scanner.next();
        int vendas = random.nextInt(20);
        double lucro = 400 * vendas;

        if(resposta.equalsIgnoreCase("sim")){
            System.out.println("=======RELATÓRIO FINANCEIRO=======");
            System.out.println("Vendas efetuadas: " + vendas);
            System.out.println("Lucro: " + lucro);
            System.out.println("==================================");
            
            return;
        }

        if(resposta.equalsIgnoreCase("nao")){

            System.out.println("Fechando programa...");

        }

    }

    public void consultarVendas(Scanner scanner){

        System.out.println("Deseja consultar as vendas?");
        String consulta = scanner.next();

        int vendasTotais = random.nextInt(100);

        if(consulta.equalsIgnoreCase("sim")){
            System.out.println("foram efetuadas: " + vendasTotais);

            return;
        }

        if(consulta.equalsIgnoreCase("nao")){
            System.out.println("Fechando o programa...");

            return;
        }

    }

    public void realizarLogin(Scanner scanner){
         
        scanner.nextLine();
        System.out.println("Deseja fazer login?");
        String loginProjeto = scanner.nextLine();

         if(loginProjeto.equalsIgnoreCase("sim") && adm == false){
            System.out.println("Digite seu login:");
            String loginsson = scanner.nextLine();
            setEmail(loginsson);

            System.out.println("Digite sua senha:");
            String senhazita = scanner.nextLine();
            setSenha(senhazita);

            System.out.println("Bem vindo!");

            while(true){
                System.out.println("1-Gerar relatorios");
                System.out.println("2-Conferir vendas");
                System.out.println("3-Alterar dados");
                System.out.println("4-Alterar senha");
                System.out.println("5-Sair");

                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                case 1:
                    gerarRelatorio(scanner); 
                    break;

                case 2:
                    consultarVendas(scanner); 
                    break;

                case 3:
                    alterarDados(scanner);
                    break;

                case 4:
                     alterarSenha(scanner);
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
            setIdade(idade);

            scanner.nextLine();
            System.out.println("Digite seu endereço: ");
            var endereco = scanner.nextLine();
            setEndereco(endereco);

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
