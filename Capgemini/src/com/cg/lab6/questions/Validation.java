package com.cg.lab6.questions;

public class Validation {
	public boolean validate(String s)
	{
		if(s.endsWith("_job")&& s.length()>11)
		{
			return true;
		}
		return false;
	}
		
}



