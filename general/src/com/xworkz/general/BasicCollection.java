package com.xworkz.general;

import java.util.ArrayList;
import java.util.Collection;

public class BasicCollection {
	
	public static void main(String[] args) {
		
		Collection co = new ArrayList();
		co.add(1);
		co.add("ramesh");
		co.add('j');
		
		
		
		
		
		//co.add(col);   // it causes error due to improper serialization of object
		//co.clear();
		//System.out.println(co);
		co.forEach(System.out::println);
	
		
		Collection col =  new ArrayList();
		
		col.isEmpty();
		  System.out.println("the vlue before is empty()  :" +col.isEmpty());
		
		col.add(co);
		col.add("Name");
		col.add(2587L);
		col.add('f');
		col.add("Name");
		//col.remove('f');
		//col.addAll(co);
		
		co.size();
		System.out.println(co.size());
		
		col.size();
		System.out.println(col.size());
		
	//	col.clear();
		
		//col.containsAll(co);
		
	
		col.forEach(System.out::println);
		
		boolean check = col.contains("Name");
		System.out.println(check);
		
	  boolean xyz =col.containsAll(co);
	  System.out.println(xyz);
		
	  boolean y = col.equals(col);
	  System.out.println(y);
	  
	  col.isEmpty();
	  System.out.println("the vlue after is empty()  :" +col.isEmpty());
		
	  col.iterator();
	  System.out.println("The iteration value is :" +col.iterator());
	
	  col.notify();
	//  System.out.println("  "+col.notify());
//	  
//	  col.wait(2587L);
//	  System.out.println();
	  
	  boolean abc1 = col.remove(col);
	  System.out.println("the value of abc1 is :"  + abc1);
	  
	  boolean abc = col.removeAll(col);
	  System.out.println("the value is :"  + abc);
	  
	  boolean edc = co.retainAll(col);
	  System.out.println("The retaining value is :" +edc);
	  
	}

}
