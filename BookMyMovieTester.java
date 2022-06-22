class BookMyMovieTester{

	public static void main (String a[]){
		
		String movie[]={"Om", "Gaalipata", "Upendra", "H2O", "Rakta Kanniru", "Yajamana"};
		String snack[]={"Samoosa", "Giramit", "Bajji", "Pop-corn"};
		
		BookMyMovie bookMymovie = new BookMyMovie("Sujata",200,movie,snack,24);
		bookMymovie.showTime(20,"Devi","Om");
		bookMymovie.buySnack("samoosa", 1);
}
       
		
		
}