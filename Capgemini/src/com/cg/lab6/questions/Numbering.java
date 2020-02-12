package com.cg.lab6.questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Numbering {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int flag=1;
		FileInputStream f1=new FileInputStream("C://Users//acer//workspace//Capgemini");
		int n=f1.available();
		System.out.println(flag+":");
		for(int i=0;i<n;i++)
		{
			char c=(char)f1.read();
			System.out.println(c);
			if(c=='\n')
			{
				System.out.println(++flag+":");
			}
		}

	}

}
