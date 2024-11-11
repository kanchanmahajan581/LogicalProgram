package com.string;

public class ReplaceChar {
	
	public static void main(String[] args) {
		
		String str="Kanchan";
		char target='a';
		char replace='@';
		int count=0;
		
		StringBuffer br=new StringBuffer(str);
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==target)
			{
				count++;
			
			if(count>=1)
			{
				br.setCharAt(i, replace);
//				break;
			}
			}
		}
		System.out.println("orginal string"+str);
		System.out.println("Final String"+br.toString());
	}

}
