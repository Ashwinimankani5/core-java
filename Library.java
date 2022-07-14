class Library
{
	BookDTO[] d;// new BookDTO[];

	int index;
	
	public Library(int size)
	{
		d = new BookDTO[size];
	System.out.println("libraby constant is created");
	}
	public boolean saveBook(BookDTO dtc)
		{
			System.out.println("inside this books are stored");
			
			boolean isAdded = false;
					
			if(dtc != null && dtc.getName() != null)
			{	
				d[index++] = dtc;
				//this.d = dtc;
				isAdded = true;
			}
			else{
				System.out.println("no books are added");
				}
			return isAdded;
		}
		
	public void getBookDetails()
	{
		System.out.println("Storage get book details");
		for(int i=0; i<d.length;i++) 
		{
			System.out.println(d[i].getName()+ "  " + d[i].getAuthor()+ "  " + d[i].getId()+ "  " + d[i].getPrice()+ " " );
		}
		
	}
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
