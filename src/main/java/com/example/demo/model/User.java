package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int age;

    @Column
    private String name;

    @Column
    private String secondName;

    public User() {

    }

    public User(Long id, int age, String name, String secondName) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}