package com.cg.threads.demo;
import java.util.*;
public class SleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>l=new ArrayList<>();
		l.add("Narasimha");
		l.add("Rajesh");
		l.add("Faculty");
		l.add("System");
		for(String x:l)
		{
			try
			{
				Thread.sleep(4000);
				System.out.println(x);
			}
			catch(InterruptedException exp)
			{
				exp.printStackTrace();
			}
			
		}

	}

}
