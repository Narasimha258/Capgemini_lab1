package com.lpu.inheritancepolymorphism.lab4;

public class Journal extends WrittenItem{
	public String journal;
	public void jouralDisplay(String j)
	{
		journal=j;
		System.out.println("Name of Jouranl is:"+journal);
	}
	public void authorName(String author)
	{
		System.out.println("Author Name of Jouranal is:"+author);
	}

}
