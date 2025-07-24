package Set;
import java.util.Objects;

public class User{

    private int id;
    private String name;

    public User() {}

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("{'id': %s, 'name' : %s}", id, name);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof User)) return false;

        User user = (User) obj;
        return this.id == user.getId() && Objects.equals(this.name, user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

}

