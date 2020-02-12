package com.cg.lab7.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Grading {
	public static HashMap getGrades(HashMap map)
	{
		Set e = map.entrySet();
		Iterator it=e.iterator();
		HashMap<Integer,String> out=new HashMap<>();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			Integer val=(int)me.getValue();
			if(val>=90)
			{
				out.put((Integer) me.getKey(), "Gold");
			}
			else if(val<=89 && val>=80)
			{
				out.put((Integer) me.getKey(), "Silver");
			}
			else if(val<=79 && val>=70)
			{
				out.put((Integer) me.getKey(), "Bronze");
			}
		}
		return out;
	}
	public static void main(String args[])
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(11606685, 75);
		map.put(11606106, 81);
		map.put(11612587, 90);
		map.put(11605435, 70);
		System.out.println(getGrades(map));
	}

}
