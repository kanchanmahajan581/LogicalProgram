package FileHandlingPractice;

import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) {
		
		try {
			
			FileReader fr=new FileReader("C:\\Users\\Yash\\Desktop\\presistancejava\\Oct07\\User.txt");
			
			try {
				
				int i=-1;
				
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
				}
				
			} finally {
				fr.close();				
			}
			
			
		} catch (Exception e) {
			System.out.println("Exception");
			
		}
	}

}
