import java.util.Arrays;

class Hospital
{
	//has many patients
	PatientDTO[] dto;// = new PatientDTO[1];	

	//instance variable
	int index;
	
	public Hospital(int size)
	{
		dto = new PatientDTO[size];
		System.out.println("Hospital constant is created");
	}
	
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
	public void getPatientDetails()
	{
		System.out.println("hospital get the details of patient");
			 for(int  i=0; i<dto.length;i++)
			 {
				 System.out.println(dto[i].getId()+ "  " +dto[i].getName() + "  " +dto[i].getAddress() 
				 /*+ "  " +dto[i].getGender() */+ " " +dto[i].getContactNo()+ "  ");
			 }
	}
	
/*	public boolean updatedPatientAddressById(int id, String address)
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
	}        */
	
	public boolean deletePatientByName(String name)
	{
		System.out.println("inside deletePatientNameById()");
		boolean deleteName = false;
		int i,j;
		for( i=0,j=0; j<dto.length; j++)
		{
			if(!dto[j].getName().equals(name)){		
				//dto[i] = null;
			dto[i++]  = dto[j];
			deleteName= true;
			}
			
				else {
					System.out.println("No match found");
				}
	}
			dto = Arrays.copyOf(dto,i);
	return deleteName;
	}
	
/*	public boolean deletePatientById(int id)
	{
		System.out.println("inside deletePatientNameById()");
		boolean deleteId = false;
		for(int i=0; i<dto.length; i++)
		{
			if(dto[i].getId().equals(id)){		
				dto[i].getId()=null;
			deleteId = true;
			System.out.println("Patient id got deleted");
		}
		else{
			System.out.println("no match found to delete");
		}
		
	}
	return deleteId; 
	}    */
}