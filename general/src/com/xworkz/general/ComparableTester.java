package com.xworkz.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTester {
	
	public static void main(String[] args) {
		
	
		PatientDTO dto = new PatientDTO(1, "dev", 85425566L); 
		PatientDTO dto1 =new PatientDTO(2, "devi", 848588756L);
		PatientDTO dto2 =new PatientDTO(3, "devu", 85778856L);// parameter type=  object
		List list1 =  new ArrayList();
		//List<PatientDTO> list1 =  new ArrayList();
		list1.add(dto);
		list1.add(dto1);
		list1.add(dto2);
	
	//sorting technique
		Collections.sort(list1);
		list1.forEach(System.out::println);
	}
	}
