package com.noetic.Assignment.crudApp.crudAppspringboothsql.model;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String title) {
        this.firstName = title;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String content) {
        this.lastName = content;
    }
}