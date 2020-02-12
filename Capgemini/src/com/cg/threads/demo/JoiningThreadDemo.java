package com.cg.threads.demo;

public class JoiningThreadDemo extends Thread{
	public static void main(String args[])
	{
		Thread t1=new Thread("First");
		Thread t2=new Thread("Second");
		t1.start();t2.start();
		System.out.println("Thread starts executing");
		try
		{
			t1.join();
			System.out.println("Thread t1 is hols until t2 executes");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		t2.start();
		
		
	}
	public void run()
	{
		System.out.println("Hello Welcome");
	}
	
	

}
