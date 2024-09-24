package org.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapping {
	
	public static void print(Map< Integer, String> map )
	{
		for(Map.Entry<Integer, String> myMap : map.entrySet())
		{
			System.out.println(myMap.getKey() + " : " + myMap.getValue());
		}
	}

	public static void main(String[] args) {
		Map<Integer, String> map =  new HashMap<>();
		
		map.put(1, "aabbccddeffg");
	
		print(map);
		
		System.out.println("Print unique values");
		
		map.get(1).chars().distinct().forEach(c -> System.out.println((char)c));
		
		String str = map.get(1);
		char[] arr = str.toCharArray();
		
		for (int i=0; i < arr.size; i++)
		{
			for (int j=i; j < size; j++)
			{
				
			}
		}
		
		
		

	}

}
