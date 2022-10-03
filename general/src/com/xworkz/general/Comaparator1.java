package com.xworkz.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.general.Comparator.AddressComparator;
import com.xworkz.general.Comparator.ContactNoComparator;
import com.xworkz.general.Comparator.NameComparator;
public class Comaparator1 {
	
	public static void main(String[] args) {
		
		List li = new ArrayList();
		li.add(new PatientDTO1(1,"rtyi",68577L,"sdfhj"));
		li.add(new PatientDTO1(8,"hjhyd",48944L,"ershj"));
		li.add(new PatientDTO1(2,"reews",12395L,"wazxxc"));
		li.add(new PatientDTO1(5,"oijb",87448L,"aiiuyn"));
		li.add(new PatientDTO1(7,"oieaz",28948L,"kkmuy"));
		
		// sorting by name or any other fields (also known as customised techniqe of sorting)
		System.out.println("sorting by name");
		Collections.sort(li,new NameComparator());
		li.forEach(System.out::println);
		
		//sorting by address
		System.out.println("sorting by address");
		Collections.sort(li,new AddressComparator());
		li.forEach(System.out::println);
		
		//sorting by contactno
		System.out.println("sorting by contact number");
		Collections.sort(li,new NameComparator());
		li.forEach(System.out::println);
		
	}

}
