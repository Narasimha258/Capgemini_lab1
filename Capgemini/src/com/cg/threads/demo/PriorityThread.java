package com.cg.threads.demo;

public class PriorityThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThread p1=new PriorityThread();
		PriorityThread p2=new PriorityThread();
		p1.setPriority(MAX_PRIORITY);
		p2.setPriority(NORM_PRIORITY);
		p1.start();
		p2.start();

	}
	public void run()
	{
		System.out.println("Running Thread Name is:"+Thread.currentThread().getName());
		System.out.println("Running Thread Priority is:"+Thread.currentThread().getPriority());
	}

}
