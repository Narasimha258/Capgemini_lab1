package com.cg.threads.demo;

public class RunnableThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnablethread t=new Runnablethread();
		Thread helloThread = new Thread(t);
		helloThread.start();


	}

}
