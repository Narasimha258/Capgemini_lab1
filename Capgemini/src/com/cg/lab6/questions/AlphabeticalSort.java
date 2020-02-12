package com.cg.lab6.questions;

public class AlphabeticalSort {
	public static void main(String args[])
	{
		AlphabeticalSort a=new AlphabeticalSort();
		System.out.println(a.charSorting("POLICE"));
		System.out.println(a.charSorting("ANT"));
		System.out.println(a.charSorting("NARASIMHA"));
		System.out.println(a.charSorting("Ramesh"));
	}
	public boolean charSorting(String s)
	{
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
					return false;
			}
		}
		return true;
		
	}

}
