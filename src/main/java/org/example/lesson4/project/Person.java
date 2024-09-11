package org.example.lesson4.project;


import javax.persistence.*;

@Entity
@Table(name = "test.test")
public class Person {

    //region Fields

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    //endregion

    //region Constructors

    public Person() {
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    //endregion

    //region Getters and Setters

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //endregion

    //region Methods

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }


    //endregion
}
