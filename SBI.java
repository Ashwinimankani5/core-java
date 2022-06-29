class SBI extends Bank{


 @Override
 public void getInterest(double interest){
 System.out.println("the SBI bank");
 
 interest=interest+0.8;
 super.getInterest(interest);

 }
}