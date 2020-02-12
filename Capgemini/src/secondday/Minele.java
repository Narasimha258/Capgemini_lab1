package secondday;

public class Minele {
	public void getSmallest(int[] arr){
		{
			int temp;
			for(int i=0;i<arr.length;i++)  
			{
				for(int j=i+1;i<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println("Smallest elemnts is:"+arr[0]);
			
		}

	}
	


}
