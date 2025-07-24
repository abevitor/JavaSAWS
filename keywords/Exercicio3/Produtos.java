package keywords.Exercicio3;

abstract class Produtos {

abstract class Produto {

        protected double preco;

        public Produto(double preco){
            this.preco = preco;
        }

        public abstract double calcularImposto();

    }

    class Alimentacao extends Produto{
        public Alimentacao(double preco){
            super(preco);
        }

        @Override
        public double calcularImposto(){
            return preco * 0.01;
        }

    class SaudeBemEstar extends Produto {
        public SaudeBemEstar(double preco){
            super(preco);
        }
        @Override
        public double calcularImposto(){
            return preco * 0.015;
        }
    }

    class Vestuario extends Produto {
        public Vestuario(double preco){
            super(preco);

        }

        @Override
        public double calcularImposto(){
            return preco * 0.025;
        }

        class Cultura extends Produto {
            public Cultura(double preco){
                super(preco);
            }

        @Override
        public double calcularImposto(){
            return preco * 0.04;
            

            }
        }
        }
    }


    }
    

