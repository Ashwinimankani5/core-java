class Seetha extends Bank{
	
 @Override
 public void getInterest(double interest){
 System.out.println("the Seetha bank");
 
 interest=interest+0.2;
  super.getInterest(interest);
 
 }

}