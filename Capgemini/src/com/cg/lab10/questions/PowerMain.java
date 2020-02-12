package com.cg.lab10.questions;
public class PowerMain {
	public static void main(String args[])
	{
		Powering p=(a,b)->{
			double d=Math.pow(a, b);
			return d;
		};
		System.out.println(p.addNumbers(2, 2));
	}
}
