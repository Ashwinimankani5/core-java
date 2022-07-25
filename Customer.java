interface Customer 
{
		
	 public boolean makeOrder(OrderDTO xyz);
	 public void getItemDetails();
	 public boolean updateOrderNameById(int id,String name);
	 public boolean updateOrderTypeByName(String name,String type);
	 public boolean deleteOrderNameById(int id,String name);
	 
}