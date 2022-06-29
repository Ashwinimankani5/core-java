class Karanatak extends Bank{

 @Override
 public void getInterest(double interest){
 System.out.println("the Karanatak bank");
 
 interest=interest+3.0;
 super.getInterest(interest);




 }

}