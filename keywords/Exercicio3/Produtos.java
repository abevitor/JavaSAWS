package keywords.Exercicio3;

// Classe abstrata base
abstract class Produto {
    protected double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public abstract double calcularImposto();
}

// Subclasse Alimentação
class Alimentacao extends Produto {
    public Alimentacao(double preco) {
        super(preco);
    }

    @Override
    public double calcularImposto() {
        return preco * 0.01;
    }
}

// Subclasse Saúde e Bem-estar
class SaudeBemEstar extends Produto {
    public SaudeBemEstar(double preco) {
        super(preco);
    }

    @Override
    public double calcularImposto() {
        return preco * 0.015;
    }
}

// Subclasse Vestuário
class Vestuario extends Produto {
    public Vestuario(double preco) {
        super(preco);
    }

    @Override
    public double calcularImposto() {
        return preco * 0.025;
    }
}

// Subclasse Cultura
class Cultura extends Produto {
    public Cultura(double preco) {
        super(preco);
    }

    @Override
    public double calcularImposto() {
        return preco * 0.04;
    }
}
