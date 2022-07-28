package com.xworkz.block;

public class WrapperTester {

	
	public static void main(String args[]) {
		
		int  baba =78;
		
		//auto boxing 
	Integer  baba1 =  78; 
		System.out.println(baba == baba1.intValue());
		
	
		//auto un boxing
		
		 baba = baba1.intValue();
		System.out.println(baba1 == baba);
	 

	}	
	}


