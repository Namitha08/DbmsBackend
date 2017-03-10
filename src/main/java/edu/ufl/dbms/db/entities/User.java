package edu.ufl.dbms.db.entities;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Created by nammi on 10/3/17.
 */

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
