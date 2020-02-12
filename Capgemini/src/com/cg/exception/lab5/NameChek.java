package com.cg.exception.lab5;

public class NameChek {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="",secondName="";
		try
		{
			if(firstName.length()==0 && secondName.length()==0)
				throw new ValidateException("not entered");
		}
		catch(ValidateException e)
		{
			System.out.println(e);
		}
		

	}

}
class ValidateException extends Exception{
	public ValidateException(String mes)
	{
		//super(mes);
		System.out.println(mes);
	}
	//public String toString()
	//{
	//	return("Not Written");
	//}
}
