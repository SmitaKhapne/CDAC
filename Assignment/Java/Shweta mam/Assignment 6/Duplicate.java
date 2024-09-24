package org.assignment;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(2);
		list2.add(4);
		list2.add(5);
		
		System.out.println("Duplicates Integers : ");
		list1.retainAll(list2);
		System.out.println(list1);
		

	}

}
