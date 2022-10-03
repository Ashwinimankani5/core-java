package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDTO implements Comparable<OrderDTO> {
	
	private int id;
	private String name;
	private String type;
	private double price;
	
	@Override
	public int compareTo(OrderDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
