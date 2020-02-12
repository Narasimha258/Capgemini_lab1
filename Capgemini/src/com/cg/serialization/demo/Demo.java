package com.cg.serialization.demo;
import java.io.*;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) {
		try
		{
			Student s1=new Student(100,"Narasimha");
			System.out.println("s1 Object is:\n"+s1);
			FileOutputStream fos=new FileOutputStream("Student");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.flush();
			oos.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try
		{
			Student s2;
			FileInputStream fis=new FileInputStream("Student");
			ObjectInputStream ois=new ObjectInputStream(fis);
			s2=(Student)ois.readObject();
			ois.close();
			System.out.println(s2);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
