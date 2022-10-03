package com.xworkz.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.dto.Comparator.NameComparator;
import com.xworkz.dto.Comparator.PriceComparator;


public class Comparator1 {

public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new BookDTO(1,"hshsja","isksygs",250));
		list.add(new BookDTO(2,"owoiwy","atwtuw",140));
		list.add(new BookDTO(3,"mxnqrq","fwsrej",280));
		list.add(new BookDTO(4,"asnvdd","xeteyi",399));
		list.add(new BookDTO(5,"dwtuwi","dnieel",499));
		list.add(new BookDTO(6,"pwuwys","zmsnsls",999));
	
		System.out.println(" sorting by name");
		Collections.sort(list, new NameComparator());
		list.forEach(System.out::println);
		
		System.out.println(" sorting by price   ");
		
		Collections.sort(list, new PriceComparator());
		list.forEach(System.out::println);
		
		System.out.println(" sorting by authorname");
		Collections.sort(list, new AuthourNameComparator());
		list.forEach(System.out::println);	
}
}
