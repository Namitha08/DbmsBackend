package edu.ufl.dbms.dao;

import edu.ufl.dbms.db.entities.User;
import edu.ufl.dbms.repositories.UserRepo;
import edu.ufl.dbms.types.Login;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by nammi on 10/3/17.
 */

public class UserDao {

    @Autowired
    UserRepo userRepo;
    public edu.ufl.dbms.types.User loginAndReturnUser(Login login){

        List<User> userEntities = userRepo.findByNameAndPassword(login.getUserName(),login.getPassword());

        if(null!= userEntities && (!userEntities.isEmpty())){
            edu.ufl.dbms.types.User user =  new edu.ufl.dbms.types.User();
            user.setUserName(userEntities.get(0).getName());
            user.setPassword(userEntities.get(0).getPassword());
            user.setId(userEntities.get(0).getId());
            return user;
        }

        return null;
    }

}
