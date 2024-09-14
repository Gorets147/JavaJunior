package org.example.homework4;


import javax.persistence.*;

@Entity
@Table(name = "test.persons")
public class Person {

    //region Fields

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "имя")
    private String name;

    @Column(name = "возраст")
    private int age;

    //endregion

    //region Constructors

    public Person() {
    }

    public Person( String name, int age) {
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //endregion


    //region Methods
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //endregion
}
