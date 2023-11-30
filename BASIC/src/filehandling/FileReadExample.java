package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("new.txt");
		int i;
		while((i=fin.read())!=-1)
		{
		
		System.out.println((char)i);
		}

	}

}
