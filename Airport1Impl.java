class Airport1Impl extends AirportImpl{
	
	TerminalsDTO[] c;

	int index;
	
public Airport1Impl(int size)
{
	c = new TerminalsDTO[size];
	System.out.println("Airport constact is created");
}

@Override
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

@Override
public void getTerminalDetail()	
{
	System.out.println("terminals need details");
	for(int i=0; i<c.length; i++)
	{
		System.out.println(c[i].getId()+ "  " + c[i].getName()+ "   " );
	}
}

@Override
public boolean updateTerminalNameById(int id,String name)
{
	System.out.println("inside updateTerminalNameById()");
	boolean updateName = false;
	for(int i=0; i<c.length; i++)
	{
		if(c[i].getId()==id)
		{
			c[i].setName(name);
		updateName = true;
		System.out.println("Entre the terminal name to update");
		}
	else
	{
		System.out.println("No match found to update name");
	}
	
}
return updateName;
}

@Override
public boolean deleteTerminalById(int id,String name)
{
	System.out.println("inside the deleteTerminalById()");
	boolean  deleteName = false;
	int i,j;
	for(i=0,j=0; j<c.length; j++)
	{
		if(!(c[j].getId()== id))
		{
			c[i++] =c[j];
			deleteName = true;
			System.out.println("Entre name to delete");
		}
		else
		{
			System.out.println("no match found");
		}
	
	
	}
	c = Arrays.copyOf(c,i);
	return deleteName;
}
}
