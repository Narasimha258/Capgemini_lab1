package com.cg.exception.lab5;

import java.util.Scanner;

public class Enployee {
	public static void main(String[] args) {
		System.out.println("Enter the Salary of an Employee:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try
		{
			if(n<=3000)
				throw new EmployeeException("Employers Salary should be more than 3000");
			else
				System.out.println("You are getting Salary more than 3000");
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}

	}

}
class EmployeeException extends Exception
{
	EmployeeException(String s)
	{
		System.out.println(s);
	}
}
