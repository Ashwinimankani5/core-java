class Fruits
{
	String name;
	int price;

	public Fruits (){
		this.provideNutrition(); 
		System.out.println("The Fruit Object is created");
	}

	public static  void provideNutrition(){ 
	System.out.println("Helps us to get Nutrition");
	} 


	public Fruits(String name ,int price){
	this(); 
	this.name = name ; 
	this.price = price ;
	}

	public static void main(String a[])
	{
	Fruits f = new Fruits("Mango",600); 
	System.out.println(f.name +" " +f.price);

	}
}