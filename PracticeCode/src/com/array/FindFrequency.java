package com.array;

public class FindFrequency {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,2,3,4,1,3,3};
		
		int fre[]=new int[arr.length];
		int visited=-1;
		
		for(int i=0; i<arr.length; i++)
		{
			int count=1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					fre[j]=visited;
										
				}
				if(fre[i]!=visited)
				{
					fre[i]=count;
				}
			}
		}
		for(int i=0; i<fre.length; i++)
		{
			if(fre[i]!=visited)
			{
				System.out.print("Element Frequency");
				System.out.println(arr[i]+" "+fre[i]);
			}
		}
	}

}
