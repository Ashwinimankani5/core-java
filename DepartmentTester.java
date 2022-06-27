class DepartmentTester
{
	public static void main(String a[])
	{
	Department mech = new MechanicalEngineering();
	mech.duration = "  4 years  ";
	mech.university = " Belagum ";
	mech.noOfStaff = 15;
	mech.collageName = " B.V.V.S ";
	
	mech.playGame();
	 System.out.println(mech.duration+ "  "+mech.university+ "  "+mech.noOfStaff+ "  "+mech.collageName+ "  ");
        
    Department cs = new CivilEngineering();
	cs.duration = "  4 years  ";
	cs.university = " Belagum ";
	cs.noOfStaff = 14;
	cs.collageName = " B.V.V.S ";
	
	cs.playGame();
	 System.out.println(cs.duration+ "  "+cs.university+ "  "+cs.noOfStaff+ "  "+cs.collageName+ "  ");
	
	
	Department ee = new CivilEngineering();
	ee.duration = "  4 years  ";
	ee.university = " Belagum ";
	ee.noOfStaff = 18;
	ee.collageName = " B.V.V.S ";
	
	ee.playGame();
	 System.out.println(ee.duration+ "  "+ee.university+ "  "+ee.noOfStaff+ "  "+ee.collageName+ "  ");
	
	
	Department ec = new CivilEngineering();
	ec.duration = "  4 years  ";
	ec.university = " Belagum ";
	ec.noOfStaff = 17;
	ec.collageName = " B.V.V.S ";
	
	ec.playGame();
	 System.out.println(ec.duration+ "  "+ec.university+ "  "+ec.noOfStaff+ "  "+ec.collageName+ "  ");
	 
	 Department itech = new CivilEngineering();
	itech.duration = "  4 years  ";
	itech.university = " Belagum ";
	itech.noOfStaff = 16;
	itech.collageName = " B.V.V.S ";
	
	itech.playGame();
	 System.out.println(itech.duration+ "  "+itech.university+ "  "+itech.noOfStaff+ "  "+itech.collageName+ "  ");
	 
	 
	 Department civil = new CivilEngineering();
	civil.duration = "  4 years  ";
	civil.university = " Belagum ";
	civil.noOfStaff = 18;
	civil.collageName = " B.V.V.S ";
	
	civil.playGame();
	 System.out.println(civil.duration+ "  "+civil.university+ "  "+civil.noOfStaff+ "  "+civil.collageName+ "  ");
	
	
	}
}