package FileHandlingPractice;

import java.io.File;

public class FileDeleted {
	
	public static void main(String[] args) {
		
		try {
			File f=new File("C:\\Users\\Yash\\Desktop\\presistancejava\\Oct07\\KK.txt");
			
			if(f.exists())
			{
				f.delete();
			}
			else
			{
				System.out.println("File not found");			
			}
			System.out.println("File Delete Successfully");
			
		} catch (Exception e) {
			
			System.out.println("Exception");
			
		}
	}

}
