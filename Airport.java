class Airport
{
	TerminalsDTO[] c;// = new Terminals[];

		int index;
		
	public Airport(int size)
	{
		c = new TerminalsDTO[size];
		System.out.println("Airport constact is created");
	}
	public boolean creatTerminals(TerminalsDTO abc)
	{
		System.out.println("inside the terminal");
		boolean isConnected = false;
		if(abc != null && abc.getName() != null)
		{
			c[index++]=abc ;
			isConnected = true;
			
		}
		else{
			System.out.println("no terminals are created");
		}
		
		return isConnected;
	}
	public void getTerminalDetail()	
	{
		System.out.println("terminals need details");
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i].getId()+ "  " + c[i].getName()+ "   " );
		}
	}
}