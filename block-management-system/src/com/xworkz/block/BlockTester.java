package com.xworkz.block;

public class BlockTester {
	
	int blockInit;
		{
				System.out.println("block is excecuted");			
				blockInit =  10;
		}

		
		static int blockInIt;
	static	{
				System.out.println("block is excecuted");			
				blockInIt =  20;
				System.out.println(BlockTester.blockInIt);
				
		}

	public static void main(String args[]) {
		System.out.println("main method is started");
		BlockTester blocktester = new BlockTester();
		System.out.println(blocktester.blockInit);
		
		System.out.println("main method is ended");
		
		
		
		
	}
}
