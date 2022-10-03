package com.xworkz.hotel.dto;

public class FoodDTO {
	private String name;
	private String type;
	private int id;
	private double price;
	
	
	@Override
	public int hashCode()
	{
	return this.id;
	}
	
	public FoodDTO()
	{
		System.out.println("customer order is created");
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
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
	
	@Override
	public String toString()
	{
		return "FoodDTO : name ="+this.name +",type = " +this.type+ ",Id = :"+this.id +",price = "+this.price+"]";
	}

}
