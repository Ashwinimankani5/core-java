package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDTO {
	
	private int id;
	private String name;
	private String authorName;
	private int price;
	
	
	@Override
	public String toString() {
		return "BookDTO [name=" + name + ", authorName=" + authorName + ", price=" + price + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
