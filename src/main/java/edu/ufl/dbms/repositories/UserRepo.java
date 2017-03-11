package edu.ufl.dbms.repositories;
import edu.ufl.dbms.db.entities.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by nammi on 10/3/17.
 */
public interface UserRepo extends CrudRepository<Users,Long>{

    List<Users> findByNameAndPassword(String name, String password);
}
