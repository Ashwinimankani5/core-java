package com.xworkz.hotel.crud.impl;

import java.util.Arrays;

import com.xworkz.hotel.dto.FoodDTO;

public  class  HotelImpl implements Hotel {

	 FoodDTO[] rtd;

		 int index;
	
	 public HotelImpl(int size)
	 {
		 rtd = new FoodDTO[size];
		 System.out.println("Order constant is created");
	 }
	 public boolean makeOrder(FoodDTO xyz)
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
	 @Override
	 public void getItemDetails()
	 {
		  System.out.println("Item details are created");
		 for(int i=0;i<rtd.length;i++)
		 {
			 System.out.println(rtd[i].getName() + "   " +rtd[i].getType() + "  " +rtd[i].getId()  +
			 "  " +rtd[i].getPrice()  + "  " );
		 }
	 }
	 @Override
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
	  @Override
	  public boolean updateOrderPriceByType(String type,double price)
	 {
		 System.out.println("inside updateOrderNameById()");
		 boolean updatePrice = false;
		 for(int i=0; i<rtd.length ; i++)
		 {
			 if(rtd[i].getType() == type)
			 {
				 rtd[i].setPrice(price);
			 updatePrice = true;
			 System.out.println("Entre the updated food price");
			 }
		 else 
		 {
			 System.out.println("no match found to update");
		 }
	 }
	  return updatePrice;
	 }
	// updateOrderPriceByName
	 @Override
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
			 System.out.println("no match found to update");
			}
		}
	  return deleteName;
	 }
	 @Override
	 public boolean deleteOrderByType(String type)
	 {
		 System.out.println("inside deleteOrderNameById()");
		 boolean deleteType = false;
		 int i,j;
		 for(i=0,j=0; j<rtd.length ; j++)
		 {
			 if(!(rtd[i].getType() == type))
			 {
				 rtd[i++] = rtd[j];
			 deleteType = true;
			 System.out.println(" Entre order to delete");
			}
			else 
			{
			 System.out.println("no match found to update");
			}
		}
  rtd = Arrays.copyOf(rtd,i);
	  return deleteType;
}
	@Override
	public boolean makeOrder() {
		// TODO Auto-generated method stub
		return false;
	}


}
