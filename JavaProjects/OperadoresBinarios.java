package JavaProjects;

public class OperadoresBinarios {
    public static void main(String[] args) {

        int value1 = -789;
        var result = ~value1; // ~: negação binaria
        var binaryResult = Integer.toBinaryString(result);

        System.out.printf("~%s = %s (representação binária %s)\n", value1, result, binaryResult);
        
    }
    
}
