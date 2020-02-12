package com.lpu.strings.demo;
import java.util.*;
public class Generetion {
	User[] generete(int n)
	{
		User[]generate=new User[n];
		for(int i=0;i<n;i++)
		{
			generate[i]=new User();
		}
		int count=1;
		for(char alpha=65;alpha<65+n;alpha++)
		{
			String id=(alpha+Integer.toString(count));
			generate[count-1].setId(id);
			count++;
		}
		return generate;
	}
	public static void main(String args[])
	{
		Generetion g=new Generetion();
		Scanner sc=new Scanner(System.in);
		int limit=26;
		int k=sc.nextInt();
		if(k<26)
		{
			User[] a=g.generete(k);
			for(int j=0;j<k;j++)
			{
				System.out.println(a[j].getId());
			}
		}
		else
		{
			System.out.println("Limit exceds");
		}
		
	}
	

}
