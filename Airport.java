public class Airport
{
	
	public Airport()
	{
	}

	private String name;
	private String address;
	private int idno;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public int getIdno()
	{
		return idno;
	}
	public void setIdno(int idno)
	{
		this.idno = idno;
	}
	
	
	public void aeroplane()
	{
		System.out.println("to fly....");
	}
	
}