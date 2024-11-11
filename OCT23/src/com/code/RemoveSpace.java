package com.code;

public class RemoveSpace {
	public static void main(String[] args) {
		
		String str="bhfy tiun  mhut878 hxguk,nmakuys98 vgtd56s8iajsnmbyu57hb ";
		
		char arr[]=str.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=' ')
			{
				System.out.print(arr[i]);
			}
		}
				
				
	}

}
