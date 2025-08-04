package Strategy;

public class Main {

    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        ComportamentoCorrer correr = new ComportamentoCorrer();

        Robo robo = new Robo();

        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(correr);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();


    }
    
}
