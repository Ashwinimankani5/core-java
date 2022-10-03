package com.xworkz.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingTester {
	
	public static void main(String[] args) {
		
		
		List li  =  new ArrayList();
		
		
		
		li.add("cvb");
		li.add("ertyu");
		li.add("abnakj");
		li.add("tyuipo");
		li.add("vfgdsd");
		li.add("edfgt");
		// sort by id (also known as default technic of sorting string objects)
		Collections.sort(li);
		li.forEach(System.out::println);
		
	}
   
}
