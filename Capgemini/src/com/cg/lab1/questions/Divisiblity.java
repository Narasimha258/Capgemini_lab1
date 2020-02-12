package com.cg.lab1.questions;

public class Divisiblity {
	public void checkNumber(int n)
	{
		for(int i=0;i<n;i++)
		{
		if(i%3==0|| i%5==0)
		{
			System.out.println("The Number is divible by (3 or 5) is:"+i);
		}
		}
	}

}
