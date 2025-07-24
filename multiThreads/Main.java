package multiThreads;

import java.time.Duration;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static AtomicInteger number = new AtomicInteger(0);



    /*
      private static Queue<Integer> numbers = new LinkedBlockingQueue<>(250);

    private static void inc(int number){
        numbers.offer(number); // mais seguro
    }

    private static void show(){
        System.out.println(numbers);
    }

     */
    public static void main(String[] args)                              {
                                          //throws InterruptedException
        Runnable inc = () -> {
            for(int i = 0; i < 1000_000; i++){

                number.incrementAndGet();
               
               
               // inc(i);
            }
        };

        Runnable dec = () -> {
            for(int i = 0; i > -1000_000; i--){
                
                number.decrementAndGet();
                //inc(i);
            }
        };

        Runnable show = () -> {
            for (int i = 0; i < 1000_000; i++){
                System.out.println(number);
               // show();
               // try { Thread.sleep(200); } catch (InterruptedException e) {}
            }
        };

        var execInc = new Thread(inc);
        execInc.start();
        execInc.setName("execInc");

        var execDec = new Thread(dec);
        execDec.start();
        //execDec.join(Duration.ofSeconds(1));
                // prioriza os numeros negativos funciona com positivo
                //tambem
                

        execDec.setName("execDec");

        var execShow = new Thread(show);
        execShow.start();
        execShow.setName("execShow");



        //System.out.println(execInc.getName());
        //System.out.println(execDec.getName());
        //System.out.println(execShow.getName());
    }  
}
