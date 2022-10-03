package com.xworkz.dto;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTester {

	public static void main(String[] args) {
		
		
		BookDTO1 dto = new BookDTO1(2 ," dffddf" ,  888455);
		BookDTO1 dto1 = new BookDTO1(1 ,"dfweww" , 778898);

		ArrayList li = new ArrayList();
		li.add(dto);
		li.add(dto1);
		
	
		Collections.sort(li);
		li.forEach(System.out::println);
		
		System.out.println("    ");
		
		TerminalsDTO dto2 = new TerminalsDTO(2 ," ertyu");
		TerminalsDTO dto3 = new TerminalsDTO(1 ,"ertkkl");

		ArrayList list = new ArrayList();
		list.add(dto2);
		list.add(dto3);
		
	
		Collections.sort(list);
		list.forEach(System.out::println);
		
		System.out.println("    ");
		
		OrderDTO dto4 = new OrderDTO(2 ,"Idli","veg",30.00);
		OrderDTO dto5 = new OrderDTO(1 ,"dosa","veg",40.00);

		ArrayList lis = new ArrayList();
		lis.add(dto4);
		lis.add(dto5);
		
	
		Collections.sort(lis);
		lis.forEach(System.out::println);
}
}
