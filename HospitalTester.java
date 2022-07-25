import java.util.Scanner;

class HospitalTester
{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the no of patients available");
	int size = sc.nextInt();
	
	Hospital hos = new Hospital1Impl();
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
	dto.setGender(Gender.male);
	dto.setContactNo(contactNo);
	
	hos.createPatient(dto);
   }
/*   hos.getPatientDetails();
 
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
			//	System.out.println("the hashcode for patient is "+uniqueNumber1);
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
		  */
	
	/*	PatientDTO dto1 = new PatientDTO();
	 
	dto1.setId(7647);
	dto1.setName("prakruti");
	dto1.setAddress("Bilagi");
	dto1.setGender(Gender.female);
	dto1.setContactNo(8147542581L);
	hos.createPatient(dto1);
	
			 PatientDTO dto4 = new PatientDTO();
	 
	dto4.setId(3387);
	dto4.setName("prabhas");
	dto4.setAddress("navanagar");
	dto4.setGender(Gender.male);
	dto4.setContactNo(4875128951L);
	hos.createPatient(dto4);
			 PatientDTO dto2 = new PatientDTO();
	 
	dto2.setId(9748);
	dto2.setName("ramleela");
	dto2.setAddress("Banglore");
	dto2.setGender(Gender.Transgender);
	dto2.setContactNo(6684572159L);
	hos.createPatient(dto2);
			 PatientDTO dto3 = new PatientDTO();
	 
	dto3.setId(8748);
	dto3.setName("padmavati");
	dto3.setAddress("belagum");
	dto3.setGender(Gender.female);
	dto3.setContactNo(7487261957L);
	hos.createPatient(dto3);
	
	
	System.out.println(dto.getId()+ "  "  + dto.getName()+ "  "   +dto.getAddress()+ "  "    +dto.getGender()+ "  "   + dto.getContactNo());
	System.out.println(dto1.getId()+ "  "  + dto1.getName()+ "  "   +dto1.getAddress()+ "  "    +dto1.getGender()+ "  "   + dto1.getContactNo());
	System.out.println(dto2.getId()+ "  "  + dto2.getName()+ "  "   +dto2.getAddress()+ "  "    +dto2.getGender()+ "  "   + dto2.getContactNo());
	System.out.println(dto3.getId()+ "  "  + dto3.getName()+ "  "   +dto3.getAddress()+ "  "    +dto3.getGender()+ "  "   + dto3.getContactNo());
	System.out.println(dto4.getId()+ "  "  + dto4.getName()+ "  "   +dto4.getAddress()+ "  "    +dto4.getGender()+ "  "   + dto4.getContactNo());
	*/
	}


	


}