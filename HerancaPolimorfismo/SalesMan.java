package HerancaPolimorfismo;

public non-sealed class SalesMan extends Employee {

    private double percentPerSold;

    private double soldAmount;


     public SalesMan (String code,
                     String name,
                     String adress,
                     int age,
                     double salary,
                     double percentPerSold,
                     double souldAmount){

       super(code, name, adress, age, salary);
       this.percentPerSold = percentPerSold;
       this.soldAmount = souldAmount;
        
    }

    @Override
    public String getCode(){
        return "SL" + this.code;

    }

    public SalesMan(){

    }

    public double getSoldAmount(){
        return soldAmount;
    }

    public double getPercentPerSold(){
        return percentPerSold;
    }


    public void setPercentPerSold(double percentPerSold){
        this.percentPerSold = percentPerSold;
    }

    public void setSoldAmount(double soldAmount){
        this.soldAmount = soldAmount;
    }

    @Override
    public double getFullSalary(){
        return this.salary + (soldAmount * percentPerSold / 100);
    }
    
}
