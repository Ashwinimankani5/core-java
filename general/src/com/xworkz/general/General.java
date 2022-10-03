package com.xworkz.general;



import java.util.ArrayList;
import java.util.Collection;


public class General {
	
	public static void main(String[] args) {
	//	 String[] st = {"","",""};
	//	String str = new String();
	//	str[0] = "";
		
//		String arrays[]= {"ramesh","suresh","mahesh","satish","girish"
//				,"yogish","raju","manoj","praveen","saathvik"};
//		
		
		Collection coll1 =  new ArrayList();
		coll1.isEmpty();
		System.out.println(coll1);
		//coll1.forEach(System.out ::println);
		coll1.add("ramesh");
		coll1.add("suresh");
		coll1.add("mahesh");
		coll1.add("satish");
		coll1.add("girish");
		coll1.add("yogish");
		coll1.add("raju");
		coll1.add("manoj");
		coll1.add("praveen");
		coll1.add("saathvik");
//		coll1.isEmpty();
		System.out.println(coll1);
//			coll1.forEach(System.out ::println);
		
//		for (Object object : coll1) {
//			System.out.println(object);
//		}
//	
//		int array1[] = {1,2,3,4,5,6,7,8,9,10};
//		
//		Collection coll2 = new ArrayList();
//		
//		
//		
//		coll2.add(1);
//		coll2.add(2);
//		coll2.add(3);
//		coll2.add(4);
//		coll2.add(5);
//		coll2.add(6);
//		coll2.add(7);
//		coll2.add(8);
//		coll2.add(9);
//		coll2.add(10);
//		for (Object object : coll2) {
//			System.out.println(object);
//		}
//		
//		char array2 [] = {'a','b','c','d','e','f','g','h','i','j'};
//		
//		Collection coll3 = new ArrayList();
//		coll3.add('a');
//		coll3.add('b');
//		coll3.add('c');
//		coll3.add('d');
//		coll3.add('e');
//		coll3.add('f');
//		coll3.add('g');
//		coll3.add('h');
//		coll3.add('i');
//		coll3.add('j');
//		coll3.add('k');
//		
//		for (Object object : coll3) {
//			System.out.println(object);
//		}
//		
//		
		Collection coll = new ArrayList();
	
		boolean co = coll1.contains("ramesh"); // to check or compare the value present in the array
				System.out.println("the value is:"  +co);
				
		coll.clear();
		System.out.println(coll1);
		coll1.forEach(System.out ::println);
			
		Collection coll11 = new ArrayList();
		coll11.containsAll(coll);
		coll11.forEach(System.out::println);
		
		coll.size();
//		coll.forEach(System.out::println);
		

		
		
			coll.add("wdswdes");
			coll.add(true);
			coll.add(55888L);
			coll.add('A');	
//			coll.remove('A');
//			coll.forEach(System.out ::println);
		
			boolean check = coll.removeAll(coll1);// collections prints thevalue of the data
			System.out.println(coll1);
			int i [] = {1,2,3,4,5};
			System.out.println(i);// array prints the adress of the data not the value of the data
			
	
	}

}
