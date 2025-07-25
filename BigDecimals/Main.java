import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        var value1 = new BigDecimal("4.5");
        var value2 = new BigDecimal("1.2");
        

        System.out.println("SOMA");
        System.out.println(value1.add(value2));
        System.out.println();
        System.out.println("======================");

        System.out.println("SUBTRÇÃO");
        System.out.println(value1.subtract(value2));

        System.out.println();
        System.out.println("======================");

        System.out.println("MULTIPLICAÇÃO");
        System.out.println(value1.multiply(value2));

        System.out.println();
        System.out.println("======================");

        System.out.println("DIVISÃO");
        System.out.println(value1.divide(value2));

        System.out.println();
        System.out.println("======================");

        System.out.println("ARREDONDAMENTO");
        System.out.println(value2.divide(value1,2, RoundingMode.HALF_UP));


        System.out.println();
        System.out.println("======================");

        System.out.println("NEGATIVAR O NUMERO");
        System.out.println(value2.negate());

        System.out.println();
        System.out.println("======================");

        System.out.println("RAIZ QUADRADA");
        System.out.println(value2.sqrt(new MathContext(2)));
        
        System.out.println();
        System.out.println("======================");

        System.out.println("Potência");
        System.out.println(value2.pow(2));

        System.out.println();
        System.out.println("======================");

        System.out.println(BigDecimal.ONE);

        
        
        
    }
    
}
