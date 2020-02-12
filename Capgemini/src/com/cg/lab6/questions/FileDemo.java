package com.cg.lab6.questions;
import java.io.*;
import java.util.Scanner;
public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		File f=new File(str);
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
        System.out.println(f.length());
        System.out.println(f.getClass());
	}

}
