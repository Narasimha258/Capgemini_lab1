package thirdclass;
import java.util.Scanner;
public class Prime {
	public static void main(String args[])
	{
		System.out.println("Enter the size of Integer");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
			else
			{
				count=0;
			}
		}
		
	}
}
