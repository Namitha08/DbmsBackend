package edu.ufl.dbms.repositories;
import edu.ufl.dbms.db.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by nammi on 10/3/17.
 */
public interface UserRepo extends CrudRepository<User,Long>{

    List<User> findByNameAndPassword(String name,String password);
}
