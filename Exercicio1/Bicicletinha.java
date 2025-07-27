package Exercicio1;

public class Bicicletinha {

    private String modelo;
    private Integer bateria;
    private String nivelStr;


    public Integer getBateria() {
        return bateria;
    }

    public void setBateria(Integer bateria) {
        this.bateria = bateria;
    }

    public String getNivelStr() {
        return nivelStr;
    }

    public void setNivelStr(String nivelStr) {
        this.nivelStr = nivelStr;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double calcularDistancia() {
        if (getBateria() == null) {
            return 0.0;
        }
        return getBateria() / 2.0;
    }

    public String obterMensagem(){

        return String.format("%s: Distancia estimada = %.1f km", modelo, calcularDistancia());
    }

    

    
}
