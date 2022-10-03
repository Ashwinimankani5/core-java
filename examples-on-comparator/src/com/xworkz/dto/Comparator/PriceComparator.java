package com.xworkz.dto.Comparator;

import java.util.Comparator;

import com.xworkz.dto.BookDTO;

public final class PriceComparator implements Comparator<BookDTO> {

	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		// TODO Auto-generated method stub
		return o1.getPrice() - o2.getPrice();
	}


	}


