package com.cg.exception.lab5;

import java.util.Scanner;

public class Traffic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Color 1.Red\n 2.Green\n 3.Yellow");
		Scanner sc=new Scanner(System.in);
		String Bulb=sc.next();
		switch(Bulb)
		{
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		}

	}

}
