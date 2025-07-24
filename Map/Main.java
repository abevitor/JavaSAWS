package Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       Map<String, User> users = new HashMap<>();
       
       users.put("joao@joao.com", new User("João", 22));
       users.put("vitor@vitor.com", new User("vitor", 20));
       users.put("bill@bill.com", new User("bill", 28));
       users.put("zeze@zeze.com", new User("zeze", 50));
       users.put("pedro@pedro.com", new User("pedro", 40));

       System.out.println(users);
       System.out.println();
       System.out.println("================================");
       System.out.println();
       users.keySet().forEach(System.out::println);
       System.out.println();
       System.out.println("================================");

       System.out.println();

       users.values().forEach(System.out::println);

       System.out.println();
       System.out.println("================================");

       System.out.println(users.containsKey("joao@joao.com"));
       System.out.println(users.containsValue(new User("Marcos", 39)));

       System.out.println();
       System.out.println("================================");
       
       System.out.println(users.remove("pedro@pedro.com", new User("pedro",40)));

       System.out.println();
       System.out.println("================================");

       users.forEach((k, v) -> System.out.printf("key: %s | value %s \n", k, v));

       System.out.println();
       System.out.println("================================");

       users.replace("joao@joao.com", new User("João", 70));
       users.forEach((k, v) -> System.out.printf("key: %s | value %s \n", k, v));

       System.out.println();
       System.out.println("================================");

       System.out.println(users.getOrDefault("joao@joao.com", new User(" ", -1)));

       System.out.println();
       System.out.println("================================");

       System.out.println(users.isEmpty());

       System.out.println();
       System.out.println("================================");

       users.merge("vitor@vitor.com", new User("", -1), (user, user2) -> {
        System.out.println(user);
        System.out.println(user2);
        return user2;

       });
       System.out.println(users);

       System.out.println();
       System.out.println("================================");

       users.putIfAbsent("beatriz@beatriz", new User("beatriz", 20));
       System.out.println(users);



    }
    
}
