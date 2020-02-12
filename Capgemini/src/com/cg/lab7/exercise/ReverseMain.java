package com.cg.lab7.exercise;

import java.util.Random;
import java.util.Scanner;

public class ReverseMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("Ente the size of array:");
	//	int n=sc.nextInt();
		int array[]={21,30,35,10,55};
		//for(int i=0;i<array.length;i++)
	//	{
	//		Random r=new Random(100);
	//		array[i]=r.nextInt();
		
		ReverseSorting r=new ReverseSorting();
		int a[]=r.reverseArray(array);
		for(int x:a)
		{
			System.out.println(x);
		}
		
		}

	}


