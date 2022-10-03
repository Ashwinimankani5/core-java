package com.xworkz.general;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {
		
//	
//	
//	HashSet ha = new HashSet();
//	ha.add("b");
//	ha.add("g");
//	ha.add("w");
//	ha.add("a");
//	ha.add("null");
//	ha.add("5");
//	//System.out.println(ha);
//	ha.forEach(System.out::println);
	
	

	Set ha1 = new LinkedHashSet();
	ha1.add("b");
	ha1.add("g");
	ha1.add("w");
	ha1.add("a");
	ha1.add("null");
	ha1.add("5");
	//System.out.println(ha);
	ha1.forEach(System.out::println);
	
	
	}
}
