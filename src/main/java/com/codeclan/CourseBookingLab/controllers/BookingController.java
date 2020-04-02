package com.codeclan.CourseBookingLab.controllers;

import com.codeclan.CourseBookingLab.models.Booking;
import com.codeclan.CourseBookingLab.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Table;
import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping
    public ResponseEntity<List<Booking>>getAllBookings(){
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{date}")
    public ResponseEntity<Optional<Booking>>getBookingByDate(@PathVariable String date){
        return new ResponseEntity(bookingRepository.findByDate(date),HttpStatus.OK);
    }
}
