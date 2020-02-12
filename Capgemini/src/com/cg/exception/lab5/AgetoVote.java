package com.cg.exception.lab5;

import java.util.Scanner;
public class AgetoVote {
	public static void main(String[] args) {
		System.out.println("Enter the Age of a Voter:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try
		{
			if(n<18)
				throw new Validation("Un-Authorised to Participate in Eclections");
			else
				System.out.println("You are Allowed to Vote");
		}
		catch(Validation e)
		{
			System.out.println(e);
		}

	}

}
class Validation extends Exception
{
	Validation(String s)
	{
		System.out.println(s);
	}
}
