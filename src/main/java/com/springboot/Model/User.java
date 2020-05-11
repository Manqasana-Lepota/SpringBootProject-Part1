package com.springboot.Model;

public class User {

    /*instance variable*/
    private long id;
    private String name;
    private String surname;

    /*overloaded constructor*/
    public User(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    /*getter method returns the id*/
    public long getId() {
        return id;
    }

    /*setter method to set id*/
    public void setId(long id) {
        this.id = id;
    }

    /*getter method returns the name*/
    public String getName() {
        return name;
    }

    /*setter method to set name*/
    public void setName(String name) {
        this.name = name;
    }

    /*getter method returns the surname*/
    public String getSurname() {
        return surname;
    }

    /*setter method to set surname*/
    public void setSurname(String surname) {
        this.surname = surname;
    }
}//end class
