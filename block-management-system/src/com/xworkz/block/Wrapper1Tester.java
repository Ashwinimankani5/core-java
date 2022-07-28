package com.xworkz.block;

public class Wrapper1Tester {
	
	public static void main (String args[]) {
		
/*		byte a = 5;
		short b = 20;
		int c = 10;
		long d = 9740096335L;
		double e = 100.00D;
		float f = 114523.0000F;
		
		
		// auto boxing  from primitive to wrapper class 
		     Byte a1 =  a;
		     Short b1  =  b;
		     Integer c1 = c;
		     Long d1 =  d;
		     Double e1 = e;
		     Float f1 =  f;
		     
		     System.out.println(a1 == a);
		     System.out.println(b1 == b);
		     System.out.println(c1 == c);
		     System.out.println(d1 == d);
		     System.out.println(e1 ==e);
		     System.out.println(f1 == f);
		     
		     //autoun boxing from wrapper class to primitive class
		     
		     
		     byte  a2 =  a1.byteValue();  
		     short b2 =  b1.shortValue();
		     int c2 =  c1.intValue();
		     long d2 =  d1.longValue();
		     double  e2 = e1.doubleValue();
		     float f2  =  f1.floatValue();
		     
		     
		     System.out.println(a2 == a1.byteValue());
		     System.out.println(b2 == b1.shortValue());
		     System.out.println(c2 == c1.intValue());
		     System.out.println(d2 == d1.longValue());
		     System.out.println(e2 ==e1.doubleValue());
		     System.out.println(f2 == f1.floatValue());
		     */
		     
		     
		     byte a = 5;
				short b = 20;
				int c = 100;
				long d = 9740096335L;
				double e = 100.00D;
				float f = 114523.0000F;
				
				
				// auto boxing  from primitive to wrapper class 
				     Byte a1 =  5;
				     Short b1  =  20;
				     Integer c1 = 100;
				     Long d1 =  974006335L;a
				     Double e1 = 100.00D;
				     Float f1 =  114523.0000F;
				     
				     System.out.println("byte value is "  + a1);
				     System.out.println("short value is "  +b1);
				     System.out.println("int value is "  +c1);
				     System.out.println("long value is " +d1);
				     System.out.println("double value is " +e1);
				     System.out.println("float value is  " +f1);
				     
				     //autoun boxing from wrapper class to primitive class
				     
				     
				     Byte  a2 =  a1.byteValue();  
				     Short b2 =  b1.shortValue();
				     Integer c2 =  c1.intValue();
				     Long d2 =  d1.longValue();
				     Double  e2 = e1.doubleValue();
				     Float f2  =  f1.floatValue();
				     
				     
				     System.out.println("byte value is " +a1.byteValue() );
				     System.out.println("short value is " +b1.shortValue());
				     System.out.println("int value is " + c1.intValue());
				     System.out.println("long value is " +d1.longValue());
				     System.out.println("double value is "  +e1.doubleValue());
				     System.out.println("float value is  "  +f1.floatValue());
				
	}

}
