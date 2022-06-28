class BankAccountTester
{
	 double amount;
	public static void main(String a[])
	{
		SavingsAccount sa = new SavingsAccount(12);
		
		sa.deposit(7000.00);
		sa.withdraw(300.00);
		
		
		double amount = sa.getBalance();
		System.out.println("balance of existing Account"+amount);
		sa.periodicInterest();
		
		SavingsAccount other = new SavingsAccount(0.3);
		sa.transfer(2000.00 , other);
		
		double totalAmount = other.getBalance();
		System.out.println("balance of other Account"+totalAmount);
		
		CurrentAccount cu = new CurrentAccount(1.0,2.0);
		
		cu.deposit(5000.00);
		cu.withdraw (3000.00);
		cu.deposit(2400.00);
		cu.withdraw(700.00);
		
		cu.deductionOfFee();
		cu.periodicInterest();
		System.out.println("balance of existing Account"+amount);
		
		
		
	}
	

}



