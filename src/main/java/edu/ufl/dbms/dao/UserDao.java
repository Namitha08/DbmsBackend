package edu.ufl.dbms.dao;

import edu.ufl.dbms.db.entities.Users;
import edu.ufl.dbms.repositories.UserRepo;
import edu.ufl.dbms.types.Login;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by nammi on 10/3/17.
 */

public class UserDao {

    @Autowired
    UserRepo userRepo;

    @Autowired
    OracleDataSource dataSource;

    public edu.ufl.dbms.types.User loginAndReturnUser(Login login){

        String username = login.getUserName();
        String password = login.getPassword();
        try {
            String s = dataSource.getConnection().nativeSQL("Select * from Users");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Users> userEntities = userRepo.findByNameAndPassword(username,password);

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
