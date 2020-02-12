package com.cg.arrays.lab3;

import java.util.Scanner;

public class ReverseArraySortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArraySort b=new ReverseArraySort();
		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elents");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		b.actualFunction(arr);

	}

}
