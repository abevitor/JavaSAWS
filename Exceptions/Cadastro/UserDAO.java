package Exceptions.Cadastro;

import java.util.ArrayList;
import java.util.List;

import Exceptions.Cadastro.Exceptions.UserNotFound;

public class UserDAO {

    private long nextId = 1L;



    private final List<UserModel> models = new ArrayList<>();

    public UserModel save(final UserModel model){
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel update(final UserModel model) {
        var toUpdate = findById(model.getId());
        models.remove(toUpdate);
        models.add(model);
        return model;

    }

    public void delete(final long id){
        var toDelete = findById(id);
        models.remove(toDelete);

    }

    public UserModel findById(final long id){
        var message = String.format("Não existe usuário com o id %s", id);
         return models.stream()
         .filter(u -> u.getId() == id)
         .findFirst()
         .orElseThrow(() -> new UserNotFound(message));
    }

    public List<UserModel> findAll(){
        return models;
    }

    
}
