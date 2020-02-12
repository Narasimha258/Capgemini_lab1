package secondday;
import java.util.Scanner;
public class ArrayMinMax {
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
		System.out.println(sortArray(arr));
		System.out.println(sortArray1(arr));
		
		
	}
	public static int sortArray(int arr[])
	{
		int temp;
		int min,max;
		for(int i=0;i<arr.length;i++)
		{
			for (int j = i + 1; j < arr.length; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }
		}
		System.out.println("Enter the number you");
		Scanner sc1=new Scanner(System.in);
		min=sc1.nextInt();
        System.out.println("Enter the nth element for maximum");
		return arr[min-1];
	
	}
	public static int sortArray1(int arr[])
	{
		int temp;
		int max;
		for(int i=0;i<arr.length;i++)
		{
			for (int j = i + 1; j < arr.length; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }
		}
		System.out.println("Enter the number you");
		Scanner sc1=new Scanner(System.in);
		max=sc1.nextInt();
		return arr[arr.length-max];
	}
	
	
}
	
		
	

	

