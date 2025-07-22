package HerancaPolimorfismo;

public non-sealed class Manager extends Employee {
    
    private String login;
    private String password;
    private double comission;

    public Manager (String code,
                     String name,
                     String adress,
                     int age,
                     double salary,
                     String login,
                     String password,
                     double comission){

       super(code, name, adress, age, salary);
       this.login = login;
       this.password = password;
       this.comission = comission;
        
    }

    @Override //sobrescreve um comportamento
    public String getCode(){
        return "MG" + this.code;

    }


    public Manager(){

    }


    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public double getComission(){
        return comission;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setComission(double comission){
        this.comission = comission;
    }

    @Override
    public double getFullSalary(){
        return this.salary + this.comission;
    }
      //sobrecarga nomes iguais comportamentos diferentes
    public double getFullSalary(double extra){
        return this.getFullSalary() + extra;

    }
    public double getFullSalary(double extra, double extra2){
        return this.getFullSalary() + extra + extra2;

    }
    
}
