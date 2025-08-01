package Primitivos;

public class User {

    private String name;

    private int age;


    public User(final String name, final int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
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

    @Override
public String toString() {
    return "User{name='" + name + "', age=" + age + "}";
}

    
}
