package com.cg.lab7.exercise;

import java.util.HashMap;
import java.util.Iterator;

public class OcuurenceOfChar {
	public static HashMap countChar(char[] array)
	{
		HashMap<Character,Integer> map=new HashMap<>();
		for(char x:array)
		{
			if(map.containsKey(x))
			{
				int val=map.get(x);
				map.put(x, val+1);
			}
			else
			{
				map.put(x, 1);
			}
		}
		return map;
		
	}
	public static void main(String args[])
	{
		OcuurenceOfChar c=new OcuurenceOfChar();
		char array[]={'A','P','P','L','E'};
		HashMap<Character,Integer> m=countChar(array);
		Iterator it=m.keySet().iterator();
		while(it.hasNext())
		{
			Object key=it.next();
			System.out.println(key+":"+m.get(key));
		}
		
	}

}
