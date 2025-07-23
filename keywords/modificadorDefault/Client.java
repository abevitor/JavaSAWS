package keywords.modificadorDefault;

//class default nao eh acessavel fora da classe, 
   //por exemplo nao consigo acessar client mesmo importando ou 
   // com construtor na class main
   //para acessar tem que estar no mesmo package
 class Client {

    private String name;
    private int age;
    private Address address = new Address();

    public String getName(){
        System.out.println(address.description);
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    
    
}
