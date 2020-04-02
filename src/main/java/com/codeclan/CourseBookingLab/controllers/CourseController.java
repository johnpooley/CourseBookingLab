package com.codeclan.CourseBookingLab.controllers;

import com.codeclan.CourseBookingLab.models.Course;
import com.codeclan.CourseBookingLab.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public ResponseEntity<List<Course>>getAllCourses(){
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{name}")
    public ResponseEntity<Optional<Course>>getCourse(@PathVariable String name){
        return new ResponseEntity(courseRepository.findCourseByName(name), HttpStatus.OK);
    }
}
