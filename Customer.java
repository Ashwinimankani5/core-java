class Customer
{
	 OrderDTO[] rtd;
	 //= new OrderDTO();//
		 int index;
	 public Customer(int size)
	 {
		 rtd = new OrderDTO[size];
		 System.out.println("Order constant is created");
	 }
	 
	 public boolean makeOrder(OrderDTO xyz)
	 {
		 System.out.println("insideorderis creted");
		 boolean isAdded = false;
		 
		 if(xyz != null && xyz.getAddress() !=null)
		 {
			 rtd[index++]=xyz;
			 isAdded = true;
			 System.out.println("make order of item");
		 }
		 else{
			 System.out.println("no itmes...to order");
		 }
		 return isAdded;
		 
	 }
	 
	 public void getItemDetails()
	 {
		  System.out.println("Item details are created");
		 for(int i=0;i<rtd.length;i++)
		 {
			 System.out.println(rtd[i].getName()  + "  " +rtd[i].getId()  +
			 "  " +rtd[i].getAddress()  + "  " +rtd[i].getPrice()  + "  " );
		 }
	 }
}
