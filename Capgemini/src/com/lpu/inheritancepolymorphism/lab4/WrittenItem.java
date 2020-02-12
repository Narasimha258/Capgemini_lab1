package com.lpu.inheritancepolymorphism.lab4;

public abstract class WrittenItem extends Item{
	private String author;
	public void show(int number_of_copies)
	{
		System.out.println("The no of Copies is:"+number_of_copies);
	}
	public void authorName(String author)
	{
		System.out.println("Author Name is:"+author);
	}
	

}
