package com.cg.lab7.exercise;

import java.util.HashMap;
import java.util.Iterator;

public class SquaringArray {
	public static HashMap getSorted(int[] array)
	{
		HashMap<Integer,Integer>h=new HashMap<>();
		for(int x:array)
		{
			h.put(x, x*x);
		}
		return h;
	}
	public static void main(String args[])
	{
		int array[]={1,2,3,4,5,6,7,8,9};
		SquaringArray s=new SquaringArray();
		System.out.println(getSorted(array));
	
		
	}

}
