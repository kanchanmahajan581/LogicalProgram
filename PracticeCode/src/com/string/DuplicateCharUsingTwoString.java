package com.string;

public class DuplicateCharUsingTwoString {
	
	public static void main(String[] args) {
		
		String s1="Kanchan";
		String s2="Laxmi";
		
		for(int i=0; i<s1.length(); i++)
		{
			for(int j=0; j<s2.length(); j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					System.out.println(s1.charAt(i));
				}
			}
		}
	}

}
