package com.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(5);
		
		Set<Integer> set=new HashSet<>(list);
		for(int num: set)
		{
			System.out.println(num);
		}
		
	}

}
