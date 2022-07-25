package com.xworkz.hotel;

import java.util.Scanner;

import com.xworkz.hotel.crud.impl.Hotel;
import com.xworkz.hotel.crud.impl.HotelImpl;
import com.xworkz.hotel.dto.FoodDTO;

public class HotelTester {
  
	public static void main(String args[])
	{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter total number of orders");
	int size = sc.nextInt();

	Hotel hot = new HotelImpl(size);
	for(int i=0; i<size; i++)
	{
		System.out.println("Entre order name");
		String name = sc.next();
		System.out.println("Entre order type");
		String type = sc.next();
		System.out.println("Entre id of the item"); 
		int id = sc.nextInt();
		System.out.println("Enter price of the item");
		double price = sc.nextDouble();
		
		
		FoodDTO order = new FoodDTO();
		
		order.setName(name);
		order.setType(type);
		order.setId(id);
		order.setPrice(price);
		
		hot.makeOrder();
	}
	//	hot.getItemDetails();
		

		//update name by id
		
		System.out.println("Entre the existing id");
		int existingId =sc.nextInt();
		System.out.println("Entre the updated name");
		String updateName = sc.next();
		hot.updateOrderNameById(existingId,updateName);
		
		hot.getItemDetails();
		
		
		//update order price by type
		
		System.out.println("Entre the existing id");
		String exstingType =sc.next();
		System.out.println("Entre the updated name");
		double updatePrice = sc.nextDouble();
		hot.updateOrderPriceByType(exstingType,updatePrice);
		
		hot.getItemDetails();
		
			//delete name by id
		
		System.out.println("Entre the existing id");
		int exstingId =sc.nextInt();
		System.out.println("Entre the name to delete ");
		String deleteName = sc.next();
		hot.deleteOrderNameById(exstingId,deleteName);
		
		hot.getItemDetails();
		
		//delete order by type
		
		System.out.println("Entre the existing type to delete");
		String deleteType = sc.next();
		hot.deleteOrderByType(deleteType);
		
		hot.getItemDetails();
		
		String option= null;
		do{
			System.out.println("Entre 1 to fetch food details");
			System.out.println("Entre 2 for updated name by id");
			System.out.println("Entre 3 for updated price by type");
			System.out.println("Entre 4 for delete name by id");
			System.out.println("Entre 5 for delete order by type");
			System.out.println("Entre 6 for getting all food details");
			int choice = sc.nextInt();
		   System.out.println("Entre the choice");
		
			switch(choice){

				case 1 :hot.getItemDetails();
						break;
				case 2 ://update name by id
						System.out.println("Entre the existing id");
						int existId =sc.nextInt();
						System.out.println("Entre the updated name");
						String updateName1 = sc.next();
						hot.updateOrderNameById(existId,updateName1);
						hot.getItemDetails();
						break;
				case 3 ://update order price by type
						System.out.println("Entre the existing type");
						String existingType =sc.next();
						System.out.println("Entre the updated name");
						double updatePrice1 = sc.nextDouble();
						hot.updateOrderPriceByType(existingType, updatePrice1);
						hot.getItemDetails();
						break;

				case 4 ://delete name by id
						System.out.println("Entre the existing id");
						int existsId =sc.nextInt();
						System.out.println("Entre the name to delete ");
						String deletName = sc.next();
						hot.deleteOrderNameById(existsId,deletName);
						hot.getItemDetails();
							 break;
				case 5 ://delete order by type
						System.out.println("Entre the existing type");
						String existingType1 =sc.next();
						System.out.println("Entre the name to delete ");
					
						hot.deleteOrderByType(existingType1);
						hot.getItemDetails();
							 break;
				case 6 : //get all food detail
						FoodDTO order = new FoodDTO();
                          order.setName("order");
                          order.setType("veg");
                          order.setId(1);
                          order.setPrice(50);
                          System.out.println(order);
						  hot.getItemDetails();
						  break;
				default :System.out.println("No match found");
						break;
			}
			System.out.println(" Doyou want to continue  entre Y/N");
			 option  = sc.next();
		}while(option.equals("Y"));     
	}
}
