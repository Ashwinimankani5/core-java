package com.xworkz.hospital.crud;

import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital {
		public void getPatientDetails();
		public boolean createPatient(PatientDTO dto);
		public boolean updatedPatientAddressById(int id, String address);
		public boolean updatedPatientNameById(int id, String name);
		public boolean updatedPatientNameByContactNo(long contactNo, String name);
		public boolean deletePatientByName(String name);
		public boolean deletePatientById(int id);
		

}
