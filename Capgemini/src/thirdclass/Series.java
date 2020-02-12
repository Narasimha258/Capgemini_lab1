package thirdclass;

public class Series {
	int arr[];
	public Series(int n)
	{
		//int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number is:"+i);
			}
		}
	}
	
}

