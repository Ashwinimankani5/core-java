package com.xworkz.general;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	
	public static void main(String[] args) {
		
		List  list =  new ArrayList();
//		ARRAY LIST:
	//List is index based collection.
//		list is order of collection.
//		list can allow duplicates.
//		list is a sub interface of collection.
//		list can allow multiple null values.
//		it preserves the insertion order.	
		
//		Arraylist : stores the data in sequential order
//		default size of arrayList is : 10  after 10 th data grow() is allowed to store 11th data
//		New capacity = old capacity + (Old capacity >> 1 )
//		      "       =  10capacity   + 5(binary code )
		// all data stored in heap memory 1 after 1
		// it follows recyclable list or grow list or single list
		
		
		// LINKED LIST:
		//LINKED list can not have defalult size bt it has incremented by 1 number
//		//linked list can not store the data in seqential format.it stores data  randomly
		//it can not allow duplicate
		//it  can not store the data in sequential order  it means one data sotered and another 1 is
		// not after the first one it will stored somewhere in the heap memory.
		//  data is considered as node
		//linked list follws doubly linked list
		//
		list.add("Bagalkot");
		list.add("Banglore");
		list.add("Vijaypur");
		System.out.println(list);
		list.forEach(System.out::println);
		
		List  list1 =  new ArrayList();
		list1.add("Bidar");
		list1.add("Hubli");
		list1.add("Belagum");
		list1.add("Gadag");
		list1.add("Hubli");
		list1.add("Bidar");
		list1.add("Belagum");
		list1.add("Gadag");
		System.out.println(list1);
		
		//list1.get(2);
		System.out.println(list1.get(2));
		
		
		System.out.println(list1.addAll(list));
		System.out.println(list1);
		
		System.out.println(list1.addAll(0, list));
		System.out.println(list1);
		
		System.out.println(list1.set(1,"Hospete" ));
		System.out.println(list1);
		
		System.out.println(list1.contains("Bagalkot"));
		//System.out.println(list1);
		
		System.out.println(list1.contains("Udupi"));
		//System.out.println(list1);
		
		
		//System.out.println(list1.add(list));
		//list.forEach(System.out::println);
		
		
		
		
		
	}

}
