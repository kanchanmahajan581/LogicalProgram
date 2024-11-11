package com.string;

public class RemoveSpace {
	
	public static void main(String[] args) {
		
		String str="ja  va i s a jgy utub";
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				System.out.print(str.charAt(i)+"");
			}
		}
	}

}
