package edu.ufl.dbms.conf;

import edu.ufl.dbms.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nammi on 10/3/17.
 */
@Configuration
public class SpringBeans {

    @Bean
    public UserDao userDao(){
        return new UserDao();
    }

}
