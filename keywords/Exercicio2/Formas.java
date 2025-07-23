package keywords.Exercicio2;

public interface Formas {
    double calcularArea();

    class Quadrado implements Formas {
        private double lado;

        public Quadrado(double lado){
            this.lado = lado;
        }

        @Override
        public double calcularArea(){
            return lado * lado;
        }

    }

    class Retangulo implements Formas {
        private double base;
        private double altura;

        public Retangulo(double base, double altura){
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea(){
            return base * altura;
        }
    }

    class Circular implements Formas {
        private double raio;

        public Circular(double raio){
            this.raio = raio;
        }

        @Override
        public double calcularArea(){
            return Math.PI * raio * raio;
        }

    }
    
}
