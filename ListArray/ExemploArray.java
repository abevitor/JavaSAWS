package ListArray;

public class ExemploArray {
    public static void main(String[] args) {
        // Criando um array de inteiros com 3 posições
        int[] numeros = new int[3];

        // Atribuindo valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        // Acessando os valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
    }
}

