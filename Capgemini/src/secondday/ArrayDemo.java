package secondday;

public class ArrayDemo {
	int intNumbers[];
	ArrayDemo(int i)
	{
		intNumbers=new int[i];
	}
	void populateArray()
	{
		for(int i=0;i<intNumbers.length;++i)
		{
			intNumbers[i]=i;
		}
	}
	void displayContents()
	{
		for(int i=0;i<intNumbers.length;++i)
		{
			System.out.println("Number is"+ i+":"+intNumbers[i]);
		}
	}
	public static void main(String args[])
	{
		//int intArg = Integer.parseInt(args[0]);
		ArrayDemo ad = new ArrayDemo(10);
		ad.displayContents();
		ad.populateArray();
		ad.displayContents();

	}

}
