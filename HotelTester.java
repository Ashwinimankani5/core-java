import java.util.Scanner;

class HotelTester
{	 
	public static void main(String args[])
	{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter total number of orders");
	int size = sc.nextInt();

	Hotel hot = new Hotel(size);
	for(int i=0; i<size; i++)
	{
		System.out.println("Entre order name");
		String name = sc.next();
		System.out.println("Entre id of the item"); 
		int id = sc.nextInt();
		System.out.println("Enter price of the item");
		double price = sc.nextDouble();
		
		
		FoodDTO order = new FoodDTO();
		
		order.setName(name);
		order.setId(id);
		order.setPrice(price);
		
		hot.makeOrder(order);
	}
		hot.getItemDetails();
	}
}