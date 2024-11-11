package com.code23;

public class StringPermutation {
	
	public static void per(String str , String pre)
	{
		if(str.length()==0)
		{
			System.out.println(pre);
		}
		else
		{
			for(int i=0; i<str.length(); i++)
			{
				String rem=str.substring(0, i)+str.substring(i+1);
				per(rem, pre+str.charAt(i));
			}
		}
	}	
	
	public static void main(String[] args) {
		
		String str="abc";
		per(str, "");
		
	}
	
	
	
	}


