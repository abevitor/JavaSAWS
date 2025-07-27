package Exceptions.Cadastro;

import java.time.LocalDate;

import java.util.Objects;

public class UserModel{
    
    private long id;
    private String name;
    private String email;
    private LocalDate birthday;

    public UserModel(final long id, final String name, final String email, final LocalDate birthday){
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }


    public UserModel(){

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        return result;
    }
    
     @Override
    public boolean equals(final Object o) {
        if(this == o) return true;
        if(!(o instanceof UserModel userModel)) return false;
        return id == userModel.id 
        && Objects.equals(name, userModel.name) 
        && Objects.equals(email, userModel.email) 
        && Objects.equals(birthday, userModel.birthday);
    }
     @Override
     public String toString() {
        return "UserModel [id=" + 
        id + ", name=" 
        + name +
         ", email=" 
         + email + 
         ", birthday=" 
         + birthday + "]";
     }

   
   
    
    

    
}
