package com.xworkz.exception;

public class Invalid {
	
	public void atm(int amountWithdraw) throws ATM {
		
		System.out.println("amount method is started");
		if( amountWithdraw <= 500) {
			System.out.println("please entre the password");
		}
		else {
			System.out.println("please enter minimum amount of 500");
			throw new ATM();
		}
	}
	
	public void atm1(int amount) throws ATM {
		System.out.println("method atm1 is created");
		
		if(amount<=5000 && amount %100!= 0) {
			System.out.println("Entre the amount");
		}
		else {
			System.out.println("Invalid amount");
			throw new ATM();
		}
	}

}
