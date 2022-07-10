import java.util.Scanner;

class CustomerTester
{	 
	public static void main(String args[])
	{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter total number of orders");
	int size = sc.nextInt();

	Customer cus = new Customer(size);
	for(int i=0; i<size; i++)
	{
		System.out.println("Entre order name");
		String name = sc.next();
		System.out.println("Entre id of the item"); 
		int id = sc.nextInt();
		System.out.println("Enter the address");
		String address = sc.next();
		System.out.println("Enter price of the item");
		double price = sc.nextDouble();
		
		
		OrderDTO order = new OrderDTO();
		
		order.setName(name);
		order.setId(id);
		order.setAddress(address);
		order.setPrice(price);
		
		cus.makeOrder(order);
	}
		cus.getItemDetails();
	}
}