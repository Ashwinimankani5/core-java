import java.util.Scanner;


class HospitalTester
{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the no of patients available");
	int size = sc.nextInt();
	
	Hospital hos = new Hospital(size);
	for(int i= 0; i< size; i++)
	{
	System.out.println(" Entre Patient id");	
	int id = sc.nextInt();
	System.out.println(" Entre Patient name");
	String name = sc.next();
	System.out.println(" Entre Patient address");	
	String address = sc.next();
	System.out.println(" Entre Patient contactNo");
	long contactNo = sc.nextLong();
	  
	 PatientDTO dto = new PatientDTO();
	 
	dto.setId(id);
	dto.setName(name);
	dto.setAddress(address);
	//dto.setGender(Gender.male);
	dto.setContactNo(contactNo);
	
	hos.createPatient(dto);
   }
   hos.getPatientDetails();
	
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