package com.string;

public class GivenStringWithOutUsingMethod {
	
	public static void main(String[] args) {
		
		String s="aBACbcEDed";
		StringBuilder lowerCase=new StringBuilder();
		StringBuilder upperCase=new StringBuilder();
		
		for(char c :s.toCharArray())
		{
			if(Character.isLowerCase(c))
			{
				lowerCase.append(c);
			}
			else
			{
			upperCase.append(c);
			}
		}
		System.out.println(lowerCase);
		System.out.println(upperCase);
				
	}

}
