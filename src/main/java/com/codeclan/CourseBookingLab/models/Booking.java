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

    public Booking(String date, Customer customer) {
        this.date = date;
        this.customer = customer;
    }

    public Booking(){}

//    getters
    public Long getId() { return id; }
    public String getDate() { return date; }
    public Customer getCustomer() { return customer; }

//    setters
    public void setId(Long id) { this.id = id; }
    public void setDate(String date) { this.date = date; }
    public void setCustomer(Customer customer) { this.customer = customer; }
}
