package com.code;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Test2 {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<Integer> list=new LinkedHashSet<Integer>();
		
		
		
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(7);
		
		
		for(Integer i: list)
		{
			
			System.out.println(i);
		}
		
//		LinkedHashSet<Integer> list1=new LinkedHashSet<Integer>();
//		
//		Collections.addAll(list, 1,2,5,5,3,2,1,4,5,7);
//		
//		for(Integer i : list1)
//		{
//			System.out.println(list);
//		}
		
		
		
	}
	
	

}
