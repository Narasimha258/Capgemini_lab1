package com.cg.lab1.questions;

public class Increase {
     public void increaseMethod(int num)
     {
    	 int PrevoiusNumber=9;
    	 boolean statement=true;
 		while(num!=0)
 		{
 			int CurrentNumber=num%10;
 			num=num/10;
 			if(CurrentNumber>PrevoiusNumber)
 			{
 				statement=false;
 				break;
 			}
 			PrevoiusNumber=CurrentNumber;
 		}
 		System.out.println(statement);
     }

}
