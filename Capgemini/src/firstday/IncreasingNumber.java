package firstday;
import java.util.Scanner;
public class IncreasingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int PrevoiusNumber=9;
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean statement=true;
		while(num!=0)
		{
			int CurrentNumber=num%10;
			num=num/10;
			if(CurrentNumber>PrevoiusNumber)
			{
				statement=false;
				break;
			}
			PrevoiusNumber=CurrentNumber;
		}
		System.out.println(statement);
		
		
		

	}

}
