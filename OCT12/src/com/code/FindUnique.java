package com.code;

public class FindUnique {
	
	public static void main(String[] args) {
		
		int a[]= {1,1,2,2,3,2,4,5,5};
		int freq[]=new int[a.length];
		int visited=-1;
		
		for(int i=0; i<a.length; i++)
		{
			int count=1;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited)
			{
				freq[i]=count;
			}
		}
		
		for(int i=0; i<freq.length; i++)
		{
//			if(freq[i]!=visited)
//			{
//				System.out.print("Element");
//				System.out.println(a[i]+" "+freq[i]);
//			}
			
			if(freq[i]==1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
