class PatientTester
{
		public static void main(String args[])
		{
			
		
		PatientDTO dto = new PatientDTO();
		//object dto = new PatientDTO();
		dto.setId(1);
		dto.setName("SANTU");
	System.out.println(dto);    // implicite invoke of toString method
	int uniqueNumber = dto.hashCode();
		System.out.println("the hashCode for patient is " + uniqueNumber);
			PatientDTO dto1=new PatientDTO();
			dto1.setId(2);
			dto1.setName("ashu");
		System.out.println(dto1);
int uniqueNumber1=dto1.hashCode();
	System.out.println("the hashcode for patient is "+uniqueNumber1);
		//	System.out.println(dto.toString());      // explicite type of invoke of toString method
		}

}