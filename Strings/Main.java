package Strings;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var value = "java;java;java;java";

        //troca de todos os caracteres//
 
        value = value.replace("java", "Vitor");
        System.out.println(value);

        System.out.println();
        System.out.println("==============================");

        // troca apenas do primeiro caracter
        value = value.replaceFirst("j", "J");

        System.out.println(value);

        System.out.println();
        System.out.println("==============================");

       var values = value.split(";", 2);
       for(var v : values){
        System.out.println(v);

         System.out.println();
        System.out.println("==============================");

        System.out.println(value.toUpperCase());

         System.out.println();
        System.out.println("==============================");

        System.out.println(value.toLowerCase());

         System.out.println();
        System.out.println("==============================");

        System.out.println(value.contains("z"));

         System.out.println();
        System.out.println("==============================");

        System.out.println(value.indexOf("i",1, 4));
        

         System.out.println();
        System.out.println("==============================");

        System.out.println(value.startsWith("Vi"));
        
         System.out.println();
        System.out.println("==============================");

        System.out.println(value.endsWith("p"));

         System.out.println();
        System.out.println("==============================");
        System.out.println(value.isEmpty());
        //se eu quiser que desconssidere
        //espaços coloque isBlank()

         System.out.println();
        System.out.println("==============================");
        System.out.println(value.trim());

         System.out.println();
        System.out.println("==============================");

        var value2 = "///vitor///";

        System.out.println(value2.substring(3, 8));

         System.out.println();
        System.out.println("==============================");

        var value3 = """
        {"name": "Vitor", "age": 20}""";
                Map<String, String> map = new HashMap<>();

                value3 = value3.replace("{", "").replace("}", "").replace("\"", "");
                var valueArr = value3.split(",");

                for(var v1 : valueArr){
                    var keyValue = v1.split(":");
                    map.put(keyValue[0].trim(), keyValue[1].trim());
                    
                }
                System.out.println(map);

                 System.out.println();
        System.out.println("==============================");

        var value4 = "receba";

        System.out.println(value4.repeat(54));

        float floatValue = 12.34f;
        int intValue = 42;
        char charValue = 'A';
        String name = "Vitor";
        Object obj = null;

        System.out.println();
        System.out.println("==============================");

        // %a - hexadecimal floating point
        System.out.printf("%%a: %a%n", floatValue); // → %a: 0x1.8ad147ae147aep3
         
        System.out.println();
        System.out.println("==============================");

        // %b - boolean
        System.out.printf("%%b (non-null): %b%n", name); // → true
        System.out.printf("%%b (null): %b%n", obj);       // → false

        System.out.println();
        System.out.println("==============================");

        // %c - character
        System.out.printf("%%c: %c%n", charValue); // → A

        System.out.println();
        System.out.println("==============================");

        // %d - decimal integer
        System.out.printf("%%d: %d%n", intValue); // → 42

        System.out.println();
        System.out.println("==============================");

        // %e - scientific notation
        System.out.printf("%%e: %e%n", floatValue); // → 1.234000e+01

        System.out.println();
        System.out.println("==============================");

        // %f - floating point (decimal)
        System.out.printf("%%f: %.2f%n", floatValue); // → 12.34

        System.out.println();
        System.out.println("==============================");

        // %g - general floating point
        System.out.printf("%%g: %g%n", floatValue); // → 12.34

        System.out.println();
        System.out.println("==============================");

        // %h - hash code in hexadecimal
        System.out.printf("%%h: %h%n", name); // → hash do nome em hex

        System.out.println();
        System.out.println("==============================");

        // %n - new line
        System.out.printf("Linha 1%nLinha 2%n");

        System.out.println();
        System.out.println("==============================");

        // %o - octal number
        System.out.printf("%%o: %o%n", intValue); // → 52 (octal de 42)

        System.out.println();
        System.out.println("==============================");

        // %s - string
        System.out.printf("%%s: %s%n", name); // → Vitor

        System.out.println();
        System.out.println("==============================");

        // %t - date/time
        java.util.Date today = new java.util.Date();
        System.out.printf("%%tF: %tF%n", today); // → 2025-07-24 (YYYY-MM-DD)

        System.out.println();
        System.out.println("==============================");

        // %x - hexadecimal integer
        System.out.printf("%%x: %x%n", intValue); // → 2a
    }
}


            

 }
    

