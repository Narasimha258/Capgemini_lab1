package com.cg.lab6.questions;

public class OvwelReplace {
	public String replaceConsonant(String s)
	{
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!='A'&&a[i]!='E'&&a[i]!='I'&&a[i]!='O'&&a[i]!='U'&&a[i]!=' '){
				a[i]++;
				//System.out.println(a[i]);
			}
		}
		String s1=String.valueOf(a);
		return s1;
		
	}
	
}
