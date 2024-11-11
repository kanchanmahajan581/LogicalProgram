package com.arrays;

public class SumInteger {
	public static void main(String[] args) {
		
		String arr[]= {"5","9", "a","1","#","3","2"};
		int sum=0;
		
		for(String s: arr)
		{
			try {
				
				int num=Integer.parseInt(s);
				sum=sum+num;
				
			} catch (Exception e) {
				
			}
		}
		System.out.println(sum);
	}

}
