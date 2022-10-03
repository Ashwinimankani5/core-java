package com.xworkz.general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor

public class PatientDTO implements Comparable<PatientDTO> {

	private  int patientId;
	private String name;
	private long contactNo;
	
	
	
	@Override
	public int compareTo(PatientDTO o) {
		// TODO Auto-generated method stub
		return this.patientId - o.patientId;
	}
	
}
