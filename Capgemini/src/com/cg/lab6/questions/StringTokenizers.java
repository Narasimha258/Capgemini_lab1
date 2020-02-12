package com.cg.lab6.questions;
import java.util.StringTokenizer; 
public class StringTokenizers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer s=new StringTokenizer("1 2 3 4 5 6 7 8 9 10"," ");
		int sum=0;
		while(s.hasMoreTokens())
		{
			String s1=s.nextToken();
			 sum=sum+Integer.parseInt(s1);
		}
		System.out.println(sum);

	}
}
