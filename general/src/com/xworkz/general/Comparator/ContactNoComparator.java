package com.xworkz.general.Comparator;

import java.util.Comparator;

import com.xworkz.general.PatientDTO;
import com.xworkz.general.PatientDTO1;

public class implements Comparator<PatientDTO1> {

	@Override
	public int compare(PatientDTO1 o1, PatientDTO1 o2) {
		// TODO Auto-generated method stub
		return  (int) (o1.getContactNo() - o2.getContactNo());
	}

}
