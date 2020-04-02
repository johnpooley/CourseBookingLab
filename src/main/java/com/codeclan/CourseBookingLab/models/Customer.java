package com.codeclan.CourseBookingLab.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;


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

    @JsonBackReference
    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private List<Booking> bookings;

//    @JsonBackReference
//    @OneToMany(mappedBy = "distillery", fetch = FetchType.LAZY)
//    private List<Whisky> whiskies;

    public Customer(String name, String town, int age) {
        this.name = name;
        this.town = town;
        this.age = age;
        this.bookings = new ArrayList<>();
    }

    public Customer(){}

//    getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getTown() { return town; }
    public int getAge() { return age; }
    public List<Booking> getBookings() { return bookings; }

    //    setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setTown(String town) { this.town = town; }
    public void setAge(int age) { this.age = age; }
    public void setCourses(List<Course> courses) { this.bookings = bookings; }



}


