package apiStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static apiStreams.ContactType.EMAIL;
import static apiStreams.ContactType.PHONE;

public class Main2 {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>(generateUsers());

        //users.sort(Comparator.comparing(User :: name));
        //users.sort(Comparator.comparing(User :: age));
        //users.sort(Comparator.comparing(User :: name, Comparator.reverseOrder()));
         
        //var values = users.stream().filter(u -> u.contact().size() >= 2)
                                   //.toList();

        //var values = users.stream().filter(u -> u.contact() != null && u.contact().isEmpty())
                                  // .toList();
                                  //filter(c -> c.description().contains("gmail"))
        
            var values = users.stream()
                .flatMap(u -> u.contact().stream())
                //.filter(c -> c.type() == PHONE)
                //.filter(u -> u.sex() == FEMALE)
                //.collect(Collectors.toMap())
                .sorted((c1, c2) -> c1.descrption().compareTo(c2.descrption()))
                .map(c -> """
                    {
                        'descrption': '%s',
                        'type': '%s'
                    }
                    """.formatted(c.descrption(), c.type()))
                .toList();

        values.forEach(System.out::println);

       
        
    }

    private static List<User> generateUsers() {
        var contacts1 = List.of(
            new Contact("(11)97483-8312", PHONE),
            new Contact("vitor.prates@gmail.com", EMAIL)

        );

        var contacts2 = List.of(
            new Contact("(21)78244-4728", PHONE),
            new Contact("beatriz.queiroz@gmail.com", EMAIL)

        );

        var contacts3 = List.of(
            new Contact("(54)28743-3190", PHONE)
        );

        var contacts4 = List.of(
            new Contact("(88)879345-9843", PHONE)

        );


        var contacts5 = List.of(
            new Contact("(47)34579=9012", PHONE),
            new Contact("patricia@hotmail.com", EMAIL)

        );

        var user1 = new User("Vitor", 20, Sex.MASCULINE, new ArrayList<>(contacts1));
        var user2 = new User("Beatriz", 19, Sex.FEMALE, new ArrayList<>(contacts2));
        var user3 = new User("Bill", 45, Sex.MASCULINE, new ArrayList<>(contacts3));
        var user4 = new User("Zezé", 70, Sex.MASCULINE, new ArrayList<>(contacts4));
        var user5 = new User("Patricia", 47, Sex.FEMALE, new ArrayList<>(contacts5));




        return List.of(user1, user2, user3, user4, user5);

    }
    
}
