import java.util.Scanner;


class AirportTester
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of terminals");
		int size = sc.nextInt();

		Airport air = new Airport(size);
		for(int i=0; i<size; i++)
		{
				
		System.out.println("Entre id of terminal");
		int id = sc.nextInt();
		System.out.println("Entre terminal name");
		String name = sc.next();
		
		TerminalsDTO abc = new TerminalsDTO();

		
		abc.setId(id);
		abc.setName(name);
		
		air.creatTerminals(abc);
		
		//air.getTerminal();
		}
		air.getTerminalDetail();
	}
}