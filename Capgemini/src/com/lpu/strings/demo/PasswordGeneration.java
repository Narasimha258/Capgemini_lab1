package com.lpu.strings.demo;

public class PasswordGeneration {

	public static void main(String[] args) {
		generatePassword("Anoop","anil",14385,2);
		// TODO Auto-generated method stub

	}
	static void generatePassword(String s1,String s2,int num,int n)
	{
		String password="";
		int len=s1.length();
		int len2=s2.length();
		if(len<len2)
		{
			password=s1.charAt(len-1)+s2+Regular(num,n)+Reverse(num,n);
			System.out.println("The Password is:"+password);
		}
		else
		{
			password=s2.charAt(len2-1)+s1+Regular(num,n)+Reverse(num,n);
			System.out.println("The Password is:"+password);
		}
		System.out.println(caseConversion(password));
	}
	static char Reverse(int num,int n)
	{
		int rev=0;
		while(num!=0)
		{
			int last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		String s=String.valueOf(rev); 
		char c=s.charAt(n-1);
		return c;
		
	}
	static char Regular(int num,int n)
	{
		String s1=String.valueOf(num);
		char c1=s1.charAt(n-1);
		return c1;
	}
	static String caseConversion(String s)
	{
		String output="";
		int len=s.length();
		for(int i=0;i<len;i++)
		{
		
			if(s.toCharArray()[i]>='a' && s.toCharArray()[i]<='z')
			{
				output=output+(char)(s.toCharArray()[i]-32);
			}
			else if(s.toCharArray()[i]>='A' && s.toCharArray()[i]<='Z')
			{
				output=output+(char)(s.toCharArray()[i]+32);
			}
			else
			{
				output=output+(char)(s.toCharArray()[i]);
			}
		}
		return output;
	}
	

}
