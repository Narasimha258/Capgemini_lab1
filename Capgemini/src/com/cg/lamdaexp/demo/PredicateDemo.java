package com.cg.lamdaexp.demo;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> isALongWord = t -> t.length() > 10;
		String s="Succesfully";
		boolean b=isALongWord.test(s);
		System.out.println(b);

	}

}
