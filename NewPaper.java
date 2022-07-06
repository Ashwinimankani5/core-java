public class NewsPaper
{
	
	public NewsPaper()
	{
	}

	private String name;
	private String authorName;
	private int Price;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	
	public void headline()
	{
		System.out.println("Good Morning....");
	}
	
}