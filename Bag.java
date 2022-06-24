class Bag{
       String name;
	   int price;
	 
	   public Bag(){
	   this("safari",500);

	   System.out.println("The bag object is created");}

	   public Bag(String name, int price)
	   {

	      this.name = name;
		  this.price = price;
		  
	   }

	   public static void main(String a[]){

	     Bag bag = new Bag();
		 System.out.println("The brand name of the bag is "+bag.name +" The price of the bag is "+bag.price);

	   }
}