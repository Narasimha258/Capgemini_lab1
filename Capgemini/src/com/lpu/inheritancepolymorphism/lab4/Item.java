package com.lpu.inheritancepolymorphism.lab4;

public abstract class Item {
	private int identification_number;
	private String  title;
	private int number_of_copies;
	abstract void show(int number_of_copies);
	void titleShow(String title)
	{
		System.out.println(title);
	}
	void identificationNumber(int identification_number )
	{
		System.out.println(identification_number);
	}
	

}
