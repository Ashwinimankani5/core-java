class LifeInsuranceTester{


    public static void main (String a[]){

     LIC lic = new LIC();
	  
	  lic.idNo = 5289;
	  lic.duration="10 years";
	  lic.price=50000;
	  lic.personName="Ashwini";

  lic.togetAmount();
 System.out.println(lic.idNo+"   "+lic.duration+"   "+lic.price+"   "+lic.personName+"   ");
}

} 