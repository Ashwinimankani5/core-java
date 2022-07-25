package com.xworkz.customer;

import java.util.Scanner;

import com.xworkz.customer.crud.Customer;
import com.xworkz.customer.crud.Customer1Impl;
import com.xworkz.dto.OrderDTO;

public class CustomerTester {
	
	 
	public static void main(String args[])
	{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter total number of orders");
	int size = sc.nextInt();

	Customer cus = new Customer1Impl(size);
	for(int i=0; i<size; i++)
	{
		System.out.println("Entre order name");
		String name = sc.next();
		System.out.println("Entre quantity of the item"); 
		int quantity = sc.nextInt();
		System.out.println("Entre id of the item"); 
		int id = sc.nextInt();
		System.out.println("Enter the type");
		String type = sc.next();
		System.out.println("Enter price of the item");
		double price = sc.nextDouble();
		
		
		OrderDTO order = new OrderDTO();
		
		order.setName(name);
		order.setQuantity(quantity);
		order.setId(id);
		order.setType(type);
		order.setPrice(price);
		
		cus.makeOrder(order);
	}
		cus.getItemDetails();
		
		//update name by id
		
		System.out.println("Entre the existing id");
		int existingId =sc.nextInt();
		System.out.println("Entre the updated name");
		String updateName = sc.next();
		cus.updateOrderNameById(existingId,updateName);
		
		cus.getItemDetails();
		
		//update type by name
		
		System.out.println("Entre the existing id");
		String existingName =sc.next();
		System.out.println("Entre the updated name");
		String updateType = sc.next();
		cus.updateOrderTypeByName(existingName,updateType);
		
		cus.getItemDetails();
		
		
			//delete name by id
		
		System.out.println("Entre the existing id");
		int exstingId =sc.nextInt();
		System.out.println("Entre the name to delete ");
		String deleteName = sc.next();
		cus.deleteOrderNameById(exstingId,deleteName);
		
		cus.getItemDetails();
		
	  String option = null;  
		do{
			System.out.println("Entre 1 to get item details");
			System.out.println("Entre 2 to get updated OrderName By Id");
			System.out.println("Entre 3 to get update OrderType By Name");
			System.out.println("Entre 4 to get delete OrderName By Id");
			
			int choice = sc.nextInt();
			System.out.println("Entre the choice");
			switch(choice){
				
				case 1 : cus.getItemDetails();
							break;
				case 2 :// update order name by id
						 System.out.println("Entre the existing id");
		                 int existingId1 =sc.nextInt();
		                 System.out.println("Entre the updated name");
		                 String updateName1 = sc.next();
		                 cus.updateOrderNameById(existingId1,updateName1);
						 cus.getItemDetails();
						 break;
				case 3 : //update order type by name
						 System.out.println("Entre the existing id");
		                 String existingName1 =sc.next();
		                 System.out.println("Entre the updated name");
		                 String updateType1 = sc.next();
		                 cus.updateOrderTypeByName(existingName1,updateType1);
						 cus.getItemDetails();
						 break;
				case 4 : //delete order name by id
						 System.out.println("Entre the existing id");
		                 int exstingId2 =sc.nextInt();
		                 System.out.println("Entre the name to delete ");
		                 String deleteName1 = sc.next();
		                 cus.deleteOrderNameById(exstingId2,deleteName1);
						 cus.getItemDetails();
						 break;
			
				default : 
		                 		System.out.println("no match found");
								break;
								
			}
			
			System.out.println("Do you want to continue press Y/N");
			option = sc.next();
		}while(option.equals("Y"));
		   
		
		
		
		
		
		
		
		
		
		sc.close();
	
	}

}
