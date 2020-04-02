package com.codeclan.CourseBookingLab.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date")
    private String date;
    @JsonIgnoreProperties
    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;
    @JsonIgnoreProperties
    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    public Booking(String date, Customer customer, Course course) {
        this.date = date;
        this.customer = customer;
        this.course = course;
    }

    public Booking(){}

//    getters
    public Long getId() { return id; }
    public String getDate() { return date; }
    public Customer getCustomer() { return customer; }
    public Course getCourse() { return course; }

    //    setters
    public void setId(Long id) { this.id = id; }
    public void setDate(String date) { this.date = date; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public void setCourse(Course course) { this.course = course; }
}
