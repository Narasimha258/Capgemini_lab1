package com.cg.collections.demo;
import java.util.*;
public class Student {
	public String name;
	Student(String n)
	{
		name=n;
	}
	public String toString()
	{
		return name;
	}
	public static void main(String args)
	{
		Student s1=new Student("Rajesh");
		List<Student> s=new ArrayList<>();
		s.add(s1);
		s.add(new Student("Kamal"));
		s.add(new Student("Suresh"));
		s.add(new Student("Kamal"));
		Set<Student> m=new HashSet<>(s);
		System.out.println(m);
		
	}

}
