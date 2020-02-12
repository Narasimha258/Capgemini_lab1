package com.cg.lab10.questions;

import java.util.function.Predicate;

public class Factorial {
	public static void getFactorial(int num)
	{
		int result=1;
		for(int i=1;i<=num;i++)
		{
			result=result*i;
		}
		System.out.println(result);
		
	}
	}


