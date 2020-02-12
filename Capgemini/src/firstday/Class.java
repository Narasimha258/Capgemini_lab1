package firstday;

public class Class {
	String name;
	int amount;
	String col;
	public void setData(String name,int amount,String col)
	{
		this.name=name;
		this.amount=amount;
		this.col=col;
	}
	public void getData()
	{
		System.out.println(this.name);
		System.out.println(this.amount);
		System.out.println(this.col);
		
	}

}
