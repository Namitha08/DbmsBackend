package edu.ufl.dbms.api;

import edu.ufl.dbms.dao.UserDao;
import edu.ufl.dbms.types.Login;
import edu.ufl.dbms.types.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by nammi on 10/3/17.
 */
@Path("/login")
@Produces("application/json")
@Consumes("application/json")
public class LoginResource {

    @Autowired
    UserDao userDao;

    @POST
    public Response login(Login login){
        User user = userDao.loginAndReturnUser(login);
        if(null!=user){
        return Response.ok().entity(user).build();
        }
        else return Response.status(401).build();
    }

}
