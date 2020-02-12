package secondday;

public class Bank {
	String name,branch,gender;
	float bal=0,cred,debt;
	public void personInfo(String name,String branch,String gender)
	{
		this.name=name;
		this.branch=branch;
		this.gender=gender;
	}
	public void balanceDetails(float bal)
	{
		this.bal=bal+bal;
	}
	public void creditAmount(float cred)
	{
	    this.bal=bal+cred;
	}
	public void debitAmount(float debt)
	{
		this.bal=bal-debt;
	}
	public void getDetails()
	{
		System.out.println("Your name is"+ name);
		System.out.println("Your branch is"+branch);
		System.out.println("Gender is"+gender);
		System.out.println("your current bal is:"+bal);
	
	}
	

}
