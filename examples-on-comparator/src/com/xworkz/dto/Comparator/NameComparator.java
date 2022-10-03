package com.xworkz.dto.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.dto.BookDTO;

public final class NameComparator implements Comparator<BookDTO> {

	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	
	
}
