package com.xworkz.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.dto.compartor.NameComparator;
import com.xworkz.dto.compartor.TypeComparator;
public class Comparator2 {


	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new OrderDTO(1,"idli","veg",30.00));
		list.add(new OrderDTO(2,"kabab","non-veg",50.00));
		list.add(new OrderDTO(3,"dosa","veg",40.00));
		list.add(new OrderDTO(1,"biriyani","non-veg",60.00));
		list.add(new OrderDTO(5,"puri","veg",35.00));
		
		System.out.println("sorting by name");
		Collections.sort(list, new NameComparator());
		list.forEach(System.out::println);
		
		System.out.println("sorting by Type");
		Collections.sort(list, new TypeComparator());
		list.forEach(System.out::println);
	}
}
