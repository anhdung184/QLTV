package com.example.QLTV.Model;

import jakarta.persistence.*;

@Entity
@Table(name="ACCOUNT")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "PERMISSIONS")
    private String permissions;

    public Account(){

    }

    public Account(String username,String password,String permissions){
        this.username = username;
        this.password = password;
        this.permissions = permissions;
    }

    public long getId() {
        return id;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getPermissions(){
        return permissions;
    }

    public void setPermissions(String permissions){
        this.permissions = permissions;
    }

    @Override
    public String toString(){
        return "Account [id=" + id + ", username=" + username +", password=" + password + ", permissions=" + permissions + "]";
    }
}
