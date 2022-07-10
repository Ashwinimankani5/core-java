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
}