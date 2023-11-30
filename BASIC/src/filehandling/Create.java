package filehandling;

import java.io.File;
import java.io.IOException;

public class Create {

	public static void main(String[] args) throws IOException 
	{
		
		File f=new File("demo.txt");
		if(f.exists())
		{
			System.out.println("already exists");
		}
		else
		{
			f.createNewFile();
		}

	}

}
