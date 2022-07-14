class TerminalsDTO
{
	public TerminalsDTO()
	{
		System.out.println("terminal is created");
	}
	
	int id;
	String name;

	
	//getter and setter method
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String Name)
	{
		this.name = name;
	}
}