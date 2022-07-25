package com.xworkz.hospital.crud.impl;

import java.util.Arrays;

import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.dto.PatientDTO;


public class HospitalImpl implements Hospital {
	//has many patients
		PatientDTO[] dto;// = new PatientDTO[1];	

		//instance variable
		int index;

		public HospitalImpl(int size)
		{
			dto = new PatientDTO[size];
			System.out.println("Hospital constant is created");
		}
		@Override
		public boolean createPatient(PatientDTO dto)
		{
			System.out.println("inside create patient");	
			boolean isAdded = false;
			if(dto != null && dto.getName() != null)
			{
				this.dto[index++]  = dto;
				//index++;
				isAdded = true;
			}
			else {
				 System.out.println("can not add patient details");
			}
			return isAdded;
		}
		@Override
		public void getPatientDetails()
		{
			System.out.println("hospital get the details of patient");
				 for(int  i=0; i<dto.length;i++)
				 {
					 System.out.println(dto[i].getId()+ "  " +dto[i].getName() + "  " +dto[i].getAddress() 
					 + "  " +dto[i].getGender() + " " +dto[i].getContactNo()+ "  ");
				 }
		}
		@Override
		public boolean updatedPatientAddressById(int id, String address)
		{
			System.out.println("inside PatientUpdatedAddressById()");
				boolean updatedAddress = false;
			
				for(int i=0; i<dto.length; i++)
				{
					if(dto[i].getId() == id){
					dto[i].setAddress(address);
					updatedAddress = true;
					System.out.println("updated patient address is");
					}
					else{
						System.out.println("no match found to update");
					}
				
				}
				return updatedAddress;
			
		}
		@Override
			public boolean updatedPatientNameById(int id, String name)
		{
			System.out.println("inside updatedPatientNameById()");
				boolean updatedName = false;
			
				for(int i=0; i<dto.length; i++)
				{
					if(dto[i].getId() == id){
					dto[i].setName(name);
					updatedName = true;
					System.out.println("updated patient name is");
					}
					else{
						System.out.println("no match found to update name");
					}
				
				}
				return updatedName;
			
		}
		@Override
				public boolean updatedPatientNameByContactNo(long contactNo, String name)
		{
			System.out.println("inside UpdatedPatientNameByContactNo()");
				boolean isUpdatedName = false;
			
				for(int i=0; i<dto.length; i++)
				{
					if(dto[i].getContactNo() == contactNo){
					dto[i].setName(name);
					isUpdatedName = true;
					System.out.println("updated patient name is");
					}
					else{
						System.out.println("no match found to update name");
					}
				
				}
				return isUpdatedName;
		}        
		@Override
		public boolean deletePatientByName(String name)
		{
			System.out.println("inside deletePatientNameById()");
			boolean deleteName = false;
			int i,j;
			for( i=0,j=0; j<dto.length; j++)
			{// harshit.equals ignore case(name)
				if(!dto[j].getName().equals(name)){		
					//dto[i] = null;
				dto[i++]  = dto[j];
				deleteName= true;
				}
				
					else {
						System.out.println("");
					}
		}
				dto = Arrays.copyOf(dto,i);
		return deleteName;
		}
		@Override
		public boolean deletePatientById(int id)
		{
			System.out.println("inside deletePatientNameById()");
			boolean deleteId = false;
			int i,j;
			for( i=0,j=0; j<dto.length; j++)
			{
				if(!(dto[j].getId()==id)){		
					dto[i++]  = dto[j];
				
				deleteId = true;
		
			}
			else{
				System.out.println("no match found to delete");
			}
			
		}
		dto = Arrays.copyOf(dto,i);
		return deleteId; 
		}   

}
