package Set;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Main {
        public static void main(String[] args) {

            //Set<User> users = new TreeSet<>(Comparator.comparingInt(User::getId).reversad());

            //LinkedHashSet: ordena 
            //HashSet: não ordena
        Set<User> users = new TreeSet<>((User u1, User u2) -> {
            var compareResult = 0;
        if(u1.getId() < u2.getId()) compareResult --;
        if(u1.getId() > u2.getId()) compareResult ++;
        return compareResult;
        });
        users.add(new User(1, "Bill"));
        users.add(new User(2, "Patrick"));
        users.add(new User(3, "Bob"));
        users.add(new User(4, "Tung tung"));
        users.add(new User(5, "Luva de pedreiro"));


        //System.out.println(new User(1, "Bill").hashCode());
        System.out.println(users.contains(new User(1, "Bill")));
       
        users.forEach(System.out::println);

        var iterator = users.iterator();

        System.out.println();


        System.out.println("MESMO RESULTADO DE OUTRA FORMA");

        System.out.println();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        users.removeAll(List.of(new User(1, "Bill"), new User(2, "Lucas")));

        System.out.println(users);

        System.out.println();

        users.removeIf(user -> user.getId() > 2);

        System.out.println(users);

        System.out.println();

        users.removeIf(Predicate.not(user -> user.getId() > 2));

    }
    
}
