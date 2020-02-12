package com.cg.lab10.questions;

public class SpacingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spacing s1=(String s)->{
			String output="";
			for(int i=0;i<s.length();i++)
			{
				output=output+s.charAt(i)+" ";
			}
			
		return output;	
		};
		System.out.println(s1.getSpacing("Null"));

	}

}
