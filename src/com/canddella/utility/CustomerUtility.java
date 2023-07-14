package com.canddella.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.canddella.entity.Customer;
import com.canddella.service.CustomerServiceImpl;

public class CustomerUtility {

	public static void main(String[] args) {
		boolean next =false;
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
		
		ArrayList <Customer> customerList = new ArrayList <Customer>();

		Customer customer=null;
		Scanner scanner =new Scanner(System.in);
		do
		{
			System.out.println("Menu\n1.Create Customer\n2.Display Customer\n3.Save Customer\n4.Delete Customer\n5.Search Customer\n6.Update Customer\n7.Display All Customers");
			int choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				customer=customerServiceImpl.createCustomer();
				next=true;
				
				break;
				
			case 2:
				
				customerServiceImpl.displayCustomer(customer);
				next=false;
				break;
				
			case 3:
				customerServiceImpl.saveCustomer(customer, customerList);
				break;
			case 4:
				System.out.println("Enter Customer Code");
				scanner.nextLine();
				String customerCodeForDelete=scanner.nextLine();				
				customerServiceImpl.deleteCustomer(customerCodeForDelete, customerList);
				break;
			case 5:
				System.out.println("Enter Customer Code");
				scanner.nextLine();
				String customerCodeForSearch=scanner.nextLine();	
				customerServiceImpl.searchCustomer(customerCodeForSearch, customerList);
				
				break;
			case 6:
				System.out.println("Enter Customer Code");
				scanner.nextLine();
				String customerCodeForUpdate=scanner.nextLine();
				customerServiceImpl.updateCustomer(customerCodeForUpdate, customerList);
				break;
			case 7:
				customerServiceImpl.displayAllCustomer(customerList);
				break;
				
			default:
				System.out.println("Invalid Option");
				next=false;
				break;
			
			}
			System.out.println("Do you want to continue:  1.Yes 2.No");
			int ans=scanner.nextInt();
			if(ans==1)
				next=true;
			else
				break;
		
			
			
			
			
			
		}while(next);

}

}
