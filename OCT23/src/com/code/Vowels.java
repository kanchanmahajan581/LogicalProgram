package com.code;

public class Vowels {
	
	public static void main(String[] args) {
		
		String str="Kanchan";		 
		 char arr[]=str.toCharArray();
		 int count=0;
		 
		 for(int i=0; i<arr.length; i++)
		 {
			 if(arr[i]=='a' || arr[i]=='e' || arr[i]=='o' && arr[i]=='i' && arr[i]=='u' && arr[i]==' ')
			 {
				 
				 count++;
				 System.out.println(arr[i]);
			 }
		 }
		 
		 System.out.println("Total consonent => "+count);
		 
		 
	
		
	}

}
