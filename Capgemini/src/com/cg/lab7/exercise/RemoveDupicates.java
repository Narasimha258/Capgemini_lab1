package com.cg.lab7.exercise;

import java.util.TreeSet;

public class RemoveDupicates {
	public static void modifyArray(int[] arr)
	{
		TreeSet<Integer> s=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			s.add(arr[i]);
		}
		System.out.println(s);
	}
	public static void main(String args[])
	{
		RemoveDupicates r=new RemoveDupicates();
		int arr[]={8,5,7,4,5,3,4,3};
		r.modifyArray(arr);
		
	}

}
