package com.xworkz.exception;

import java.util.Scanner;

public class ATMTester {
	public static void main(String[] args) {
		
		System.out.println("main method is started");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre the amount");

	int amountWithdraw = sc.nextInt();
	
	Invalid inv = new Invalid();

	
	try {
		inv.atm(amountWithdraw);
	} catch (ATM e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(" please collect amount");
	
	
	
	Invalid inv1 = new Invalid();
	System.out.println("Entre the amount to be withdraw");

	//Scanner sc = new Scanner(System.in);
	int amount =sc.nextInt();
	System.gc();
	try {
		inv1.atm1(amount);
	} catch (ATM e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.gc();
	}
	System.out.println(" collect amount and atm card");
	sc.close();
	
	System.out.println(" main method is ended.......");
}
	
}