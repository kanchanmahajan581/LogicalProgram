package com.string;

public class RemoveSpace2 {
	public static void main(String[] args) {
		
		String s="Java is a";
		for(int i=0; i<s.length(); i++)
		{ 
			if(s.charAt(i)!=' ')
			{
				System.out.print(s.charAt(i));
			}
		}
	}

}
