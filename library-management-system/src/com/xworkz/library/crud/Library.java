package com.xworkz.library.crud;

import com.xworkz.library.dto.BookDTO;

public interface Library {
	
	public boolean saveBook(BookDTO dtc);
		
	public void getBookDetails();
	
	public boolean updateBookNameById(int id,String name);
	
	public boolean updateBookPriceByName(String name,double price);
	
	public boolean deleteBookNameById(int id , String name);
}