package com.xworkz.library;

import java.util.Scanner;

import com.xworkz.library.crud.Library;
import com.xworkz.library.crud.LibraryImpl;
import com.xworkz.library.dto.BookDTO;

public class LibraryTester {
	
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre total number of book to be added");
		int size = sc.nextInt();
		
		Library lib = new LibraryImpl(size);
		
		for(int i=0; i<size; i++)
		{
		System.out.println("Entre book name");
		String name = sc.next();
		System.out.println("Entre AuthorName");
		String author = sc.next();
		System.out.println("Enter book id");
		int id  = sc.nextInt();
		System.out.println("Enter book price");
		double price = sc.nextDouble();
		
		BookDTO dtc = new BookDTO();
	     dtc.setAuthor(author);
		dtc.setName(name);
		dtc.setId(id);
		dtc.setPrice(price);
		
		lib.saveBook(dtc);
		}
		lib.getBookDetails();
		
		
			String option= null;
		do{
			System.out.println("Entre 1 to fetch book details");
			System.out.println("Entre 2 for update book name by id");
			System.out.println("Entre 3 for updated price by name");
			System.out.println("Entre 4 for delete name by id");
			System.out.println("Entre 5 for getting all book details");
			int choice = sc.nextInt();
		   System.out.println("Entre the choice");
		
			switch(choice){

				case 1 :  lib.getBookDetails();;
						break;
				case 2 :  //update the name by using id
		
		               System.out.println("Entre the existing id ");
		               int existingId = sc.nextInt();
		               System.out.println("Entre the name to update");
		               String updateName = sc.next();
		               lib.updateBookNameById(existingId,updateName);
		               
		               lib.getBookDetails();;
		               				break;
				
				case 3 : //update the price by using name
						 System.out.println("Entre the Existing name ");
		                String existingName = sc.next();
		                System.out.println("Entre the updating price ");
		                double updatePrice = sc.nextDouble();
		               
		                lib.updateBookPriceByName(existingName,updatePrice);
		                
		                lib.getBookDetails(); 
		                				break;
				case 4 : //delete name by using id
		                 System.out.println("Entre the exsiting id");
		                 int exstingId = sc.nextInt();
		                 System.out.println("Enter the name to delete");
		                 String deleteName = sc.next();
		                 
		                 lib.deleteBookNameById(exstingId,deleteName);
		                 lib.getBookDetails(); 
						    break;
				case 5 :  //get all book details
						BookDTO dtc = new BookDTO();
	                     dtc.setAuthor("author");
		                 dtc.setName("name");
		                 dtc.setId(1);
		                 dtc.setPrice(400);
						break;
				
				default  : System.out.println("No match found");
						break;
			}
			System.out.println(" Doyou want to continue  entre Y/N");
			 option  = sc.next();
		}while(option.equals("Y"));     
		
		sc.close();
	}
}
