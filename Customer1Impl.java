import java.util.Arrays;

class Customer1Impl implements Customer
{
	 OrderDTO[] rtd;
	 //= new OrderDTO();//
		 int index;
/*	 public Customer(int size)
	 {
		 rtd = new OrderDTO[size];
		 System.out.println("Order constant is created");
	 }
	 */
	 public boolean makeOrder(OrderDTO xyz)
	 {
		 System.out.println("insideorderis creted");
		 boolean isAdded = false;
		 
		 if(xyz != null && xyz.getName() !=null)
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
			 System.out.println(rtd[i]);
		 }
	 }
	 

	 
	 
	 public boolean updateOrderNameById(int id,String name)
	 {
		 System.out.println("inside updateOrderNameById()");
		 boolean updateName = false;
		 for(int i=0; i<rtd.length ; i++)
		 {
			 if(rtd[i].getId() == id)
			 {
				 rtd[i].setName(name);
			 updateName = true;
			 System.out.println("");
			 }
		 else 
		 {
			 System.out.println("no match found to update");
		 }
	 }
	  return updateName;
	 }
	 
	 public boolean updateOrderTypeByName(String name,String type)
	 {
		 System.out.println("inside updateOrderTypeById()");
		 boolean updateType = false;
		 for(int i=0; i<rtd.length ; i++)
		 {
			 if(rtd[i].getName().equals(name))
			 {
				 rtd[i].setType(type);
			 updateType = true;
			 System.out.println("");
			 }
		 else 
		 {
			 System.out.println("no match found to update");
		 }
	 }
	  return updateType;
	 }
	 
	 public boolean deleteOrderNameById(int id,String name)
	 {
		 System.out.println("inside deleteOrderNameById()");
		 boolean deleteName = false;
		 int i,j;
		 for(i=0,j=0; j<rtd.length ; j++)
		 {
			 if(!(rtd[i].getId() == id))
			 {
				 rtd[i++] = rtd[j];
			 deleteName = true;
			 System.out.println("");
			}
			else 
			{
			 System.out.println(" ");
			}
		}
	 rtd = Arrays.copyOf(rtd,i);
	  return deleteName;
	 }
	 
	 
}
