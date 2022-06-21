class Hospital{

 String name;													
 String address;
 long contactNo;
 String ownerName;
 String[]currentHospitals={"Sandhyashree","Manipal","Annexure1"};
  String[]currentHospitals1={" Apollo","City","Vishal"};

public static void main (String a[]){
//className refvariables=new className();
   Hospital hospital=new Hospital();
    hospital.name="Sandhyashree";
    hospital.address="Rajajinagar";
	hospital.contactNo=8123808055L;
  hospital.ownerName="KiranRao";
    System.out.println("The currentHospitals is====");
    hospital.getCurrentHospitals();
	
	      System.out.println("The hospital name" +hospital.name);
	  	  System.out.println("The hospital address" +hospital.address);
	      System.out.println("The hospital contact No" +hospital.contactNo);
          System.out.println("The hospital owner Name" +hospital.ownerName);

		  
	Hospital hospital1=new Hospital();	  
	hospital1.name="Manipal";
    hospital1.address="Shvajinagar";
	hospital1.contactNo=8123808006L;
	hospital1.ownerName="Laxmi";
    System.out.println("The currentHospitals is====");
    hospital1.getCurrentHospitals1();
		  
		  System.out.println("The hospital1 name" +hospital1.name);
	  	  System.out.println("The hospital1 address" +hospital1.address);
	      System.out.println("The hospital1 contact No" +hospital1.contactNo);
          System.out.println("The hospital1 owner Name" +hospital1.ownerName);
		  
	}
   public void getCurrentHospitals(){
	for (int z=0; z<currentHospitals.length; z++){
				
			System.out.println(currentHospitals[z]);
				

	}
			
	}
     public void getCurrentHospitals1(){
	 for (int z=1;  z<currentHospitals.length; z++){
	   System.out.println(currentHospitals[z]);
	 
	 }
	 
	 }
	
	
	 }
	   
	   
   

		
		
		










 
 	
		

