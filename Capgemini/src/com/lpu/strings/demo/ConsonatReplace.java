package com.lpu.strings.demo;

public class ConsonatReplace {
	public String replaceConsonant(String s)
	{
		StringBuffer s1=new StringBuffer(s);
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				s1.setCharAt((i), s1.charAt(i+1));
			}
		}
		String str=new String(s1);
		return str;
	}


}
