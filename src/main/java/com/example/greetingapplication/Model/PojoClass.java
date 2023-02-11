package com.example.greetingapplication.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "greetingtable")
public class PojoClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "greetingMassage")
    private String greetingMassage;

    public String getGreetingMassage() {
        return greetingMassage;
    }

    public void setGreetingMassage(String greetingMassage) {
        this.greetingMassage = greetingMassage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PojoClass{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", greetingMassage='" + greetingMassage + '\'' +
                '}';
    }
}


