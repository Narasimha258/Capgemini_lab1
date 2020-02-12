package thirdclass;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		System.out.println("Enter the Integer");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try
		{
			if(n<18)
				throw new Validation("Insufficient");
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