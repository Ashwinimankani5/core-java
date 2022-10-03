package com.xworkz.exception;

import jdk.jfr.StackTrace;

public class AtmMachine {
	
	public void check(int amount) throws AtmException{
		
		System.out.println("check method is invoked");
	if(amount <= 5000) {
		System.out.println("withdraw  amount");
	}
	else {
		System.out.println("limit is acceded");
		throw new AtmException("acceding the limit");
	}
	if(amount%100 == 0 ) {
		System.out.println("entre withdrawing amount");
	}
	else {
		throw new  AtmException("invalid input+");
	}
	}
	
@Override
protected void finalize() throws Throwable {
	try {
		System.out.println("Inside the finalize method");
	}finally {
		System.out.println("closing the finalize method");
	
	}

}
}
	
	
