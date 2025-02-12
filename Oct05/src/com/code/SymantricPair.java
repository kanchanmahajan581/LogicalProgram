package com.code;

import java.util.HashMap;

public class SymantricPair {
	public static void print(int [][]arr)
	{
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++)
		{
			int f=arr[i][0];
			int s=arr[i][1];
			
			if(map.containsKey(s) && map.get(s)==f)
			{
				System.out.println("Symertic pairs ("+f+","+s+" )");				
			}
			else
			{
				map.put(f, s);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[][]= {{1,2},{3,5},{2,1}};
		System.out.println("Symantric Pairs");
		
		print(arr);
	}

}
