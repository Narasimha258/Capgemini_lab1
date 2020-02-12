package secondday;
import java.util.Scanner;
public class Bankaccount {
	private String name;
	private String acc;
	private long bal;
	Scanner sc=new Scanner(System.in);
	
	void createDetails()
	{
		System.out.println("Enter the name of Account Holder:");
		name=sc.next();
		System.out.println("Enter Account Number:");
		acc=sc.next();
		System.out.println("Enter the balance:");
		bal=sc.nextLong();
	}
	void displayDetails()
	{
		System.out.println("The Name is:"+ name +"\n Account Number is:"+ acc+ "Balance is:"+ bal);
	}
	void creditBal()
	{
		long cred;
		System.out.println("Enter the Amount you want to credit:");
		cred=sc.nextLong();
		bal=bal+cred;
	}
	void withDraw()
	{
		long wt;
		System.out.println("Enter the Amount to withdraw:");
		wt=sc.nextLong();
		if(bal>=wt)
		{
			bal=bal-wt;
			System.out.println("Available Balance is:"+bal);
		}
		else
		{
			System.out.println("Insufficent Balance");
		}
	}
	

}
