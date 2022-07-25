class Airport12{
	String name="Abc";
	String location="Bengaluru";
	
	public  void getDetalies(){
	System.out.println("  to get the information about airport");
	}
   public static void main(String a[]){
	   Airport12 air = new Airport12();
   air.getDetalies();
   System.out.println("airport name is:"+air.name);
    System.out.println("airport location is:"+air.location);
   }
}