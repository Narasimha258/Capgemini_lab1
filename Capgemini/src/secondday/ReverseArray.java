package secondday;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String args[])
	{
		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elents");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=Reverse(arr[i]);
		}
		System.out.println("Before Sorting:");
		for(int x: arr1)
		{
			System.out.println(x);
		}
		sorting(arr1);
		System.out.println("After Sorting:");
		for(int x: arr1)
		{
			System.out.println(x);
		}
		
			
		
	}
	static int Reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		return rev;
	}
	static void sorting(int arr1[])
	{
		int temp;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
	}
}

