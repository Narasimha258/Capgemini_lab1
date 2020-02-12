package com.cg.lab10.questions;

import java.util.Scanner;

public class MainTest {
	public static void main(String args[])
	{
		//System.out.println("Enter the UserName:");
		//System.out.println("Enter the Password:");
		//Scanner sc=new Scanner(System.in);
		//String user=sc.next();
		//String pass=sc.next();
		String userinput="11606685";
		String passinput="Narasimha258";
		StringAuthentication v=(String user,String pass)->
		{
			if(user.equals(userinput) && pass.equals(passinput))
				return true;
			else
				return false;
		};
		System.out.println(v.authenticateString("11606685", "Narasimha258"));
	}

}
