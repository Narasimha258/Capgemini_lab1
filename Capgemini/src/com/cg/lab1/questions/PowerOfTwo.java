package com.cg.lab1.questions;

public class PowerOfTwo {
	static void twoMultiple(int num)
	{
		int flag=1;
		while(num!=1)
		{
			if(num%2!=0)
			{
				flag=0;
				break;
			}
			num=num/2;
		}
		if(flag==1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
