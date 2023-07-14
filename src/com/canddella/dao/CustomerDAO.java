package com.canddella.dao;

import java.util.ArrayList;

import com.canddella.entity.Customer;

public interface CustomerDAO {
	public Customer createCustomer();
	public void displayCustomer(Customer customer);
	
	public void saveCustomer(Customer customer,ArrayList <Customer> customerList);
	public void deleteCustomer(String customerCode,ArrayList <Customer> customerList);
	public void searchCustomer(String customerCode,ArrayList <Customer> customerList);
	public void updateCustomer(String customerCode,ArrayList <Customer> customerList);
	public void displayAllCustomer(ArrayList <Customer> customerList);

}
