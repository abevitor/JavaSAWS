package POO.Exercicio2Corrijido;


public class Carro {
    private boolean ligado = false;
    private int velocidade = 0;
    private int marcha = 0;

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado && marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Não é possível desligar o carro. Coloque em ponto morto e pare totalmente.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado. Ligue primeiro.");
            return;
        }

        if (!velocidadePermitidaParaMarcha(marcha)) {
            System.out.println("Não é possível acelerar. Verifique a marcha atual.");
            return;
        }

        if (velocidade < 120) {
            velocidade++;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + "km/h");
        } else {
            System.out.println("Velocidade máxima atingida.");
        }
    }

    public void desacelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade > 0) {
            velocidade--;
            System.out.println("Desacelerando... Velocidade atual: " + velocidade + "km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida.");
            return;
        }

        if (!velocidadePermitidaParaMarcha(novaMarcha)) {
            System.out.println("A velocidade atual não permite essa marcha.");
            return;
        }

        marcha = novaMarcha;
        System.out.println("Marcha trocada para: " + marcha);
    }

    public void virar(String direcao) {
        if (!ligado || velocidade < 1 || velocidade > 40) {
            System.out.println("Você só pode virar com o carro ligado e entre 1km/h e 40km/h.");
            return;
        }

        if (direcao.equalsIgnoreCase("esquerda")) {
            System.out.println("Virando para a esquerda...");
        } else if (direcao.equalsIgnoreCase("direita")) {
            System.out.println("Virando para a direita...");
        } else {
            System.out.println("Direção inválida.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado do carro:");
        System.out.println("Ligado: " + ligado);
        System.out.println("Velocidade: " + velocidade + "km/h");
        System.out.println("Marcha: " + marcha);
    }

    private boolean velocidadePermitidaParaMarcha(int marcha) {
        return switch (marcha) {
            case 0 -> velocidade == 0;
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 21 && velocidade <= 40;
            case 3 -> velocidade >= 41 && velocidade <= 60;
            case 4 -> velocidade >= 61 && velocidade <= 80;
            case 5 -> velocidade >= 81 && velocidade <= 100;
            case 6 -> velocidade >= 101 && velocidade <= 120;
            default -> false;
        };
    }
}
