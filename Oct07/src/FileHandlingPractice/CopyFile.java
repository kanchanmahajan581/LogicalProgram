package FileHandlingPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	
	public static void main(String[] args) throws IOException {
		
		
			
			FileInputStream fr=new FileInputStream("C:\\Users\\Yash\\Desktop\\presistancejava\\Oct07\\KK.txt");
			FileOutputStream fw=new FileOutputStream("C:\\Users\\Yash\\Desktop\\presistancejava\\Oct07\\User.txt");
			
			
				int i=-1;
				while((i=fr.read())!=-1)
				{
					fw.write((char)i);
				}
				fr.close();
				
				fw.close();				
			
			
			System.out.println("copy file successfully:");
			
	}		

}
