package thirdclass;

import java.io.FileNotFoundException;

public class ThrowDemo {
	void proc() throws FileNotFoundException
	{
		try
		{
			throw new FileNotFoundException("From Exception"); 
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Caught inside demopronc");
			throw e;
		}
	}
	public static void main(String args[])
	{
		ThrowDemo t=new ThrowDemo();
		try
		{
			t.proc();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Recaught"+e);
		}
	}

}
