interface Hospital
{
	//public Hospital(int size);
	public boolean createPatient(PatientDTO dto);
	public boolean updatedPatientAddressById(int id, String address);
	public boolean updatedPatientNameById(int id, String name);
	public boolean updatedPatientNameByContactNo(long contactNo, String name);
	public boolean deletePatientByName(String name);
	public boolean deletePatientById(int id);
	
}