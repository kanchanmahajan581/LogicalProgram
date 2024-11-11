package FileHandlingPractice;

import java.io.File;

public class CreateFile {
	
	public static void main(String[] args) {
		
		try {
			
			File f=new File("C:\\Users\\Yash\\Desktop\\presistancejava\\Oct07\\User.txt");
			
			if(f.createNewFile())
			{
				System.out.println("Create Successfully");
			}
			else
			{
				System.out.println("File not Created");
			}
			
		} catch (Exception e) {
			System.out.println("Exception");
			
		}
	}

}
