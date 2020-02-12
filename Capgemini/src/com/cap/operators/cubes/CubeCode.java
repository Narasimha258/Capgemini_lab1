package com.cap.operators.cubes;

public class CubeCode {
	static int  amstrongNumber(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev+=rem*rem*rem;
			num=num/10;
		}
		return rev;
	}

}
