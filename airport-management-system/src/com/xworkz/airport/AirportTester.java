package com.xworkz.airport;

import java.util.Scanner;

import com.xworkz.airport.crud.impl.Airport;
import com.xworkz.airport.crud.impl.Airport1Impl;
import com.xworkz.airport.dto.TerminalsDTO;

public class AirportTester {
			
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of terminals");
		int size = sc.nextInt();

		Airport air = new Airport1Impl(size);
		for(int i=0; i<size; i++)
		{
				
		System.out.println("Entre id of terminal");
		int id = sc.nextInt();
		System.out.println("Entre terminal name");
		String name = sc.next();
		
		TerminalsDTO abc = new TerminalsDTO();

		
		abc.setId(id);
		abc.setName(name);
		
		air.creatTerminals(abc);
		
		//air.getTerminal();
		}
		air.getTerminalDetail();
		
			String option= null;
		do{
			System.out.println("Entre 1 to fetch terminals details");
			System.out.println("Entre 2 for update book name by id");
			System.out.println("Entre 3 for delete name by id");
			System.out.println("Entre 4 for getting all book details");
			int choice = sc.nextInt();
		   System.out.println("Entre the choice");
		
			switch(choice){

				case 1 : air.getTerminalDetail(); 
						break;
		
				case 2 : //change name by id
		
		                System.out.println("Entre the id of the terminal");
		                int existingId = sc.nextInt();
		                System.out.println("Entre the name to update");
		                String updateName = sc.next();
	                    
		                air.updateTerminalNameById(existingId,updateName);
		                
		                air.getTerminalDetail();
						break;
		
				case 3 : //delete name by id
		                 System.out.println("Entre the existing id");
		                 int exstingId = sc.nextInt();
		                 System.out.println("Entre the name to delete");
		                 String deleteName = sc.next();
		                 air.deleteTerminalById(exstingId,deleteName);
		                 
		                 air.getTerminalDetail();
						break;
				case 4 :  TerminalsDTO abc = new TerminalsDTO();
							abc.setId(1);
							abc.setName("name");
							System.out.println(abc);
						break;
				default :System.out.println("No match found");
						break;
			}
			System.out.println(" Doyou want to continue  entre Y/N");
			 option  = sc.next();
		}while(option.equals("Y"));  
		sc.close();
	}
		
}
