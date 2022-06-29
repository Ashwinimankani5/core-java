class Basaveshwar extends Bank{

 @Override
 public void getInterest(double interest){
 System.out.println("the Basaveshwar bank");
 
 interest=interest+2.2;
 super.getInterest(interest);
 }

}