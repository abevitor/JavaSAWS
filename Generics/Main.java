package Generics;

public class Main {

    private static GenericDAO<Integer, UserDomain> dao = new UserDAO();
    public static void main(String[] args) {

        var user = new UserDomain( 1, "João", 36);
        System.out.println(dao.count());
        System.out.println(dao.save(user));
        System.out.println(dao.findAll());
        System.out.println(dao.find(d -> d.getId().equals(1)));
        System.out.println(dao.find(d -> d.getId().equals(2)));
        System.out.println("=======================");
       
        System.out.println(dao.count());
         System.out.println("=======================");
        dao.delete(new UserDomain( 2,"", -1));
         dao.delete(new UserDomain(4,"João", 36));
    ;
          System.out.println(dao.findAll());
        System.out.println(dao.count());

        
    }
    
}
