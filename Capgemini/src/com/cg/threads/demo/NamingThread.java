package com.cg.threads.demo;

public class NamingThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamingThread m1=new NamingThread();
		NamingThread m2=new NamingThread();
		NamingThread m3=new NamingThread();
	System.out.println("Thread1 name is:"+m1.getName());
	m1.setName("Thread1");
	m1.setPriority(MAX_PRIORITY);
	System.out.println("Name of m1 after changing:"+m1.getName());
	System.out.println("Thread1 name is:"+m2.getName());
	m2.setName("Thread2");
	m2.setPriority(NORM_PRIORITY);
	System.out.println("Name of m2 after changing:"+m2.getName());
	m2.setName("Thread3");
	m3.setPriority(MIN_PRIORITY);
	System.out.println("Name of m3 after changing:"+m3.getName());
	m1.start();
	m2.start();
	m3.start();

	}
	public void run()
	{
		for(char i='A' ;i<'Z';i++)
		{
		System.out.println(i);
		}
	}

}
