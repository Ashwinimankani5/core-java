class BankTester{

  public static void main(String a[])
  {
	  
    Bank ic = new Icici();
    ic.getInterest(0.5);
  
    Bank hd=new HDFC();
	hd.getInterest(2.0);
	
	Bank se=new Seetha();
	se.getInterest(2.4);
	
	Bank ko=new Kotak();
	ko.getInterest(1.1);
	
	Bank si=new SBI();
	si.getInterest(2.6);
	
	Bank ka =new Karanatak();
	ka.getInterest(1.8);
	
	Bank bas=new Basaveshwar();
	bas.getInterest(3.5);
	
	
  }



}