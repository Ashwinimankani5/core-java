class RumTester
{

  public static void main(String a[])
  {

	   OldMonk old = new OldMonk();

	   old.price=456;
	   old.quantity="750 ml";
	   old.alcoholContent="34.2%";
	   old.mfgDate="4june 2022";
	   old.expiry="best before use 24 months";

		old.toGetKick();

		System.out.println(old.price+"    "+old.quantity+"    "+old.alcoholContent+"   "+old.mfgDate+"   "+old.expiry+" ");

  }


}


