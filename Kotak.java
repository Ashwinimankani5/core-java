class Kotak extends Bank{

  @Override
  public void getInterest(double interest){
   System.out.println("the Kotak bank");
   
   interest=interest+1.4;
  
  super.getInterest(interest);
  }

}