package com.cg.lab6.questions;

import java.time.LocalDate;
import java.time.Period;

public class PrintDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1=LocalDate.of(1997, 05, 8);
		LocalDate d2=LocalDate.now();
		//System.out.println(d2);
		Period df=Period.between(d1, d2);
		System.out.println("Days is:"+df.getDays()+" \n Months:"+df.getMonths()+"\n Years is:"+df.getYears());
		

	}

}
