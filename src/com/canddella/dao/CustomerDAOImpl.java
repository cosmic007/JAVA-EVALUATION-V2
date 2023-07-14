package com.canddella.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.canddella.entity.Customer;
import com.canddella.entity.SavingsMaxAccount;

public class CustomerDAOImpl implements CustomerDAO{

	@Override
	public Customer createCustomer() {
		Scanner  scanner = new Scanner(System.in);
		
		
		System.out.println("Enter productCode:");
		String productCode=scanner.nextLine();
		System.out.println("Enter productType:");
		String productType=scanner.nextLine();
		System.out.println("Enter account No:");
		String accountNo=scanner.nextLine();
		System.out.println("Enter account Type:");
		String accountType=scanner.nextLine();
		System.out.println("Enter account Balance:");
		double accountBalance=scanner.nextDouble();
		System.out.println("Enter customerCode:");
		scanner.nextLine();
		String customerCode=scanner.nextLine();
		System.out.println("Enter customerName");
		String customerName=scanner.nextLine();
		
		return new Customer(customerCode,customerName,new SavingsMaxAccount(productCode,productType,accountNo,accountType,accountBalance));
	}

	@Override
	public void displayCustomer(Customer customer) {
		SavingsMaxAccount savingsMaxAccount=null;
		
		
		System.out.println("Customer Code:"+customer.getCustomerCode()+"\nCustmer Name:"+customer.getCustomerName());
		if(customer.getProduct() instanceof SavingsMaxAccount)
		{
		 savingsMaxAccount =(SavingsMaxAccount) customer.getProduct();
			
		}
		System.out.println("Account No:"+savingsMaxAccount.getAccountNo()+"\nAccount Type:"+savingsMaxAccount.getAccountType()+"\nAccount Balance:"+savingsMaxAccount.getBalance());
		
		
		
	}

	@Override
	public void saveCustomer(Customer customer, ArrayList<Customer> customerList) {
		
		boolean check=customerList.add(customer);
		if(check)
			System.out.println("Customer Saved");
		else
			System.out.println("Failed to Save");
		
		
	}

	@Override
	public void deleteCustomer(String customerCode, ArrayList<Customer> customerList) {
		Customer selectedCustomer =null;
		
		for(Customer customer:customerList)
		{
			if(customer!=null)
			{
				if(customer.getCustomerCode().equalsIgnoreCase(customerCode))
				{
					selectedCustomer = customer;
					
				}
			}
		}
		customerList.remove(selectedCustomer);
		System.out.println("Customer deleted");
		
	}

	@Override
	public void searchCustomer(String customerCode, ArrayList<Customer> customerList) {
		int count=0;
		int size=customerList.size();
		for(Customer customer:customerList)
		{
			if(customer!=null)
			{
				if(customer.getCustomerCode().equalsIgnoreCase(customerCode))
				{
					System.out.println("Customer Found");
					displayCustomer(customer);
					
				}
			}
			count++;
			
		}
		if(count>size)
		{
			System.out.println("Customer Not found");
		}
		
	}

	@Override
	public void updateCustomer(String customerCode, ArrayList<Customer> customerList) {
		Scanner scanner = new Scanner(System.in);
		int count=0;
		int size=customerList.size();
		for(Customer customer:customerList)
		{
			if(customer!=null)
			{
				if(customer.getCustomerCode().equalsIgnoreCase(customerCode))
				{
					System.out.println("Enter new customer name:");
					String newCustomerName=scanner.nextLine();
					customer.setCustomerName(newCustomerName);
					System.out.println("Customer Name Updated");
					
				}
				
			}
			count++;
		}
		if(count>size)
		{
			System.out.println("Customer Not found");
		}
		
	}

	@Override
	public void displayAllCustomer(ArrayList<Customer> customerList) {
		int count=1;
		for(Customer customer:customerList)
		{
			if(customer!=null)
			{
				System.out.println("Customer :"+count);
				displayCustomer(customer);
				System.out.println("");
				count++;
				
			}
		}
		
	}

}
