public class MusicPlayer
{
	
	public MusicPlayer()
	{
		
	}
	//to achive encapsulation//
	
	private String name;
	private String colour;
	private  double price;
	
	//getter and setter
	
	public String getName()
	{
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getColour()
	{
		return colour;
	}
	public void setColour(String name){
		this.colour = colour;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	
	public void playMusic()
	{
		System.out.println("songs....");
	}
	
}