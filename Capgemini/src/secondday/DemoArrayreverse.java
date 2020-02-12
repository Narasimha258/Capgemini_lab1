package secondday;

import java.util.Scanner;

public class DemoArrayreverse {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elents");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[256];
		int rem,reverse=0;
		for(int i=0;i<arr.length;i++)
		{
			while(arr[i]!=0)
			{
				rem=arr[i]%10;
				reverse=reverse*10+rem;
				arr[i]/=10;
			}
			System.out.println(reverse);
			
		}
	}
}
		/*for(int j=0;j<arr1.length;j++)
		{
			int temp;
			for(int k=j+1;k<arr1.length;k++)
			{
				if(arr1[j]>arr1[k])
				{
					temp=arr1[j];
					arr1[j]=arr1[k];
					arr1[k]=temp;
					
				}
			}
		}
		for(int x:arr1)
		{
			System.out.println(x);
		}
	}*/


