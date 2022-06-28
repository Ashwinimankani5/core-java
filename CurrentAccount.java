class CurrentAccount extends BankAccount
{
	double interest;
	 int transactionCount ;
    int freeTransactions = 10;
	double interestRate;
	double transactionFee=0.5;
	double totalTransactionFee;
	
	public CurrentAccount(double interest,double transactionFee)
	{
	this.interest = interest;
	this.transactionFee = transactionFee;
	}
	
	public void deposit(double amount)
	{
	System.out.println("Invoked deposite()");	 
	System.out.println("Amount to be deposite"+amount);	 
    System.out.println("Amount before deposite"+amount);

	this.amount=this.amount+amount;
	System.out.println("Amount after deposite"+amount);	
	 System.out.println("end of deposite()");
	 transactionCount++;
	 
	
	 }
	 
	public void withdraw(double amount)
	{
	System.out.println("Invoked withdraw()");	 
	System.out.println("Amount to be withdraw"+amount);	 
    System.out.println("Amount before withdraw"+amount);

	this.amount=this.amount-amount;
	if(amount<=0){
		System.out.println("insufficient Balance");
		
	}
	else{
		System.out.println(amount);
	}
	System.out.println("Amount after withdraw"+amount);	
	 System.out.println("end of withdraw()");
	 transactionCount++;
	
    }	 
	
    public double getBalance()
    {
	  System.out.println("total amount available in account is " +amount);
	  return amount;
     }
  
    public void deductionOfFee()
	{
		double totaltransactionFee=0;
	
		if(transactionCount > freeTransactions) {
			totaltransactionFee = transactionFee*(transactionCount - freeTransactions);
			this.amount = this.amount - totalTransactionFee;
			
				
		System.out.println("The deductionOfFee() started");
		System.out.println("The total number of count" +transactionCount);
		
		}
		
		else{
			getBalance();
			System.out.println("The deductionOfFee() ended");
			
					
		}
	
	
	}
		public double periodicInterest()
		{
			double interest = getBalance() * interestRate/100 ;
			deposit(interest);
			return interest ;
		}

}