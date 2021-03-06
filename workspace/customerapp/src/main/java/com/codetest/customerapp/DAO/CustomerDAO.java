package com.codetest.customerapp.DAO;

import java.util.List;

import com.codetest.customerapp.model.Customer;

public interface CustomerDAO {
	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public List<Customer> listCustomers();
	public Customer getCustomerById(int id);
	public void removeCustomer(int id);
	
}
