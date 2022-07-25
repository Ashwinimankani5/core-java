package com.xworkz.library.dto;

public class BookDTO {
	
	 
	public BookDTO()
	{
		System.out.println("Book details are created");
	}

	private	String name;
	private	String author;
	private int    id;
	private double   price;

	//getter and setter method
	
	public String getName()
	{
		return name;
	}
	public void setName(String Name)
	{
		this.name = name;
	}

	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String Author)
	{
		this.author = author;
	}
	
		public int getId()
	{
		return id;
	}
	public void setId(int Id)
	{
		this.id = id;
	}
	
		public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;

		}

}
