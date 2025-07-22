package HerancaPolimorfismo;

public class Mainpt2 {
    public static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new SalesMan());
        
    }

    public static void printEmployee(Employee employee){
        employee.code = "456";

        System.out.printf("=======%s=======\n",employee.getClass().getCanonicalName());

       switch(employee){
        case Manager manager -> {
            manager.setCode("123");
            manager.setName("João");
            manager.setSalary(5000);
            manager.setLogin("joao");
            manager.setPassword("12345");
            manager.setComission(1200);

        System.out.println(employee.getCode());
        System.out.println(employee.getSalary());
        System.out.println(employee.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
        System.out.println(manager.getComission());
        System.out.println(manager.getFullSalary(500));
        System.out.println(manager.getFullSalary(4) );

        }
        case SalesMan salesman -> {

            salesman.setCode("123");
            salesman.setName("Lucas");
            salesman.setSalary(5000);
            salesman.setPercentPerSold(0.10);
            salesman.setSoldAmount(5000);

        System.out.println(salesman.getCode());
        System.out.println(salesman.getSalary());
        System.out.println(salesman.getName());
        System.out.println(salesman.getSoldAmount());
        }    
       }
       System.out.println(employee.getFullSalary());
       System.out.println("=================");
    }

    
}