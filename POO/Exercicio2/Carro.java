package POO.Exercicio2;
import java.util.Scanner;
import java.util.Random;


public class Carro {

    private String acelerar;
    private String ligar;
    private String desligar;
    private int verificarVelocidade;
    private int trocarMarcha;
    private String direcao;
    private int diminuirVelocidade;
    private String modelo;
    private int ano;
    private String escolha;
    


public String getAcelerar() {
    return acelerar;
  }

public void setAcelerar(String acelerar) {
    this.acelerar = acelerar;
}

public String getEscolha() {
    return escolha;
  }

public void setEscolha(String escolha) {
    this.escolha = escolha;
}

public String getLigar(){
    return ligar;
}

public void setLigar(String ligar){
    this.ligar = ligar;
}

public String getDesligar(){
    return desligar;
}

public void setDesligar(String desligar){
    this.desligar = desligar;
}

public int getVerificarVelocidade() {
    return verificarVelocidade;
}

public void setVerificarVelocidade(int verificarVelocidade){
    this.verificarVelocidade = verificarVelocidade;
}

public int getTrocarMarcha(){
    return trocarMarcha;
}

public void setTrocarMarcha(int trocarMarcha){
    this.trocarMarcha = trocarMarcha;
}

public String getDirecao() {
    return direcao;
}

public void setDirecao(String direcao){
    this.direcao = direcao;
}

public int getDiminuirVelocidade(){
    return diminuirVelocidade;
}

public void setDiminuirVelocidade(int diminuirVelocidade){
    this.diminuirVelocidade = diminuirVelocidade;
}

public String getModelo(){
    return modelo;
}

public void setModelo(String modelo){
    this.modelo = modelo;
}

public int getAno(){
    return ano;
}

public void setAno(int ano){
    this.ano = ano;
}

public void modeloCarro(Scanner scanner){

    System.out.println("Digite o modelo do seu carro: ");
    this.modelo = scanner.nextLine();

    System.out.println("Digite o ano do seu carro:");
    this.ano = scanner.nextInt();

    scanner.nextLine();

}

public void desligarLigar(Scanner scanner){
    this.desligar = "desligado";

    if(this.desligar.equalsIgnoreCase("desligado")){
        System.out.println("Você deseja ligar o carro? (sim/não)");
        this.escolha = scanner.nextLine();

        if(escolha.equalsIgnoreCase("sim")){
            this.ligar = "ligado";
            System.out.println("Ligando o carro!");
        } else {
            this.ligar = "desligado";
            System.out.println("Seu carro continua desligado.");
        }
    }
}


public void acelerar(int verificarVelocidade, String acelerar, String diminuirVelocidade, Scanner scanner){
    Random random = new Random();

    int quantidade = random.nextInt(10) + 1;
    this.verificarVelocidade = random.nextInt(121);

    if (this.ligar != null && this.ligar.equalsIgnoreCase("ligado")) {
        System.out.println("Deseja acelerar?");
        String escolha = scanner.nextLine();

        if (escolha.equalsIgnoreCase("sim")) {
            this.acelerar = "acelerando...";

            for (int i = 0; i < quantidade; i++) {
                System.out.println(this.acelerar);
            }

            System.out.println("Deseja saber a velocidade?");
            var yesNo = scanner.nextLine();

            if (yesNo.equalsIgnoreCase("sim")) {
                System.out.println("Velocidade atual: " + this.verificarVelocidade + " km/h");
                System.out.println("Deseja diminuir a velocidade?");
                var r = scanner.nextLine();

                if (r.equalsIgnoreCase("sim")) {
                    String diminuindo = "diminuindo";

                    for (int i = 0; i < quantidade; i++) {
                        System.out.println(diminuindo);
                    }

                    // Simula redução de velocidade
                    this.verificarVelocidade -= random.nextInt(quantidade * 3);
                    if (this.verificarVelocidade < 0) this.verificarVelocidade = 0;

                    System.out.println("Velocidade final: " + this.verificarVelocidade + " km/h");
                    return;
                }
            }

            System.out.println("Velocidade atual: " + this.verificarVelocidade + " km/h");
            System.out.println("Dirija com cuidado!");
        } else {
            System.out.println("Você optou por não acelerar.");
        }
    } else {
        System.out.println("O carro está desligado. Ligue o carro para acelerar.");
    }
}


public void trocarMarcha(int trocarMarcha){

    if(this.verificarVelocidade > 0 && this.verificarVelocidade<= 20){
        System.out.println("O carro esta na primeira marcha!");
         return;
    }

     if(this.verificarVelocidade >= 21 && this.verificarVelocidade<= 40){
        System.out.println("O carro esta na segunda marcha!");
         return;
    }

     if(this.verificarVelocidade >=41 && this.verificarVelocidade<= 60){
        System.out.println("O carro esta na terceira marcha!");
         return;
    }

     if(this.verificarVelocidade >= 61 && this.verificarVelocidade<= 80){
        System.out.println("O carro esta na quarta marcha!");
         return;
    }
     if(this.verificarVelocidade >= 81 && this.verificarVelocidade<= 100){
        System.out.println("O carro esta na quinta marcha!");
         return;
    }

       if(this.verificarVelocidade >= 101 && this.verificarVelocidade<= 120){
        System.out.println("O carro esta na sexta marcha!");
         return;
    }
}

public void direcaoVirar(String direcao, Scanner scanner) {
    while (true) {
        System.out.println("Virar a direita?");
        System.out.println("Virar a esquerda?");

        String opcao = scanner.nextLine();

        if (opcao.equalsIgnoreCase("Direita")) {
            System.out.println("Virando para a direita...");
        } else if (opcao.equalsIgnoreCase("Esquerda")) {
            System.out.println("Virando para a esquerda...");
        } else {
            System.out.println("Seguindo em frente...");
            return; // só sai quando for diferente de "Direita" ou "Esquerda"
        }
    }
}



}