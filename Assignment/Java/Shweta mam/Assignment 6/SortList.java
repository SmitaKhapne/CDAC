package org.assignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortList {
	
	public static void print(List<Integer> l)
	{
		for(Integer res : l)
		{
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new LinkedList<>();
		List<Integer> list2 = new LinkedList<>();
		
		list1.add(11);
		list1.add(22);
		list1.add(77);
		list1.add(44);
		
		list2.add(88);
		list2.add(10);
		list2.add(1);
		
		System.out.println("List 1");
		print(list1);
		
		System.out.println("List 2");
		print(list2);
		
		System.out.println("Merge two Integer List");
		list1.addAll(list2);
		Collections.sort(list1);
		System.out.println(list1);	
	}

}
