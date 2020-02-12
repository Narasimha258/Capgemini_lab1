package com.cg.threads.demo;

public class ThreadDemo extends Thread{
	public static void main(String args[])
	{
	ThreadDemo s=new ThreadDemo();
	s.start();
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
	    {
		System.out.println(i);
	    }
		
	}

}
