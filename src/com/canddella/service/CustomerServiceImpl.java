package com.canddella.service;

import java.util.ArrayList;

import com.canddella.dao.CustomerDAOImpl;
import com.canddella.entity.Customer;

public class CustomerServiceImpl implements CustomerService{
	CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();

	@Override
	public Customer createCustomer() {
		
		
		
		
	
		return customerDAOImpl.createCustomer();
	}

	@Override
	public void displayCustomer(Customer customer) {
		customerDAOImpl.displayCustomer(customer);
		
		
	}

	@Override
	public void saveCustomer(Customer customer, ArrayList<Customer> customerList) {
		
		customerDAOImpl.saveCustomer(customer, customerList);
		
		
	}

	@Override
	public void deleteCustomer(String customerCode, ArrayList<Customer> customerList) {
		
		customerDAOImpl.deleteCustomer(customerCode, customerList);
		
		
	}

	@Override
	public void searchCustomer(String customerCode, ArrayList<Customer> customerList) {
		customerDAOImpl.searchCustomer(customerCode, customerList);
		
		
	}

	@Override
	public void updateCustomer(String customerCode, ArrayList<Customer> customerList) {
		customerDAOImpl.updateCustomer(customerCode, customerList);
		
		
	}

	@Override
	public void displayAllCustomer(ArrayList<Customer> customerList) {
		customerDAOImpl.displayAllCustomer(customerList);
		
	}
	

}
