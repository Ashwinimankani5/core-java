package com.xworkz.hotel.crud.impl;

public interface Hotel {
		
	 public boolean makeOrder();
	 public void getItemDetails();
	 public boolean updateOrderNameById(int id,String name);
	 public boolean updateOrderPriceByType(String type,double price);
	 public boolean deleteOrderNameById(int id,String name);
	 public boolean deleteOrderByType(String type);
	 
}