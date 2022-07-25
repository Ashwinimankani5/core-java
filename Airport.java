interface Airport 
{
	//public Airport(int size);
	public boolean creatTerminals(TerminalsDTO abc);
	public void getTerminalDetail();
	public boolean updateTerminalNameById(int id,String name);
	public boolean deleteTerminalById(int id,String name);
	
}