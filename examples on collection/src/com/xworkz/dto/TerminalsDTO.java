package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TerminalsDTO implements Comparable<TerminalsDTO>{
	
	private int id;
	private String name;
	
	
	@Override
	public int compareTo(TerminalsDTO o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

}
