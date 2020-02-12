package com.cg.streamapi.demos;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> s1=Stream.of("L","P","U","\n");
		s1.forEach((l)->System.out.print(l));
		List<String> l1=new ArrayList<>();
		l1.add("Mumbai");l1.add("Pune");l1.add("Chennai");l1.add("UP");l1.add("MP");
		s1=l1.stream();
		s1.forEach(System.out::print);
		List<Integer> coll=Arrays.asList(new Integer[]{1,2,3,4,5});
		Stream<Integer> s2;
		s2=coll.stream();
		s2.forEach(System.out::println);
		
		//Collection Lamda
		List<String> z1=new ArrayList<>();
		z1.add("narasimha");z1.add("Kamal");z1.add("suresh");
		z1.forEach((x)->System.out.println(x));
		

	}

}
