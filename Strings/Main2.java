package Strings;

import java.time.Duration;
import java.time.OffsetDateTime;

public class Main2 {
    public static void main(String[] args) {

        // String concatenation with +
        var stringStart = OffsetDateTime.now();
        String stringConcat = "";
        for (int i = 0; i < 100_000; i++) {
            stringConcat += i;
        }
        var stringEnd = OffsetDateTime.now();
        System.out.printf("String concat: %d miliseconds\n", getInterval(stringStart, stringEnd));

        System.out.println();
        System.out.println("========================");
        System.out.println();

        // StringBuilder
        var builderStart = OffsetDateTime.now();
        StringBuilder builderConcat = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            builderConcat.append(i);
        }
        var builderEnd = OffsetDateTime.now();
        System.out.printf("StringBuilder (single-thread): %d miliseconds \n", getInterval(builderStart, builderEnd));

        System.out.println();
        System.out.println("========================");
        System.out.println();

        // StringBuffer
        var bufferStart = OffsetDateTime.now();
        StringBuffer bufferConcat = new StringBuffer();
        for (int i = 0; i < 100_000; i++) {
            bufferConcat.append(i);
        }
        var bufferEnd = OffsetDateTime.now();
        System.out.printf("StringBuffer (multi-thread safe): %d miliseconds\n", getInterval(bufferStart, bufferEnd));
        System.out.println();
        System.out.println("=========================");

        var builder = new StringBuilder("1234567");

        System.out.println(builder.deleteCharAt(0));

        System.out.println();
        System.out.println("=========================");

        System.out.println(builder.reverse());

        System.out.println();
        System.out.println("=========================");

        System.out.println(builder.lastIndexOf("7"));

        System.out.println();
        System.out.println("=========================");
        
        System.out.println(builder.insert(5, "a"));

        System.out.println();
        System.out.println("=========================");

        System.out.println(builder.insert(builder.length() -1 , "a"));
                                                 //ou .append
        System.out.println();
        System.out.println("=========================");

        System.out.println(builder.isEmpty());

        System.out.println();
        System.out.println("=========================");

        builder.setLength(5);
        System.out.println(builder);
        

         

    }                                             

    


    private static long getInterval(final OffsetDateTime start, final OffsetDateTime end) {
        return Duration.between(start, end).toMillis();
    }
}

