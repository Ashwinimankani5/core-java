package com.xworkz.library.crud;

import java.util.Arrays;

import com.xworkz.library.dto.BookDTO;

public class LibraryImpl implements Library {
		
	BookDTO[] d;// new BookDTO[];

	int index;
//	@override
	public LibraryImpl(int size)
	{
		d = new BookDTO[size];
	System.out.println("libraby constant is created");
	}
	
	@Override
	public boolean saveBook(BookDTO dtc)
		{
			System.out.println("inside this books are stored");
			
			boolean isAdded = false;
					
			if(dtc != null && dtc.getName() != null)
			{	
				d[index++] = dtc;
				//this.d = dtc;
				isAdded = true;
			}
			else{
				System.out.println("no books are added");
				}
			return isAdded;
		}
	
	@Override
	public void getBookDetails()
	{
		System.out.println("Storage get book details");
		for(int i=0; i<d.length;i++) 
		{
			System.out.println(d[i].getName()+ "  " + d[i].getAuthor()+ "  " + d[i].getId()+ "  " + d[i].getPrice()+ " " );
		}
	}
	
	public boolean updateBookNameById(int id,String name)
	{
		System.out.println("inside updateBookNameById()");
		boolean updateName = false;
		for(int i=0; i<d.length; i++)
		{
			if(d[i].getId()==id)
			{   d[i].setName(name);
				System.out.println("Entre the name to update");
				updateName = true;
			}
			else
			{
				System.out.println("no match found to update name");
			}
			
		}
		return updateName;
	}
	
	public boolean updateBookPriceByName(String name,double price)
	{
		System.out.println("inside updateBookNameById()");
		boolean updatePrice = false;
		for(int i=0; i<d.length; i++)
		{
			if(d[i].getName()==name)
			{   d[i].setPrice(price);
				System.out.println("Entre the price to update");
				updatePrice = true;
			}
			else
			{
				System.out.println("no match found to update name");
			}
			
		}
		return updatePrice;
	}
	
	
	public boolean deleteBookNameById(int id , String name)
	{
		System.out.println("inside deleteBookNameById()");
		boolean deleteName = false;
		int i,j;
		for(i=0,j=0; i<d.length; i++)
		{
			if(!(d[i].getId()==id))
			{
				d[i++] = d[j];
				deleteName = true;
				System.out.println("");
			}
			else
			{
				System.out.println("no match found to delete");
			}
		}
		d = Arrays.copyOf(d,i);
		return deleteName;
	}
	
	
}
