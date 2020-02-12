package secondday;
import java.util.Scanner;

public class Arrayconcepts {
	public static int getSmallest(int[] a){  
		int temp;  
		for (int i = 0; i <a.length; i++)   
		        {  
		            for (int j = i + 1; j < a.length; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[0];  
		}
	public static int getLargest(int[] a){  
		int temp;  
		for (int i = 0; i < a.length; i++)   
		        {  
		            for (int j = i + 1; j < a.length; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[a.length-1];  
		}  
		
		public static void main(String args[]){  
			System.out.println("Enter the size of array");
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int a[]=new int[size];
			System.out.println("Enter the Array Elents");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
		 
		System.out.println("Smallest: "+getSmallest(a)); 
		System.out.println("Smallest: "+getLargest(a)); 
		
		}
		} 

	
   