package com.luv2code.springdemo.services;

import java.util.List;
import com.luv2code.springdemo.entity.Customer;

public interface CustomerServices {

		public List<Customer> getCustomers();

		public void saveCustomer(Customer theCustomer);

		public Customer getCustomers(int theId);

		public void deleteCustomer(int theId);
}
