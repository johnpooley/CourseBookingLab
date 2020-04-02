package com.codeclan.CourseBookingLab.components;

import com.codeclan.CourseBookingLab.models.Course;
import com.codeclan.CourseBookingLab.models.Customer;
import com.codeclan.CourseBookingLab.repositories.CourseRepository;
import com.codeclan.CourseBookingLab.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public Dataloader(){}

    public void run(ApplicationArguments args){
        Customer customer = new Customer("John", "Glasgow", 21);
        customerRepository.save(customer);

        Customer customer2 = new Customer("jack","edinburgh",22);
        customerRepository.save(customer2);

        Course course = new Course("Digging", "Edinburgh", 7);
        courseRepository.save(course);

        Course course2 = new Course("Sorting", "Glasgow",6 );
        courseRepository.save(course2);

    }
}
