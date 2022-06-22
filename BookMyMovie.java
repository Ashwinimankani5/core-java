class BookMyMovie
{
	String theatreName;
	String movie[]; //= {"Om", "Gaalipata", "Upendra", "H2O", "Rakta Kanniru", "Yajamana"};
    int noOfTickets ;
	static int ticketPrice  = 600;
	int totalNoOfTickets = 200;
	int totalTicketPrice ;
	String snack[]= {"Samoosa", "Giramit", "Bajji", "Pop-corn"};
	int  totalSnack = 100;
	int snackPrice = 60;
	int noOfSnack;
	public BookMyMovie(String theatreName , int totalNoOfTickets,String movie[],String snack[],int noOfSnack){    //constructor

	System.out.println("BookMyMovie object is created");
	this.theatreName=theatreName;
	this.totalNoOfTickets=totalNoOfTickets;
	this.movie=movie;
     this.snack=snack;
	 this.noOfSnack=noOfSnack;
	}
	public int  showTime(int noOfTickets, String bookedBy , String movieName)
	{
		int totalTicketPrice= 0;
		
		System.out.println("Arg1 : No of tickets" +noOfTickets);
		System.out.println("Arg2 : Booked by"+bookedBy);
		System.out.println("Arg3 : Movie name" +movieName);


		for(int index = 0; index < movie.length ; index++){
			
		if(movieName == movie[index]){
		System.out.println("Movie name matched");

		if (noOfTickets < totalNoOfTickets){
		totalTicketPrice = noOfTickets*ticketPrice;
		totalNoOfTickets = totalNoOfTickets - noOfTickets;
		System.out.println("For Movie :" +movieName+
							"No Of Tickets sre that remaining:" +totalNoOfTickets +
							"Total price is :"+totalTicketPrice);
	}
		else{
			System.out.println("Istu ticket ella");
	}

	}
		else{
			System.out.println("Movie not available");
	}
	}

	return totalTicketPrice;
	}
	
	public int buySnack(String snackName, int quantity){
	int totalSnackPrice=0;
	System.out.println("sanackTime is created");
	System.out.println("Arg1: snack names:" +snackName);
	System.out.println("Arg2: Quantity of snack:" +quantity);

	for(int index=0; index<snack.length; index++){
		if(snackName == snack[index]){
			System.out.println("snack name is matched");
		if(quantity<totalSnack){
		totalSnackPrice=snackPrice*quantity;
		System.out.println(" snack name:" +snackName+ "total price of snacks:" +totalSnackPrice+
							"total no of snaks in shop:" +totalSnack);
			}
			else{
		System.out.println("snack is out of limit");
			}
		}
		else{
		System.out.println("snack is not available");
		}
	}
	return totalSnackPrice;
}

}




