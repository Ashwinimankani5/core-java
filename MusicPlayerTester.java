class MusicPlayerTester
{
	
	public static void main(String args[])
	{
		
	
	MusicPlayer m = new MusicPlayer();
	
	m.setName("sony");
	m.setColour("black");
	m.setPrice(10000);
	m.playMusic();
	
	System.out.println(m.getName() + "  " + m.getColour() + "    " +m.getPrice());
	
	
		
	}





}