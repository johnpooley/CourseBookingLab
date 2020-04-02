package com.codeclan.CourseBookingLab.models;

import javax.persistence.*;


@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "town")
    private String town;

    @Column(name = "age")
    private int age;

    public Customer(String name, String town, int age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

    public Customer(){}

//    getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getTown() { return town; }
    public int getAge() { return age; }


//    setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setTown(String town) { this.town = town; }
    public void setAge(int age) { this.age = age; }
}


