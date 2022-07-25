package com.xworkz.hospital;

import java.util.Scanner;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.crud.impl.HospitalImpl;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalTester {
	
	
	public static void main(String[] args)         
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre the total no of patients available");
		int size = sc.nextInt();
		Hospital hos = new HospitalImpl(size);
		for(int i= 0; i< size; i++)
		{
		System.out.println(" Entre Patient id");	
		int id = sc.nextInt();
		System.out.println(" Entre Patient name");
		String name = sc.next();
		System.out.println(" Entre Patient address");	
		String address = sc.next();
		System.out.println(" Entre Patient gender");
		String gender = sc.next();
		System.out.println(" Entre Patient contactNo");
		long contactNo = sc.nextLong();
		
		
		
		 PatientDTO dto = new PatientDTO();
		 dto.setId(id);
		 dto.setName(name);
		 dto.setAddress(address);
		 dto.setGender(Gender.valueOf(gender));
		 dto.setContactNo(contactNo);
		 
		 
		 hos.createPatient(dto);
		   }
		  hos.getPatientDetails();
		 
			String option=null;
			do{
				System.out.println("Entre 1 to get Patient details");
				System.out.println("Entre 2 to get updated address of patients by Id");
				System.out.println("Entre 3 to get updated name of patient by id");
				System.out.println("Entre 4 to get updated name of patients by contact no");
				System.out.println("Entre 5 to get deleting patient detils by name");
				System.out.println("Entre 6 to get deleting patient details by id");
				System.out.println("Entre 7 to get all patient details");
				
				int choice =sc.nextInt();
				System.out.println("Entre the choice");
				
				switch(choice){

				case 1 :  hos.getPatientDetails();
							break;
				case 2 : //invoking updated address of patients by Id
		   
						 System.out.println("Entre the patient existing id");
		                 int existingID = sc.nextInt();
		                 System.out.println("Entre the patient updated address");
		                 String updatedAddress = sc.next();
		                 hos.updatedPatientAddressById(existingID,updatedAddress);
		                 
		                 hos.getPatientDetails();
						 break;
				case 3 :    //invoking updated name of patient by id
		   
		                   System.out.println("Entre the patient existing id");
		                   int existingId = sc.nextInt();
		                   System.out.println("Entre the patient updated name");
		                   String updatedName = sc.next();
		                   
		                   hos.updatedPatientNameById(existingId,updatedName);
		                   
		                   hos.getPatientDetails();
							break;
				case 4 :  //invoking updated name of patients by contact no
		   
		                   System.out.println("Entre the patient existing contactno");
		                   long existingContactNo = sc.nextLong();
		                   System.out.println("Entre the patient updated name");
		                   String isUpdatedName = sc.next();
		                   
		                   hos.updatedPatientNameByContactNo(existingContactNo,isUpdatedName);
		                   
		                   hos.getPatientDetails();
							break;
							
				case 5 :  //deleting patient detils by name 
		   
		                  System.out.println("Entre the patient existing name to delete : ");
		                String deleteName = sc.next();
		                hos.deletePatientByName(deleteName);
		                 
		                
			               hos.getPatientDetails();
							break;
				
				case 6 :  	  //deleting patient details by id
		   
		                    System.out.println(" entre the patient existing id to delete : ");
		                  int deleteId = sc.nextInt();
		                  hos.deletePatientById(deleteId);
		                   
		                  
			                 hos.getPatientDetails();  
							break;
				
			    case 7 :  //get all patient details
				     PatientDTO dto = new PatientDTO();
							dto.setId(1);
							dto.setName("SANTU");
						System.out.println(dto);  
					
						PatientDTO dto1=new PatientDTO();
						dto1.setId(2);
						dto1.setName("ashu");
						
						hos.getPatientDetails();
						
							break;      
				default  :  System.out.println("no match found ");
									break;
				} 
				System.out.println(" Doyou want to continue  entre Y/N");
					 option  = sc.next();
					 
				}while(option.equals("Y")); 
	
  sc.close();
  

}



		
	}

