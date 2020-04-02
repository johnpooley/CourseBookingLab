package com.codeclan.CourseBookingLab;

import com.codeclan.CourseBookingLab.models.Customer;
import com.codeclan.CourseBookingLab.repositories.CustomerRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseBookingLabApplicationTests {

	@Autowired
	CustomerRepository customerRepository;



	@Test
	void contextLoads() {
	}

	
	@Test
		public void canFindCustomerByName(){
		Customer customer = new Customer("John", "Glasgow", 21);
		customerRepository.save(customer);
		List<Customer> foundCustomers = customerRepository.findCustomerByName("John");
		assertEquals("John", foundCustomers.get(0).getName());
	}



}
