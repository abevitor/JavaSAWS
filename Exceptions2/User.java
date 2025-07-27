package Exceptions2;

public class User {
    // Atributos privados do usuário
    private long id;
    private String name;
    private String email;

    // Construtor que recebe os valores para inicializar o objeto
    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Métodos getter para acessar os atributos
    public long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Método toString para imprimir um usuário em formato legível
    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}
 
