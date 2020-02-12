package com.cg.lab6.questions;

public class StringReverse {
	public static void main(String args[])
	{
		StringReverse s=new StringReverse();
		s.reversePrinting();
	}
	public static void reversePrinting()
	{
		StringBuffer b=new StringBuffer("EARTH");
		System.out.println(b+"|"+b.reverse());
	}

}
