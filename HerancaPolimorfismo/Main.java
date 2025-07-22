package HerancaPolimorfismo;

public class Main {
   public static void main(String[] args) {
     // não é possivel com classe abstrata -> Employee employee = new Employee();
    Employee manager = new Manager();
    SalesMan salesman = new SalesMan();


    System.out.println(" ");
    manager.setName("Vitor");
    //manager.setLogin("Vitor");
    //manager.setPassword("RECEBA123");

   // employee.setName("Bill");
   // employee.setAge(20);
   // employee.setCode("34u2");

    salesman.setName("Rochan");
    salesman.setPercentPerSold(4.56);
    salesman.setSalary(4000);

    System.out.println(manager.getName());
   // System.out.println(manager.getLogin());
  // System.out.println(manager.getPassword());
    System.out.println(" ");
    System.out.println("<===============================>");
    System.out.println(" ");
    //System.out.println(employee.getName());
   // System.out.println(employee.getAge());
   // System.out.println(employee.getCode());
    System.out.println(" ");
    System.out.println("<==========================================>");
    System.out.println(" ");
    System.out.println(salesman.getName());
    System.out.println(salesman.getPercentPerSold());
    System.out.println(salesman.getSalary());
    System.out.println(" ");
   }

    
    
}
