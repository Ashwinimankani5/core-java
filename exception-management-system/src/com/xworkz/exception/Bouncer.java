package com.xworkz.exception;

public class Bouncer {
	 
	public void check(int age) throws PubException {
		System.out.println("checked method is created");
		if(age >= 18) {
			System.out.println("please entre..... and enjoy..");
			
		}
		else {
			//pubException exception = new PubException();
			throw new PubException();
		}
	}

}
