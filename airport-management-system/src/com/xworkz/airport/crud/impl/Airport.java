package com.xworkz.airport.crud.impl;

import com.xworkz.airport.dto.TerminalsDTO;

public interface Airport {
	 
	public boolean creatTerminals(TerminalsDTO abc);
	public void getTerminalDetail();
	public boolean updateTerminalNameById(int id,String name);
	public boolean deleteTerminalById(int id,String name);
	
}
