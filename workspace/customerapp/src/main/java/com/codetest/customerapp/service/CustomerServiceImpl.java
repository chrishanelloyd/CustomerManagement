package com.codetest.customerapp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codetest.customerapp.DAO.CustomerDAO;
import com.codetest.customerapp.model.Customer;

/**
 * The Class CustomerServiceImpl.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	/** The customer DAO. */
	private CustomerDAO customerDAO;

	/**
	 * Sets the customer DAO.
	 *
	 * @param customerDAO
	 *            the new customer DAO
	 */
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	/**
	 * addCustomer CustomerServiceImpl
	 */
	@Transactional
	public void addCustomer(Customer customer) {
		this.customerDAO.addCustomer(customer);

	}

	/**
	 * updateCustomer CustomerServiceImpl
	 */
	@Transactional
	public void updateCustomer(Customer customer) {
		this.customerDAO.updateCustomer(customer);

	}

	/**
	 * listCustomers CustomerServiceImpl
	 */
	@Transactional
	public List<Customer> listCustomers() {
		return this.customerDAO.listCustomers();
	}

	/**
	 * Get the customer by customer id
	 * 
	 * @param id
	 *            customer id
	 * @return {@link Customer}
	 */
	@Transactional
	public Customer getCustomerById(int id) {

		return this.customerDAO.getCustomerById(id);
	}

	/**
	 * Removes customer from the database
	 * 
	 * @param id
	 *            customer id
	 */
	@Transactional
	public void removeCustomer(int id) {
		this.customerDAO.removeCustomer(id);
	}

}
