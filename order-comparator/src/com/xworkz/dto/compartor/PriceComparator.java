package com.xworkz.dto.compartor;

import java.util.Comparator;

import com.xworkz.dto.OrderDTO;

public class PriceComparator implements Comparator<OrderDTO>{

	@Override
	public int compare(OrderDTO o1, OrderDTO o2) {
		// TODO Auto-generated method stub
		return o1.getPrice().compareTo(o2.getPrice());
	}

}
