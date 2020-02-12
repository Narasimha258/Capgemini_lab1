package com.lpu.strings.demo;

public class Getchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String s="Helo Dear Good Morning";
		char a[]=new char[9-5];
		s.getChars(5, 9, a, 0);
		System.out.println(a);
		String s1="Hello";
		String s2="hello";
		String s3="HELLO";
		String s4="hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s1.startsWith("He"));
		System.out.println(s3.endsWith("LO"));*/
		
		String a1="Good";
		String a2=new String("Good");
		//System.out.println("Equals() versus == ");
		System.out.println("By using equals:"+a1.equals(a2));
		System.out.println("By using ==:"+(a1==a2));
		

	}

}
