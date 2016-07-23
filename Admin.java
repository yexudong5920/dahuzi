package com.iotek.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/26 0026.
 */
@Entity
@Table(name = "t_admin",catalog = "easy")
public class Admin implements Serializable{
    private int id;
    private String name;
    private String pass;

    public Admin() {
    }

    public Admin(int id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "pass")
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;

        Admin admin = (Admin) o;

        if (id != admin.id) return false;
        if (name != null ? !name.equals(admin.name) : admin.name != null) return false;
        return !(pass != null ? !pass.equals(admin.pass) : admin.pass != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
