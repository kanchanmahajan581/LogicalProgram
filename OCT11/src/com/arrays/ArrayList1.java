package com.arrays;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Grapes");
		list.add("Orange");
		
		if(!list.isEmpty())
		{
			String f=list.get(0);
			String l=list.get(list.size()-1);
			
			System.out.println("First Element "+f);
			System.out.println("Last Element "+l);
		}
		else
		{
			System.out.println("ArrayList is Empty");
		}
	}

}
