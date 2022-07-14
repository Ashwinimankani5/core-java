import java.util.Scanner;

class LibraryTester
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre total number of book to be added");
		int size = sc.nextInt();
		
		Library lib = new Library(size);
		
		for(int i=0; i<size; i++)
		{
		System.out.println("Entre book name");
		String name = sc.next();
		System.out.println("Entre AuthorName");
		String author = sc.next();
		System.out.println("Enter book id");
		int id  = sc.nextInt();
		System.out.println("Enter book price");
		double price = sc.nextDouble();
		
		BookDTO dtc = new BookDTO();
	     dtc.setAuthor(author);
		dtc.setName(name);
		dtc.setId(id);
		dtc.setPrice(price);
		
		lib.saveBook(dtc);
		}
		lib.getBookDetails();
		
		
		
	}
}