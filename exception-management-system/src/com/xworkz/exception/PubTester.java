package com.xworkz.exception;

import java.util.Scanner;

public class PubTester {
	
	public static void main(String args[]) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the age");
		int age = sc.nextInt();
		
		Bouncer bouncer = new Bouncer();
//		
//		bouncer = null; // dereferance of object
//		System.gc();
//		
		try {
			bouncer.check(age);

		} catch (PubException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//purpose of finally key word :whether the exception is 
			//Occurred or not the finally block will be executed mandaterilly 
			// finally block used to close costly resources
			System.out.println("closing costly resources");
			sc.close();
		}
		
		System.out.println("main method is ended");
	
	}

}
