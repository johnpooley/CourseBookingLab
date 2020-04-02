package com.codeclan.CourseBookingLab.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "town")
    private String town;
    @Column(name = "starRating")
    private int starRating;

    @JsonBackReference
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public Course(String name, String town, int starRating) {
        this.name = name;
        this.town = town;
        this.starRating = starRating;
        this.bookings = new ArrayList<>();
    }

    public Course(){

    }
//getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getTown() { return town; }
    public int getStarRating() { return starRating; }
    public List<Booking> getBookings() { return bookings; }
    //setters
    public void setId(Long id){ this.id = id; }
    public void setName(String name) {this.name = name;}
    public void setTown(String town) { this.town = town;}
    public void setStarRating(int starRating) { this.starRating = starRating; }
    public void setBookings(List<Booking> bookings) { this.bookings = bookings; }
}
