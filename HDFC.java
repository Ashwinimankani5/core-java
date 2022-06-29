class HDFC extends Bank
{

 @Override
 public void getInterest(double interest){
 System.out.println("the HDFC bank");
 
 interest=interest+2.2;
 super.getInterest(interest);
 }
 }