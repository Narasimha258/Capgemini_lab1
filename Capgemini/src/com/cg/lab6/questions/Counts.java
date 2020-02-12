package com.cg.lab6.questions;

import java.io.FileInputStream;
import java.io.IOException;

public class Counts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int nl=1,nw=0;
		char c;
		FileInputStream f1=new FileInputStream("C://Users//acer//workspace//Capgemini");
		int n=f1.available();
		System.out.println(nl+":");
		for(int i=0;i<n;i++)
		{
			 c=(char)f1.read();
			if(c=='\n')
				nl++;
			else if(c==' ')
				nw++;		
		}
		System.out.println("Total no of Lines is:"+nl);
		System.out.println("Total no of words is:"+nl+nw);
		System.out.println("Total no of Chara is:"+n);

	}

}
