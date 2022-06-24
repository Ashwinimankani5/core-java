class Laptop
{
String brand;
int price;
public static void main(String a[])
{
Laptop lap = new Laptop("Sony", 55000);
System.out.println ("Laptop Brand Name : " +lap.brand);
System.out.println ("Laptop price : " +lap.price);
}
public Laptop(String brand,int price)
{
	this();
this.brand=brand;
this.price=price;
}
public Laptop()
{
System.out.println("laptop constructor is created");
}
}