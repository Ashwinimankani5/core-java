class Mobile{

	  String brandName;
      String colour;
      int cost;
	 public Mobile(){
		 System.out.println(" Mobile1 object is created ");
	 }

	 public Mobile( String brandName, String colour,int cost)
	 {
		this();
		   this.brandName = brandName;
		   this.colour = colour;
		   this.cost = cost;	 
	 }

	 public static void main (String m[])
	 {
		 Mobile mob = new Mobile("Redmi","Black",10000);
		 System.out.println(" Mobile Brand name is " + "" + mob.brandName + "" + " and color is " + "" + mob.colour + "" + " it costs " + "" + mob.cost);
	 }
}