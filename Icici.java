class Icici extends Bank{

 @Override
 public void getInterest(double interest){
 System.out.println("the Icici bank");
 
 interest=interest+0.6;
 super.getInterest(interest);
 }


}