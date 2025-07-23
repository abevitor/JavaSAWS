package keywords.modificadorProtected;

/*MODIFICADOR PROTECTED
 * -Parecido com o default
 * -Consegue ser acessado fora do package caso tenha herança
 * -Funciona com classes do mesmo package
 */

public class Client {

    protected String name;
    protected int age;

    protected String getName(){
        return name;
    }

    protected int getAge(){
        return age;
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setAge(int age){
        this.age = age;
    }
    
}
