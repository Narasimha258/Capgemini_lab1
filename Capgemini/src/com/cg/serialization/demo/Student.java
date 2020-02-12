package com.cg.serialization.demo;
import java.io.Serializable;
public class Student implements Serializable{
	int roll;
	String name;
	Student(int r,String s)
	{
		roll=r;
		name=s;
	}
	public String toString()
	{
		return "Roll no is:"+" "+roll+"Name is:"+" "+name;
	}

}
