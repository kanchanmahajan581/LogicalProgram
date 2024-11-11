package com.string;

import java.util.HashMap;

public class CountWordUsingMap {
	
	
	public static void wordCount(String input)
	{
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		for(String s: input.split(" "))
		{
			if(h.containsKey(s))
			{
				h.put(s, h.get(s)+1);
			}
			else
			{
				h.put(s, 1);
			}
		}
		System.out.println("Count of Word"+h);
		
	}
	
	public static void main(String[] args) {
		wordCount("Java is a Java");
		
	}

}
