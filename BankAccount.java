class BankAccount
{
	double amount;

		public void deposit(double amount)
	{
	System.out.println("Invoked deposite()");	 
	System.out.println("Amount to be deposite"+amount);	 
    System.out.println("Amount before deposite"+amount);

	this.amount=this.amount+amount;
	System.out.println("Amount after deposite"+amount);	
	 System.out.println("end of deposite()");
	 
	 }

	public void withdraw(double amount)
	{
	System.out.println("Invoked withdraw()");	 
	System.out.println("Amount to be withdraw"+amount);	 
    System.out.println("Amount before withdraw"+amount);

	this.amount=this.amount-amount;
	System.out.println("Amount after withdraw"+amount);	
	 System.out.println("end of withdraw()");
		
     }	 
	 
	
	public double getBalance()
    {
		System.out.println("total amount is:"  +amount);
		return amount;
	}
	
	public void transfer(double amount, BankAccount other)
	{
			withdraw(amount);
		other.deposit(amount);
		
		System.out.println("The insufficient balance");
	
	}
}