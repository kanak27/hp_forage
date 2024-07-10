package com.hp.controllers;

import javax.persistence.Entity;

@Entity
public class Employee {

    public Employee() {}

    public Employee( 
        String id, String first_name, 
        String last_name, String email, String title) 
    { 
  
        super(); 
  
        this.id = id; 
  
        this.first_name = first_name; 
  
        this.last_name = last_name; 
  
        this.email = email; 
  
        this.title = title;
    }

    private String id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    @Override
    public String toString()
    {
  
        return "Employee: ID = "
            + id + ", First Name = "
            + first_name + ", Last Name = "
            + last_name + ", email = "
            + email + ", title = "
            + title;      
    }

    public String getId() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
