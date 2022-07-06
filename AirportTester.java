class AirportTester
{
	
	public static void main(String args[])
	{
		
	
	Airport air = new Airport();
	
	air.setName("Calcutta");
	air.setAddress("delhi");
	air.setIdno(42581);
	air.aeroplane();
	
	System.out.println(air.getName() + "  " +air.getAddress() + "    " +air.getIdno());
	
	
		
	}





}