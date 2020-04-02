package com.codeclan.CourseBookingLab.components;

import com.codeclan.CourseBookingLab.models.Customer;
import com.codeclan.CourseBookingLab.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    public Dataloader(){}

    public void run(ApplicationArguments args){
        Customer customer = new Customer("John", "Glasgow", 21);
        customerRepository.save(customer);

        Customer customer2 = new Customer("jack","edinburgh",22);
        customerRepository.save(customer2);

    }
}
