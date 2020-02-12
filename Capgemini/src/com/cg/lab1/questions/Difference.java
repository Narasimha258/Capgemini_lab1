package com.cg.lab1.questions;

public class Difference {
	void calculateDifference(int n)
	{
	   
	    int sum1=0,sum2=0;
	    
	    for(int i=1;i<=n;i++)
	    {
	    	sum1=sum1+i^2;
	    	sum2=sum2+i;
	    }
	    int dif=sum1-(sum2)^2;
	    System.out.println("The Difference is"+dif);
	}
	

}
