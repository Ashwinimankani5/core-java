class CarryBagTester
{

	public static void main(String args[])
	{
		
	
	CarryBag carry = new CarryBag();
	//	carry.name  = "Sheetal";
	//	carry.price = 1.50;
	//	carry.holding();
	//this type of referance variable is not used in private class	
	//setter type is used in public class
	
	carry.setName("Sheetal");
	carry.setPrice(1.50);
	carry.holdThings();
	
	System.out.println(carry.getName() + "  " + carry.getPrice() + "    " );
	
	
		
	}

	

}