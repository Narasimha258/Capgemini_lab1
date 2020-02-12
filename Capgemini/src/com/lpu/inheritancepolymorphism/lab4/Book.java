package com.lpu.inheritancepolymorphism.lab4;

public class Book extends WrittenItem {
	public String bookName,authorname;
	public void authorName(String bookName, String author)
	{
		System.out.println("The Name of Author is:"+author);
		System.out.println("The Name of Book is:"+bookName);
	}
	

}
