package com.cg.lab7.exercise;
import java.util.*;
public class ReverseSorting {
	 int[] reverseArray(int[] array)
	{
		 int arr[]=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			//System.out.println(array[i]);
			StringBuilder str=new StringBuilder(Integer.toString(array[i]));
			str.reverse();
			//System.out.println(Integer.valueOf(str.toString()));
			arr[i]=(int)Integer.valueOf(str.toString());
			
			
		}
		for(int j=0;j<arr.length;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				int temp=arr[k];
				arr[k]=arr[j];
				arr[j]=temp;
			}
		}
		return arr;
	}

}
