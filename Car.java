class  Car {
	String name;
	String colour;
	
	public void getCarDetails()
	{
		System.out.println("to get car details");
	}
	
	public static void main(String args[])
	{
		Car ca = new Car();
			ca.name = "vista";
		ca.colour = "pink";
		ca.getCarDetails();
		System.out.println("Car name is:" +ca.name);
		System.out.println(" Car colour is:" + ca.colour);
		
	}
	public Car()
	{
		//this.name = name;
		//this.colour = colour;
	
		
	}
	
}