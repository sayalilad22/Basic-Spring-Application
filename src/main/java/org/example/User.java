package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class User {

    @Id
    @GeneratedValue

    private String name;
    private int age;

    private Long id;

    public User() {}

    public User(String name, int age,long id) {
        this.name = name;
        this.age = age;
        this.id=id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public long id(){
        return id;
    }
    public void Id(Long age) { this.id = id; }

}
