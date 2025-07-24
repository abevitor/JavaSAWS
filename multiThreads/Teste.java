package multiThreads;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    private static final List<Integer> numbers = new ArrayList<>();

    private static void inc(int number) {
        synchronized (numbers) {
            numbers.add(number);
        }
    }

    private static void show() {
        synchronized (numbers) {
            System.out.println("Tamanho atual da lista: " + numbers.size());
        }
    }

    public static void main(String[] args) {

        Runnable incTask = () -> {
            for (int i = 0; i < 100_000; i++) {
                inc(i);
            }
        };

        Runnable decTask = () -> {
            for (int i = 100_000; i > 0; i--) {
                inc(-i); // apenas para exemplo, adicionando números negativos
            }
        };

        Runnable showTask = () -> {
            for (int i = 0; i < 250_000; i++) {
                show();
            }
        };

        new Thread(incTask).start();
        new Thread(decTask).start();
        new Thread(showTask).start();
    }
}

