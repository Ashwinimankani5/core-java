package com.xworkz.block;

public class Block {

	
	public Block() {
		
		
			System.out.println(this.getClass().getSimpleName() +"object is created");
			
	}
	{
		System.out.println("block1");
	}
static	{
		System.out.println("block2");
		
	}
public static void m() {
	System.out.println("block3");
}
}
