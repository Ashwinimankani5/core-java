package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class BookDTO1 implements Comparable<BookDTO1>{
	
	private int id;
	private String name;
	private double price;
	
	
	@Override
	public int compareTo(BookDTO1 o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
}
