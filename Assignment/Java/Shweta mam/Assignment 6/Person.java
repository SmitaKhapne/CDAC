package org.assignment;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class StudentDetails
{
	String name;
	int age;
	
	public StudentDetails(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "name : " + this.name + " age: " + this.age;
	}
	
}

class CompareByName implements Comparator<StudentDetails>
{
	public int compare(StudentDetails s1, StudentDetails s2)
	{
		return s1.name.compareTo(s2.name);
	}
}

class CompareByAge implements Comparator<StudentDetails>
{
	public int compare(StudentDetails s1, StudentDetails s2)
	{
		return s1.age - s2.age;
	}
}


public class Person {
	
	public static void printRecord(List<StudentDetails> c)
	{
		for(StudentDetails str : c )
		{
			System.out.println(str);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		List<StudentDetails> list = new LinkedList<>();
		
		list.add(new StudentDetails("karan", 27));
		list.add(new StudentDetails("arjun", 25));
		list.add(new StudentDetails("sahil", 25));
		list.add(new StudentDetails("kunal", 30));
		
		
		printRecord(list);
		
		System.out.println("List Sort by Age");
		list.sort(new CompareByAge());
		System.out.println(list);
		
		
		System.out.println("List Sort by Name");
		list.sort(new CompareByName());
		System.out.println(list);

		
		
		

	}




}
