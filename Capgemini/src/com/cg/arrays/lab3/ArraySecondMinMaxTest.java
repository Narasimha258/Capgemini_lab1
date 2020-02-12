package com.cg.arrays.lab3;

import java.util.Scanner;

public class ArraySecondMinMaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array Elents");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArraySecondMinMax a1=new ArraySecondMinMax();
		System.out.println(a1.getLargest(a));
		System.out.println(a1.getSmallest(a));
	 
	

	}

}
